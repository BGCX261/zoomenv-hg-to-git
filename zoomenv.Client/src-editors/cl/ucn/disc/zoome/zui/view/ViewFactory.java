package cl.ucn.disc.zoome.zui.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;

import javax.swing.JTextPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.zui.event.ContainerCenterHandler;
import cl.ucn.disc.zoome.zui.event.DragSelectHandler;
import cl.ucn.disc.zoome.zui.layout.CSConnectionUpdater;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.util.PBounds;

public class ViewFactory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CanvasView canvas;
	public CanvasView getCanvas() {
		return canvas;
	}

	private Application yapp;

	public ViewFactory(CanvasView yCanvas, Application yapp) {
		this.yapp = yapp;
		this.canvas = yCanvas;
	}

	/**
	 * Creates root view
	 * 
	 * @param parent
	 *            Parent PNode
	 */
	public RootView createRootView() {
		
		RootView rootView = new RootView();

		
		return rootView;
	}
	
	/**
	 * Creates a view
	 * 
	 * @param b
	 *            View bounds. Must be defined in global coordinates
	 * @param parent
	 *            Parent PNode
	 */
	public NodeView createNodeView(PBounds b, PNode parent) {
		NodeView nv = new NodeView();
//		nv.append(new Rectangle2D.Double(0, 0, b.width, b.height), true);
		parent.addChild(nv);

		

		Point2D pos = parent.getGlobalTranslation();		
//		pos.setLocation(pos.getX() + parent.getX(), pos.getY() + parent.getY());
		nv.setGlobalTranslation(pos);

		// Handles dragging and selecting nodes
		nv.addInputEventListener(new DragSelectHandler(nv,yapp));

		
		nv.addInputEventListener(new ContainerCenterHandler(yapp));
		
		nv.addPropertyChangeListener(PNode.PROPERTY_FULL_BOUNDS,
				new CSConnectionUpdater());

		
//		nv.addPropertyChangeListener(PNode.PROPERTY_FULL_BOUNDS,
//				new AutoExpand());
		
		return nv;
	}

	

	/**
	 * Creates a connection between two nodes
	 * 
	 * @param src
	 *            Starting node. Must be in global coordinates
	 * @param dst
	 *            End node. Must be in global coordinates
	 * @param node
	 *            The parent node
	 */
	public ConnectionView createConnectionView(List<NodeView> nodes, PNode parent) { // TODO Add tip types 

		ConnectionView av = new ConnectionView(nodes);
		// Scale is the average between src and dst
		
//		av.scaleAboutPoint((src.getGlobalScale() + dst.getGlobalScale())/2 ,0,0);

		// Handles dragging and selecting nodes
		av.addInputEventListener(new DragSelectHandler(av,yapp));
		
		for (NodeView nv : nodes) {
			nv.attachConnection(av);
		}
		parent.addChild(av);
		av.updateLine();

		return av;
	}

	/**
	 * Creates an editable text
	 * 
	 * @param text
	 * @param parent
	 * @return
	 */
	public TextView createText(String text, PNode parent) {
		JTextComponent editor = new DefaultTextEditor();

		TextView t = new TextView(text);//, editor);
		parent.addChild(t);
		canvas.setLayout(null);
		canvas.add(editor);
//		t.addInputEventListener(new TextEditHandler(t,yapp));
		t.addInputEventListener(new DragSelectHandler(t,yapp));
		
		return t;
	}

	private static final class DefaultTextEditor extends JTextPane {
		private static final long serialVersionUID = 1L;

		public DefaultTextEditor() {
			EmptyBorder padding = new EmptyBorder(TextView.TEXT_EDIT_PADDING,
					TextView.TEXT_EDIT_PADDING, TextView.TEXT_EDIT_PADDING,
					TextView.TEXT_EDIT_PADDING);
			setBorder(new CompoundBorder(new LineBorder(Color.black), padding));
		}

		/**
		 * Set some rendering hints - if we don't then the rendering can be
		 * inconsistent. Also, Swing doesn't work correctly with fractional
		 * metrics.
		 */
		public void paint(final Graphics graphics) {
			if (!(graphics instanceof Graphics2D)) {
				throw new IllegalArgumentException(
						"Provided graphics context is not a Graphics2D object");
			}

			final Graphics2D g2 = (Graphics2D) graphics;

			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
					RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			g2.setRenderingHint(RenderingHints.KEY_RENDERING,
					RenderingHints.VALUE_RENDER_QUALITY);
			g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,
					RenderingHints.VALUE_FRACTIONALMETRICS_OFF);

			super.paint(graphics);
		}
	}
}
