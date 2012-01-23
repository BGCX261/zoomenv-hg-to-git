package cl.ucn.disc.zoome.zui.view;

import java.awt.BasicStroke;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.zoome.binding.Binding;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.util.Geometry;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.nodes.PPath;
import edu.umd.cs.piccolo.util.PAffineTransform;
import edu.umd.cs.piccolo.util.PBounds;
import edu.umd.cs.piccolo.util.PPaintContext;
import edu.umd.cs.piccolo.util.PPickPath;
import edu.umd.cs.piccolox.util.PFixedWidthStroke;

public class ConnectionView extends PPath implements ElementView {
	private double RANDOM2 = Math.random();

	private double RANDOM1 = Math.random();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int NO_TIP = 0;
	public static final int THIN_ARROW_TIP = 1;
	public static final int TRIANGLE_TIP = 2;

	private LayoutManager layoutManager = new LayoutManager(this);
	private List<NodeView> nodeViews;

	private List<Integer> tips;

	private Point2D center;

	private static List<Path2D> DEFAULT_ARROW_TIPS = new ArrayList<Path2D>();

	static {
		// Empty tip shape
		DEFAULT_ARROW_TIPS.add(new Path2D.Double());

		// Creates arrow tip shape
		Path2D tip1 = new Path2D.Double();
		tip1.moveTo(-5, -5);
		tip1.lineTo(0, 0);
		tip1.lineTo(-5, 5);

		DEFAULT_ARROW_TIPS.add(tip1);

		// Inheritance tip shape
		Path2D tip2 = new Path2D.Double();
		tip2.moveTo(-10, -10);
		tip2.lineTo(0, 0);
		tip2.lineTo(-10, 10);
		tip2.closePath();

		DEFAULT_ARROW_TIPS.add(tip2);

	}

	/**
	 * Creates the line
	 * 
	 * @param src
	 *            Starting point. Must be in global coordinates
	 * @param dst
	 *            End point. Must be in global coordinates
	 */
	ConnectionView(List<NodeView> nodeViews) {

		tips = new ArrayList<Integer>();
		for (int i = 0; i < nodeViews.size(); i++) {
			tips.add(0);
		}

		// Initializes line
		center = calculateCenter(nodeViews);

		offset(center.getX(), center.getY());
		this.nodeViews = nodeViews;

//		this.setStroke(new PFixedWidthStroke());
		///
		setStroke(new PFixedWidthStroke(1f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10.0f, new float[] {20,20}, 0.0f));
		
		///
		// this.setStroke(new BasicStroke());
		updateLine();

	}

	/**
	 * Calculates the center of gravity between a set of ZUI-visible node views.
	 * 
	 * @param nvs
	 * @return The center of gravity in global coordinates
	 */
	private double calculateConnectionScale(List<NodeView> nvs) {
		double sumScale=0;
		double count = 0;
		for (NodeView n : nvs) {
			PNode nv = getZUIVisibleNode(n);
			if (nv != null) {
//				if (nv.getParent() != null) {
//					sumScale += nv.getParent().getScale();
//				} else {
					sumScale += nv.getGlobalScale();
//				}
				count++;
			}
		}
		return (sumScale+1)/(count+1);
	}
	/**
	 * Calculates the center of gravity between a set of ZUI-visible node views.
	 * 
	 * @param nvs
	 * @return The center of gravity in global coordinates
	 */
	private Point2D calculateCenter(List<NodeView> nvs) {
		double x = 0;
		double y = 0;
		int count = 0;
		for (NodeView n : nvs) {
			PNode nv = getZUIVisibleNode(n);
			if (nv != null) {
				Point2D b = nv.getGlobalBounds().getCenter2D();
				x += b.getX();
				y += b.getY();
				count++;
			}
		}
		return new Point2D.Double(x / count, y / count);
	}

