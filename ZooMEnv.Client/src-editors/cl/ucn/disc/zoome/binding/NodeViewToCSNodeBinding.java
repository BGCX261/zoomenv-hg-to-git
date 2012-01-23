package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;

import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.zui.view.NodeView;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PNode;


public class NodeViewToCSNodeBinding extends PiccoloBinding<NodeView, CSNode> {



	/**
	 * 
	 */
	private static final long serialVersionUID = -1794576743091311022L;

	public NodeViewToCSNodeBinding(NodeView view, CSNode model, ViewManager vm) {
		super(view, model, vm);
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {

		if (evt.getPropertyName().equals(PNode.PROPERTY_TRANSFORM)
				|| evt.getPropertyName().equals(PNode.PROPERTY_FULL_BOUNDS)) {
			PiccoloToCSMapping.updateYNodeFromPNode(model, view);
		} else if (evt.getPropertyName().equals(CHILD_ORDER_CHANGED)) {
			PiccoloToCSMapping.updateYNodeChildOrder(model, view, evt);
		}
	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			PiccoloToCSMapping.updatePNodeFromYNode(view,model);
		} 
	}

}
