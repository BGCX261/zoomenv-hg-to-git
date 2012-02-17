package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
// TODO Maybe it's better to use Notification instances from EMF
public abstract class Binding<V, M> implements PropertyChangeListener {

	protected V view;
	protected M model;
	private boolean updating = false;
	public static final String VIEW_CHANGED = "view changed";
	public static final Object CHILD_COMPONENTS_CHANGED = "child components changed";
	public static final String CHILD_ORDER_CHANGED = "child order changed";
	public static final String MODEL_CHANGED = "model component changed";
	
	
	public Binding(V view, M model) {
		this.view = view;
		this.model = model;
		initialize(view, model);
	}

	public abstract void initialize(V v, M m);
	
	public abstract void unbind();

	public V getView() {
		return view;
	}

	public M getModel() {
		return model;
	}



	/** Updates the view. This method is called whenever the model changes
	 */
	protected abstract void updateView(PropertyChangeEvent evt);

	/** Updates the models. This method is called whenever the view changes and
	 * those changes need the model to update. 
	 */
	protected abstract void updateModel(PropertyChangeEvent evt);

	/** This is called when a view has changed
	 * and needs to update the model or
	 * when a model has changed and needs to update the view
	 * @see java.beans.PropertyChangeListener#propertyChange(java.beans.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (!updating) {
			if (evt.getSource() == view) {
				updating  = true;
				updateModel(evt);
				updating = false;
			} else if (evt.getSource() == model) {
				updating  = true;
				updateView(evt);
				updating = false;
			}
		}
		
	}

}
