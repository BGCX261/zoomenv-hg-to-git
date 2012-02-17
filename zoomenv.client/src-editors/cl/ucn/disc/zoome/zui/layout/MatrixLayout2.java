package cl.ucn.disc.zoome.zui.layout;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.zoome.services.LoggerUtil;
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
public class MatrixLayout2 extends ZUILayout<PNode> {

	private static final long serialVersionUID = 1475254435069497701L;
	private double childrenSpaceMargin = 0; // TODO Move to YElementView

	private boolean fitLast = true;

	public enum Orientation {
		HORIZONTAL, VERTICAL
	}

	private Orientation orientation;
	private int maxNodesPerRowOrColumn;

	public MatrixLayout2() {
		this(Orientation.VERTICAL, 1);
	}

	public MatrixLayout2(Orientation orientation, int maxWidthOrHeight) {
		this.orientation = orientation;
		this.maxNodesPerRowOrColumn = maxWidthOrHeight;
	}

	public double distanceFromChildOriginToBottom(PNode parent, PNode child) {
		Point2D posChild = child.getGlobalTranslation();
		Point2D posParent = parent.getGlobalTranslation();

		PBounds b = parent.getGlobalBounds();
		double h = b.getHeight() - (posChild.getY() - posParent.getY());
		b.x = posChild.getX();
		b.y = posChild.getY();
		b.height = h;

		return child.globalToLocal(b).getHeight();

	}

	abstract class Resizer {
		public abstract void resizeNode(PNode child, int childCount);
	}

	private boolean childIsInLastRow(final ResizeData rd, int childCount) {
		return fitLast && childCount >= rd.numZUIVisibleChildren / maxNodesPerRowOrColumn - 1 && childCount >= maxNodesPerRowOrColumn;
	}

	@Override
	public void update() {
		if (orientation == Orientation.VERTICAL) {

			final ResizeData rd = calculateResizeData(parent, 1.0);
			LoggerUtil.instance.debug("Layout Children of: " + parent.getName());

			final double requiredResize = rd.totalChildrenHeight - parent.getHeight();
			Resizer r;
			if (requiredResize < rd.totalOversize - rd.totalUndersize) {
				r = new Resizer() {
					@Override
					public void resizeNode(PNode child, int childCount) {
						if (childIsInLastRow(rd, childCount)) {
							child.setHeight(distanceFromChildOriginToBottom(parent, child));
						} else if (child.getHeight() > ElementView.DEFAULT_MIN_HEIGHT) {
							child.setHeight(child.getHeight() - (requiredResize + rd.totalUndersize) / rd.numOversizeChildren);
						} else {
							child.setHeight(ElementView.DEFAULT_MIN_HEIGHT);
						}
					}

				};
			} else if (requiredResize > rd.totalOversize - rd.totalUndersize) {
				r = new Resizer() {
					@Override
					public void resizeNode(PNode child, int childCount) {
						if (childIsInLastRow(rd, childCount)) {
							child.setHeight(distanceFromChildOriginToBottom(parent, child));
						} else {
							child.setHeight(child.getHeight() - (requiredResize) / rd.numZUIVisibleChildren);
						}
					}

				};
			} else {
				return;
			}

			int col = 0;
			double maxHeight = 0;

			Point2D origin = parent.getBounds().getOrigin();
			origin.setLocation(origin.getX() + childrenSpaceMargin, origin.getY() + childrenSpaceMargin);
			Point2D offset = (Point2D) origin.clone();

			int visibleChildCount = 0;
			for (PNode child : rd.zuiVisibleNodes) {

				updateWidth(child);

				updatePos(child, offset, rd);
				
				r.resizeNode(child, visibleChildCount);
				// offset.setLocation(offset.getX() + child.getWidth(),
				// offset.getY());

				if (child.getHeight() > maxHeight) {
					maxHeight = child.getHeight();
				}

				col++;
				if (col >= maxNodesPerRowOrColumn) {
					col = 0;
					offset.setLocation(origin.getX(), offset.getY() + maxHeight);

					maxHeight = 0;
				}
				visibleChildCount++;
			}

		} else if (orientation == Orientation.HORIZONTAL) {
			// TODO Horizontal
		}

	}

