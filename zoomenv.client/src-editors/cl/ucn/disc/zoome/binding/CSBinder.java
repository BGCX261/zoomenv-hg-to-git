package cl.ucn.disc.zoome.binding;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSText;

public class CSBinder extends Binder<CSElement, EObject> {
	public void bind(CSText view, EObject model) {
		Binding<? extends CSElement, ? extends EObject> b = new CSTextToEObjectBinding(view, model, view.getText());
		bind(view,model,b,InitType.MODEL_TO_VIEW);
	}
	
	/** Default binding
	 * @param view
	 * @param model
	 */
	public void bind(CSElement view, EObject model) {
		Binding<? extends CSElement, ? extends EObject> b = new CSElementToEObjectBinding(view, model);
		bind(view,model,b,InitType.NONE);
	}
	
	
	public void bindRecursively(CSElement elem, EObject obj) {
		elem.setObject(obj);

		if (elem.eClass().getInstanceClass().equals(CSText.class)) {
			bind((CSText) elem, obj); // Explicitly calls bind(YText, EObject)
		} else {
			// YNodes and YConnections are directly bound to the object
			bind(elem, obj);
		}

		for (CSElement ch : elem.getChildren()) {
			if (!ch.isTemplateRoot()) {
				bindRecursively(ch, obj);
			}
		}

	}

	@Override
	public void unbindRecursive(CSElement n) {
		unbind(n);
		Iterator<CSElement> it = n.getChildren().iterator();
		while (it.hasNext()) {
			unbindRecursive(it.next());
		}
	}
}
