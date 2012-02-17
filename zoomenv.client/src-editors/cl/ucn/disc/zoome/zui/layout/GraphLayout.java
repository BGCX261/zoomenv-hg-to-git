package cl.ucn.disc.zoome.zui.layout;

import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import cl.ucn.disc.zoome.zui.animation.PMultipleNodeTranlate;
import cl.ucn.disc.zoome.zui.view.NodeView;
import cl.ucn.disc.zoome.zui.view.RootView;
import cl.ucn.disc.zoome.zui.view.TextView;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.activities.PActivity;

public class GraphLayout<V extends PNode, E extends PNode> extends ZUILayout<V> {
	@Override
	public boolean isAuto() {
		return false;
	}

	public static final int ANIMATION_DEFAULT_DURATION = 200;

	public static final int ANIMATION_DEFAULT_STEP_RATE = 25;

	Graph<V, E> graph = new OrderedSparseGraph<V, E>();

	private PNode parent;
	private Dimension size;

	private boolean enabled = true;

	public GraphLayout(PNode parent, Class<? extends Layout<V, E>> layoutClass, Dimension size) {
		super();
		this.size = size;
		this.parent = parent;
		this.layoutClass = layoutClass;
	}

	public GraphLayout(PNode parent, Class<? extends Layout<V, E>> layoutClass) { 
		this(parent, layoutClass, null);
		if (parent instanceof RootView) {
			this.size = new Dimension(1000,1000);
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final int PADDING = 2;

	private Class<? extends Layout<?, ?>> layoutClass;

	private long duration = ANIMATION_DEFAULT_DURATION;
	
	@Override
	public void update() {
		if (enabled) {
			try {
				final Layout<V, E> layout = (Layout<V, E>) layoutClass.getConstructor(Graph.class).newInstance(graph);
				if (this.size == null) {
					double border = PADDING * 2 * parent.getScale();
					layout.setSize(new Dimension((int) parent.getWidth() - PADDING * 2, (int) parent.getHeight() - PADDING * 2));
				} else {
					layout.setSize(size);
				}

				List<PNode> nodes = new ArrayList<PNode>();
				List<Point2D> targetPositions = new ArrayList<Point2D>();
				for (V n : graph.getVertices()) {
					nodes.add(n);
					Point2D pos = layout.transform(n);
					
					pos.setLocation(pos.getX() + parent.getX(), pos.getY() + parent.getY());

					
					targetPositions.add(pos);

				}

				PActivity a = new PMultipleNodeTranlate(duration, ANIMATION_DEFAULT_STEP_RATE, System.currentTimeMillis(), nodes, targetPositions);
				parent.getRoot().addActivity(a);

			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void addNode(V n) {
		super.addNode(n);
		if (n instanceof NodeView || n instanceof TextView) {
			graph.addVertex(n);
		} 
//		else if (n instanceof YConnectionView) {
//			YConnectionView a = (YConnectionView) n;
//
//			// FIXME does the cast work?
//			for (YNodeView nv : a.getNodeViews()) {
//				if (nv.equals(n)) 
//			}
//			graph.addEdge((E) a, (V) nv, (V) a.getDst());
//		}
	}

	@Override
	public boolean removeNode(V n) {
		boolean b = super.removeNode(n);
		if (n instanceof NodeView) {
			graph.removeVertex(n);
		} 
		
//		else if (n instanceof YConnectionView) {
//			YConnectionView a = (YConnectionView) n;
//
//			// FIXME does the cast work?
//			graph.removeEdge((E) a);
//		}
		
		return b;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

}
