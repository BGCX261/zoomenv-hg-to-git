package cl.ucn.disc.zoome.zui.view;

import cl.ucn.disc.zoome.zui.layout.ElementView;
import edu.umd.cs.piccolo.PLayer;
import edu.umd.cs.piccolo.PNode;

/**
 * @author jpavlich
 *
 */
public class RootView extends PLayer implements ElementView {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LayoutManager layoutManager = new LayoutManager(this);

	public RootView() {
		super();
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
	public LayoutManager getLayoutManager() {
		return layoutManager;
	}



	@Override
	public void move(Integer slots) {
		throw new UnsupportedOperationException();
	}

	
}
