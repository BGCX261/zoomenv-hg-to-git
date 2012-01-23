package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;

import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.zui.view.NodeView;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PNode;

public class NodeViewToTemplateDescriptionBinding extends PiccoloBinding<NodeView, CSTemplateDescription> {

	public NodeViewToTemplateDescriptionBinding(NodeView view,
			CSTemplateDescription model, ViewManager vm) {
		super(view, model, vm);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 654766404849314559L;

	@Override
	protected void updateModel(PropertyChangeEvent evt) {

		if (evt.getPropertyName().equals(PNode.PROPERTY_TRANSFORM)
				|| evt.getPropertyName().equals(PNode.PROPERTY_FULL_BOUNDS)) {

			PiccoloToCSMapping.updateYNodeFromPNode(model, view);
		}
	}
	
	// TODO Test this
	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			PiccoloToCSMapping.updatePNodeFromYNode(view, model);

		}
	}
	
	


}
