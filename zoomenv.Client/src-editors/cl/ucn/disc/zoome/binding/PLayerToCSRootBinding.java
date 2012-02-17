package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;

import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PLayer;

public class PLayerToCSRootBinding extends PiccoloBinding<PLayer, CSRoot> {

	private static final long serialVersionUID = 566781528935236094L;

	public PLayerToCSRootBinding(PLayer view, CSRoot model, ViewManager vm) {
		super(view, model, vm);
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {
	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Binding.CHILD_COMPONENTS_CHANGED)) {
			viewManager.visualize((EObject)evt.getNewValue(), view);

		}
		
	}

}
