package cl.ucn.disc.zoome.zui.view;

import cl.ucn.disc.zoome.zui.layout.ElementView;
import cl.ucn.disc.zoome.zui.layout.GraphLayout;
import cl.ucn.disc.zoome.zui.layout.ZUILayout;
import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.umd.cs.piccolo.PNode;

public class LayoutManager {
	private double zoom;
	private double minZoom = Double.NEGATIVE_INFINITY;
	private double maxZoom = Double.POSITIVE_INFINITY;
	
	private GraphLayout<PNode, ConnectionView> graphLayout;
	private ZUILayout<?> layout;
	private PNode pNode;

	@SuppressWarnings("unchecked")
	public LayoutManager(PNode pNode) {
		this.pNode = pNode;
		
		setGraphLayout(new GraphLayout<PNode, ConnectionView>(
				pNode,
				(Class<? extends Layout<PNode, ConnectionView>>) CircleLayout.class));

	}
	
	private boolean ZUIVisible = true; 
	private boolean oldZUIVisible = true;
	public boolean isZUIVisible() {
		return ZUIVisible;
	}

	public double getZoom() {
		return zoom;
	}

	public ZUILayout<?> getLayout() {
		return layout;
	}

	public double getMinZoom() {
		return minZoom;
	}

	public void setMinZoom(Double minZ) {
		if (minZ == null) {
			this.minZoom = Double.NEGATIVE_INFINITY;
		} else {
			this.minZoom = minZ;
		}
	}

	public double getMaxZoom() {
		return maxZoom;
	}

	public void setMaxZoom(Double maxZ) {
		if (maxZ == null) {
			this.maxZoom = Double.POSITIVE_INFINITY;
		} else {
			this.maxZoom = maxZ;
		}
	}


	public void setLayout(ZUILayout<? extends PNode> l) {

		layout = l;
		if (l != null) {
			l.setParent(pNode);
		}
	}
	

	public void setGraphLayout(GraphLayout<PNode, ConnectionView> gl) {
		this.graphLayout = gl;
	}


	public GraphLayout<PNode, ConnectionView> getGraphLayout() {
		return graphLayout;
	}

	

	public void updateGraphLayout() {
		graphLayout.update();
	}
	
	public void updateLayout() {
		if (layout != null) {
			layout.update();
		}
	}
	
	public void addNode(PNode n) {
		if ((n instanceof NodeView || n instanceof TextView)
				&& graphLayout != null) {

			graphLayout.addNode(n);
		}
	}
	
	public void removeNode(PNode n) {
		if ((n instanceof NodeView || n instanceof TextView)
				&& graphLayout != null) {
			graphLayout.removeNode(n);
		}

	}

	public void updateZoomLayout(double zoom) {
		this.zoom = zoom;
		oldZUIVisible = ZUIVisible;
		ZUIVisible = zoom >= minZoom && zoom < maxZoom;
		if (pNode instanceof ConnectionView) {
			ConnectionView cv = (ConnectionView)pNode;
			ZUIVisible = ZUIVisible 
					&& !((!cv.getNodeViews().get(0).getLayoutManager().isZUIVisible() ||  !cv.getNodeViews().get(1).getLayoutManager().isZUIVisible()) 
					&& cv.getZUIVisibleNode(cv.getNodeViews().get(0)).equals(cv.getZUIVisibleNode(cv.getNodeViews().get(1)))); 
		}
		if (pNode.getParent() instanceof ElementView) {
			ElementView parent = (ElementView) pNode.getParent();
			ZUIVisible = ZUIVisible && parent.getLayoutManager().ZUIVisible;
		}
//		LoggerUtil.instance.debug("zoom: "+ zoom);
	}
	
	public boolean isZUIVisibleChanged() {
		return ZUIVisible != oldZUIVisible;
	}
}