	private void updatePos(PNode child, Point2D offset, ResizeData rd) {
		child.getBoundsReference().x = 0;
		child.getBoundsReference().y = 0;
		Point2D childPos = (Point2D) offset.clone();
		
		Double horizontalAlign = (Double)child.getAttribute(ElementView.ATTRIBUTE_HORIZONTAL_ALIGN);
		if (horizontalAlign != null) {
			childPos.setLocation(childPos.getX() + horizontalAlign * (parent.getWidth() - child.getWidth()), childPos.getY());
		}

		Double verticalAlign = (Double)child.getAttribute(ElementView.ATTRIBUTE_VERTICAL_ALIGN);
		if (verticalAlign != null && rd.numZUIVisibleChildren == 1) {
			childPos.setLocation(childPos.getX(), childPos.getY()  + verticalAlign * (parent.getHeight() - child.getHeight())   );
		}

		
		child.getTransformReference(true).setOffset(childPos.getX(), childPos.getY());
	}

	private void updateWidth(PNode child) {
		Double widthRatioToParent = (Double) child.getAttribute(ElementView.ATTRIBUTE_WIDTH_RATIO_TO_PARENT);
		if (widthRatioToParent != null) {
			PBounds pb = (PBounds) child.globalToLocal(parent.getGlobalBounds());
			child.getBoundsReference().width = pb.getWidth() * widthRatioToParent;
		}
	}

	private void centerPNode(PNode child) {
		Point2D center = parent.getBounds().getCenter2D();
		child.getTransformReference(true).setOffset(childrenSpaceMargin, center.getY() - child.getBounds().getCenterY());
	}

	class ResizeData {

		public double numZUIVisibleChildren;
		public double totalChildrenHeight;
		public double numOversizeChildren;
		public double numChildrenWithinBounds;
		public double totalOversize;
		public List<PNode> zuiVisibleNodes;
		public double totalUndersize;

		public ResizeData(List<PNode> zuiVisibleNodes, double numZUIVisibleChildren, double totalChildrenHeight, double numOversizeChildren,
				double numChildrenWithinBounds, double totalOversize, double totalUndersize) {
			super();
			this.zuiVisibleNodes = zuiVisibleNodes;
			this.numZUIVisibleChildren = numZUIVisibleChildren;
			this.totalChildrenHeight = totalChildrenHeight;
			this.numOversizeChildren = numOversizeChildren;
			this.numChildrenWithinBounds = numChildrenWithinBounds;
			this.totalOversize = totalOversize;
			this.totalUndersize = totalUndersize;
		}

	}

	private ResizeData calculateResizeData(PNode parent, double defaultMinHeight) {
		double totalChildrenHeight = 0;
		double numZUIVisibleChildren = 0;
		double numOversizeChildren = 0;
		double numChildrenWithinBounds = 0;
		double totalOversize = 0;
		double totalUndersize = 0;
		List<PNode> nodes = new ArrayList<PNode>();
		for (int i = 0; i < parent.getChildrenCount(); i++) {
			PNode child = parent.getChild(i);
			if ((child.getVisible() && !(child instanceof ElementView))
					|| (child instanceof ElementView && ((ElementView) child).getLayoutManager().isZUIVisible())) {
				totalChildrenHeight += child.getHeight();
				if (child.getGlobalTranslation().getY() - parent.getGlobalTranslation().getY() + child.getHeight() < parent.getHeight()) {
					numChildrenWithinBounds++;
				}
				if (child.getHeight() > defaultMinHeight) {
					totalOversize += child.getHeight() - defaultMinHeight;
					numOversizeChildren++;
				} else {
					totalUndersize += defaultMinHeight - child.getHeight();
				}
				numZUIVisibleChildren++;
				nodes.add(child);
			}
		}

		return new ResizeData(nodes, numZUIVisibleChildren, totalChildrenHeight, numOversizeChildren, numChildrenWithinBounds, totalOversize, totalUndersize);
	}

}
