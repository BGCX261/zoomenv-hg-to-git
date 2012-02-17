package cl.ucn.disc.zoome.zui.layout;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.util.PiccoloUtil;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.util.PBounds;

// TODO Add default size. When shrinking the parent node, shrink the children
// only if all other nodes have been shrinked to their default sizes. When
// making the parent larger, expand the children until they reach their default size
// Only the nodes without default size can grow further

// Maybe use min default size and max default size
// Calculate those based on children bounds and a default pre-set value
/**
 * Aligns a set of children w.r.t. a parent. The parent is the first element in
 * the {@link YAbstractLayout#elements} list. The children are the remaining
 * elements.
 * 
 * @author jpavlich
 * 
 */
public class ListLayout extends ZUILayout<PNode> {

	private static final long serialVersionUID = 1475254435069497701L;
	private double childrenSpaceMargin = 0; // TODO Move to YElementView


	public enum Orientation {
		HORIZONTAL, VERTICAL
	}

	private Orientation orientation;

	public ListLayout() {
		this(Orientation.VERTICAL);
	}

	public ListLayout(Orientation orientation) {
		this.orientation = orientation;
	}

	abstract class Resizer {
		public abstract void resizeNode(PNode child, int childCount, double sizeDifference);
	}

	@Override
	public void update() {
		if (orientation == Orientation.VERTICAL) {
			final ResizeData rd = calculateResizeData(parent);
			LoggerUtil.instance.debug("Layout Children of: " + parent.getName());
			
			Point2D origin = parent.getBounds().getOrigin();
			origin.setLocation(origin.getX() + childrenSpaceMargin, origin.getY() + childrenSpaceMargin);
			Point2D offset = (Point2D) origin.clone();
			if (parent.getHeight() < rd.totalMinHeight) { // Parent height must be able to satisfy the minHeight constraint for all children
				parent.getBoundsReference().height = rd.totalMinHeight;
			}
			int visibleChildCount = 0;
			for (PNode child : rd.zuiVisibleNodes) {
				PBounds b = child.getBounds();
				updatePos(child, b, offset, rd);
				updateWidth(child, b);
				updateHeight(child, b, rd);
				child.setBounds(b);
				offset.setLocation(offset.getX(),offset.getY() + b.getHeight());
				visibleChildCount++;
			}
			


		} else if (orientation == Orientation.HORIZONTAL) {
			// TODO Horizontal
		}

	}

	private void updateHeight(PNode child, PBounds b, ResizeData rd) {
		if (parent.getHeight() != rd.totalChildrenHeight) { 
			double childHeightRatio = child.getHeight() / rd.totalChildrenHeight;
			b.height = parent.getHeight() * childHeightRatio;
		}
		PiccoloUtil.enforceHeight(child, b);
	}



	private void updatePos(PNode child, PBounds b, Point2D offset, ResizeData rd) {
		child.getBoundsReference().x = 0;
		child.getBoundsReference().y = 0;
		Point2D childPos = (Point2D) offset.clone();
		
		Double horizontalAlign = (Double)child.getAttribute(ElementView.ATTRIBUTE_HORIZONTAL_ALIGN);
		if (horizontalAlign != null) {
			childPos.setLocation(childPos.getX() + horizontalAlign * (parent.getWidth() - b.getWidth()), childPos.getY());
		}

		Double verticalAlign = (Double)child.getAttribute(ElementView.ATTRIBUTE_VERTICAL_ALIGN);
		if (verticalAlign != null && rd.numZUIVisibleChildren == 1) {
			childPos.setLocation(childPos.getX(), childPos.getY()  + verticalAlign * (parent.getHeight() - b.getHeight())   );
		}

		
		child.getTransformReference(true).setOffset(childPos.getX(), childPos.getY());
	}

	private void updateWidth(PNode child, PBounds b) {
		Double widthRatioToParent = (Double) child.getAttribute(ElementView.ATTRIBUTE_WIDTH_RATIO_TO_PARENT);
		if (widthRatioToParent != null) {
			PBounds pb = (PBounds) child.globalToLocal(parent.getGlobalBounds());
			b.width = pb.getWidth() * widthRatioToParent;
		}
		PiccoloUtil.enforceWidth(child, b);
	}

	class ResizeData {

		public double numZUIVisibleChildren;
		public double totalChildrenHeight;
		public double numOversizeChildren;
		public double numChildrenWithinBounds;
		public double totalOversize;
		public List<PNode> zuiVisibleNodes;
		public double totalUndersize;
		public List<Double> sizeDifference;
		public double totalMinHeight;

		public ResizeData(List<PNode> zuiVisibleNodes, List<Double> sizeDifference, double numZUIVisibleChildren, double totalChildrenHeight, double numOversizeChildren,
				double numChildrenWithinBounds, double totalOversize, double totalUndersize, double totalMinHeight) {
			super();
			this.zuiVisibleNodes = zuiVisibleNodes;
			this.sizeDifference = sizeDifference;
			this.numZUIVisibleChildren = numZUIVisibleChildren;
			this.totalChildrenHeight = totalChildrenHeight;
			this.numOversizeChildren = numOversizeChildren;
			this.numChildrenWithinBounds = numChildrenWithinBounds;
			this.totalOversize = totalOversize;
			this.totalUndersize = totalUndersize;
			this.totalMinHeight = totalMinHeight;
		}

	}

	private ResizeData calculateResizeData(PNode parent) {
		double totalChildrenHeight = 0;
		double numZUIVisibleChildren = 0;
		double numOversizeChildren = 0;
		double numChildrenWithinBounds = 0;
		double totalOversize = 0;
		double totalUndersize = 0;
		double totalMinHeight = 0;
		List<PNode> nodes = new ArrayList<PNode>();
		List<Double> sizeDifference = new ArrayList<Double>();
		for (int i = 0; i < parent.getChildrenCount(); i++) {
			PNode child = parent.getChild(i);
			if ((child.getVisible() && !(child instanceof ElementView))
					|| (child instanceof ElementView && ((ElementView) child).getLayoutManager().isZUIVisible())) {
				totalChildrenHeight += child.getHeight();
				if (child.getGlobalTranslation().getY() - parent.getGlobalTranslation().getY() + child.getHeight() < parent.getHeight()) {
					numChildrenWithinBounds++;
				}
				Double minHeight = getMinHeight(child);
				if (child.getHeight() > minHeight) {
					totalOversize += child.getHeight() - minHeight;
					numOversizeChildren++;
				} else {
					totalUndersize += minHeight - child.getHeight();
				}
				sizeDifference.add(minHeight - child.getHeight());
				totalMinHeight+=minHeight;
				
				numZUIVisibleChildren++;
				nodes.add(child);
			}
		}

		return new ResizeData(nodes, sizeDifference, numZUIVisibleChildren, totalChildrenHeight, numOversizeChildren, numChildrenWithinBounds, totalOversize, totalUndersize, totalMinHeight);
	}

	private Double getMinHeight(PNode child) {
		Double minHeight = (Double) child.getAttribute(ElementView.ATTRIBUTE_MIN_HEIGHT);
		if (minHeight == null) {
			minHeight = ElementView.DEFAULT_MIN_HEIGHT;
		}
		return minHeight;
	}

}
