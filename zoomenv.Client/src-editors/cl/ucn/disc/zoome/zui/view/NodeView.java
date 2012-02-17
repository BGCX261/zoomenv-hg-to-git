package cl.ucn.disc.zoome.zui.view;

import java.awt.geom.RectangularShape;
import java.util.LinkedHashSet;
import java.util.Set;

import cl.ucn.disc.zoome.binding.Binding;
import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.nodes.PPath;
import edu.umd.cs.piccolo.util.PPaintContext;
import edu.umd.cs.piccolo.util.PPickPath;
import edu.umd.cs.piccolox.util.PFixedWidthStroke;

/**
 * @author jpavlich
 * 
 */
public class NodeView extends PPath implements ElementView {
	
	private RectangularShape shape;

	public RectangularShape getShape() {
		return shape;
	}

	public void setShape(RectangularShape shape) {
		this.shape = shape;
		redrawShape();
	}

	private static final long serialVersionUID = 3642962539406060817L;

	private Set<ConnectionView> connections = new LinkedHashSet<ConnectionView>();

	private LayoutManager layoutManager = new LayoutManager(this);

	
	NodeView() {
		super();
		this.setStroke(new PFixedWidthStroke());
//		this.setStroke(new BasicStroke());
	}

	public Set<ConnectionView> getConnections() {
		return connections;
	}

	public void attachConnection(ConnectionView c) {
		connections.add(c);
	}

	public void redrawShape() {
		setPathTo(shape);
//		shape.setFrame(shape.getBounds2D());
		setBounds(shape.getBounds2D());
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
		if (layoutManager.isZUIVisibleChanged()) {
			if (getParent() instanceof ElementView) {
				((ElementView)getParent()).getLayoutManager().updateLayout();
			}
			for (ConnectionView cv : getConnections()) {
				cv.updateLine();
			}

		}
		if (layoutManager.isZUIVisible()) {
			super.paint(paintContext);
		}

	}

	@Override
	public LayoutManager getLayoutManager() {
		return layoutManager;
	}

	@Override
	public void move(Integer slots) {
		PNode parent = getParent();
		int i = parent.getChildrenReference().indexOf(this);
		int newI = i + slots; 
		if (newI <= parent.getChildrenCount() && newI >= 0) {
			parent.removeChild(i);
			parent.addChild(newI, this);
			firePropertyChange(0, Binding.CHILD_ORDER_CHANGED, i, newI);
		}

	}


}