	/**
	 * Updates the line
	 * 
	 * @param src
	 *            Starting point. Must be in global coordinates
	 * @param dst
	 *            End point. Must be in global coordinates
	 */
	public void updateLine() {
		// FIXME For some reason, it is not possible to create a connection when
		// two nodes centers are in the same coordinates
		center = calculateCenter(nodeViews);
		setGlobalScale(calculateConnectionScale(nodeViews));
		LoggerUtil.instance.debug(center);
		setOffset(center.getX(), center.getY());
		Point2D thisPosLocal = globalToLocal(center);
		reset();
		// check if it is a self-connection
		PNode n1 = getZUIVisibleNode(nodeViews.get(0));
		PNode n2 = getZUIVisibleNode(nodeViews.get(1));
		
	
		
		if (nodeViews.size() == 2 && n1.equals(n2)) {
			Point2D initPoint = n1.localToGlobal(new Point2D.Double(n1.getWidth()*RANDOM1, n1.getHeight()));
			Point2D midPoint1 =  n1.localToGlobal(new Point2D.Double(n1.getWidth()*RANDOM1, n1.getHeight()*(RANDOM2+1)));
			Point2D midPoint2 =  n1.localToGlobal(new Point2D.Double(n1.getWidth()*(RANDOM1+1), n1.getHeight()*(RANDOM2+1)));
			Point2D midPoint3 =  n1.localToGlobal(new Point2D.Double(n1.getWidth()*(RANDOM1+1), n1.getHeight()*RANDOM2));
			Point2D endPoint =  n1.localToGlobal(new Point2D.Double(n1.getWidth(), n1.getHeight()*RANDOM2));
			globalToLocal(initPoint);
			globalToLocal(endPoint);
			globalToLocal(midPoint1);
			globalToLocal(midPoint2);
			globalToLocal(midPoint3);
			moveTo((float)initPoint.getX(),(float)initPoint.getY());
//			curveTo((float)initPoint.getX(), (float)initPoint.getY(), (float)endPoint.getX(), (float)endPoint.getY(), (float)midPoint.getX(), (float)midPoint.getY());
			lineTo((float)midPoint1.getX(), (float)midPoint1.getY());
			lineTo((float)midPoint2.getX(), (float)midPoint2.getY());
			lineTo((float)midPoint3.getX(), (float)midPoint3.getY());
			lineTo((float)endPoint.getX(), (float)endPoint.getY());
			appendTip(midPoint3, endPoint, 1, n1);
		} else {
			for (int i = 0; i < nodeViews.size(); i++) {
				PNode n = getZUIVisibleNode(nodeViews.get(i));
				if (n != null) {
					Point2D nodePosLocal = globalToLocal(Geometry.getIntersectionPoint(n, this));
					if (!nodePosLocal.equals(thisPosLocal)) {
						final Line2D line = new Line2D.Double(nodePosLocal, thisPosLocal);
						append(line, false);

						// Adds tip
						// TODO must use the tip from ConnectionEnd
						appendTip(thisPosLocal, nodePosLocal, i, n);

					}
				}
			}
		}
//		setStroke(new BasicStroke());

	}


	private void appendTip(Point2D startPos, Point2D endPos, int tipNumber, PNode n) {
		PAffineTransform t = getTransform();
		double theta = Geometry.getAngle(startPos, endPos);
		t.rotate(theta);
		t.setOffset(endPos.getX(), endPos.getY());
//		t.scaleAboutPoint(n.getGlobalScale(), 0, 0);
		Path2D tipShape = (Path2D) DEFAULT_ARROW_TIPS.get(tips.get(tipNumber)).clone();
		tipShape.transform(t);
		append(tipShape, false);
		// updateBoundsFromPath();
	}

	@Override
	public void updateBoundsFromPath() {
		PBounds b = new PBounds(getPathBoundsWithStroke());
		if (b.width > 0 && b.height > 0) {
			super.updateBoundsFromPath();
		} else {
			if (b.width <= 0) {
				b.width = 1;
			}
			if (b.height <= 0) {
				b.height = 1;
			}
			setBounds(b);
		}
	}

	/**
	 * Finds the closest ZUI-visible ancestor (it could be the same node if it
	 * is ZUI-visible)
	 * 
	 * @param nodeView
	 * @return
	 */
	public PNode getZUIVisibleNode(NodeView nodeView) {
		PNode n = nodeView;
		while ((!(n instanceof ElementView) || !((ElementView) n).getLayoutManager().isZUIVisible()) && !(n instanceof RootView)) {
			n = n.getParent();

		}
		if (n == null || n instanceof RootView) {
			return null;
		} else {
			return n;
		}
	}

	public void setNode(int pos, NodeView n) {
		nodeViews.set(pos, n);
		updateLine();
	}

	public List<NodeView> getNodeViews() {
		return nodeViews;
	}

	public void setTip(int tipIndex, int tipType) {
		int oldTip = tips.get(tipIndex);
		tips.set(tipIndex, tipType);
		updateLine();
		firePropertyChange(0, Binding.VIEW_CHANGED, oldTip, tips.get(tipIndex));
	}

	public int getTip(int index) {
		return tips.get(index);
	}

	@Override
	public boolean fullPick(PPickPath pickPath) {
		if (layoutManager.isZUIVisible()) {
			return super.fullPick(pickPath);
		} else {
			return false;
		}
	}

	@Override
	public void layoutChildren() {
		layoutManager.updateLayout();
	}

	@Override
	public void addChild(int index, PNode child) {
		super.addChild(index, child);
		layoutManager.addNode(child);
	}

	@Override
	public PNode removeChild(final int index) {
		PNode child = super.removeChild(index);
		layoutManager.removeNode(child);
		return child;
	}

	@Override
	protected void paint(PPaintContext paintContext) {
		layoutManager.updateZoomLayout(paintContext.getScale());
		if (layoutManager.isZUIVisible()) {
			super.paint(paintContext);
		} else {
			firePropertyChange(PROPERTY_CODE_FULL_BOUNDS, PROPERTY_FULL_BOUNDS, null, null);
		}
	}

	@Override
	public LayoutManager getLayoutManager() {
		return layoutManager;
	}

	@Override
	public void move(Integer slots) {
		throw new UnsupportedOperationException();

	}

}
