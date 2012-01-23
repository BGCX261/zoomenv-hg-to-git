package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;


public abstract class EcoreBinding<V extends EObject, M extends EObject> extends Binding<V, M> {

	private Adapter va;
	private Adapter ma;

	public EcoreBinding(V view, M model) {
		super(view, model);
	}

	@Override
	public void initialize(V v, M m) {
		va = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				PropertyChangeEvent evt = new PropertyChangeEvent(msg.getNotifier(), Binding.VIEW_CHANGED , msg.getOldValue(), msg.getNewValue());
				propertyChange(evt);
				
			}
			
		};
		
		
		ma = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				PropertyChangeEvent evt = new PropertyChangeEvent(msg.getNotifier(), Binding.MODEL_CHANGED , msg.getOldValue(), msg.getNewValue());
				propertyChange(evt);
				
			}
			
		};
		view.eAdapters().add(va);
		model.eAdapters().add(ma);
	}

	@Override
	public void unbind() {
		view.eAdapters().remove(va);
		model.eAdapters().remove(ma);
		
	}

}
