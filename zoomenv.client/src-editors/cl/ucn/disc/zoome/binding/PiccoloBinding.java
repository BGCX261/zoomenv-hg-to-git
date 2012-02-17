package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.Serializable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PNode;

/** Connects a view class with a model class for two-way updating.
 * This class implements the {@link PropertyChangeListener} interface, to listen for changes
 * in the view, and update the model accordingly.
 * To update the view, it translates EMF {@link Notification} to {@link PropertyChangeEvent}
 * @author jpavlich
 *
 * @param <V>
 * @param <M>
 */
public abstract class PiccoloBinding<V extends PNode, M extends EObject> extends Binding<V,M> implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7820937019987806136L;
	protected ViewManager viewManager;
	private Adapter a;
	
	public PiccoloBinding(V view, M model, ViewManager vm) {
		super(view, model);
		this.viewManager = vm;

	}


	@Override
	public void initialize(V view, M model) {
		// TODO Parameterize property names when creating the binding
		view.addPropertyChangeListener(VIEW_CHANGED,this);
		view.addPropertyChangeListener(PNode.PROPERTY_FULL_BOUNDS, this);
		view.addPropertyChangeListener(PNode.PROPERTY_TRANSFORM, this);
		view.addPropertyChangeListener(CHILD_ORDER_CHANGED, this);
		
//		model.addPropertyChangeListener(YModelComponent.MODEL_COMPONENT_CHANGED, this);
		
		a = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				PropertyChangeEvent evt = new PropertyChangeEvent(msg.getNotifier(), MODEL_CHANGED , msg.getOldValue(), msg.getNewValue());
				propertyChange(evt);
				
			}
			
		};
		
		model.eAdapters().add(a);

	}
	
	
	@Override
	public void unbind() {
		view.removePropertyChangeListener(VIEW_CHANGED, this);
		view.removePropertyChangeListener(PNode.PROPERTY_FULL_BOUNDS,this);
		model.eAdapters().remove(a);
		this.view = null;
		this.model = null;
	}



}