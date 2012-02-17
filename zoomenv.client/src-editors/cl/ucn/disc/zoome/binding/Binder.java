package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;
import java.util.HashMap;
import java.util.Map;

import cl.ucn.disc.zoome.util.MultiMap;
import edu.umd.cs.piccolo.PNode;

public abstract class Binder<V, M> {

	public Map<V, Binding<? extends V, ? extends M>> viewBindings = new HashMap<V, Binding<? extends V, ? extends M>>();
	public MultiMap<M, Binding<? extends V, ? extends M>> modelBindings = new MultiMap<M, Binding<? extends V, ? extends M>>();
	public enum InitType {NONE, VIEW_TO_MODEL, MODEL_TO_VIEW}; 
	
	protected void bind(V view, M model, Binding<? extends V, ? extends M> b, InitType initType) {
		if (viewBindings.containsKey(view)) {
			throw new RuntimeException("View is already bound to a model component");
		}
		viewBindings.put(view, b);
		modelBindings.add(model, b);
		switch (initType) {
			case MODEL_TO_VIEW:
				PropertyChangeEvent evt = new PropertyChangeEvent(model, Binding.MODEL_CHANGED, null, model);
				b.propertyChange(evt);
				break;
			case VIEW_TO_MODEL:
				evt = new PropertyChangeEvent(view, PNode.PROPERTY_FULL_BOUNDS, null, view);
				b.propertyChange(evt);
				break;
		}
	}

	public void unbind(V view) {
		Binding<?, ?> b = viewBindings.get(view);
		if (b != null) {
			b.unbind();
			viewBindings.remove(view);
			modelBindings.get(b.getModel()).remove(b);
		}
	}

	public void unbindAll() {
		viewBindings.clear();
		modelBindings.clear();
	}
	
	/** Unbinds n and all its children, recursively
	 * @param n
	 */
	public abstract void unbindRecursive(V n);

}
