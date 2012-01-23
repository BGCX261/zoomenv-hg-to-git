package cl.ucn.disc.zoome.binding;

import groovy.lang.GroovyObject;

import java.beans.PropertyChangeEvent;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.util.CSEcoreUtil;
import cl.ucn.disc.zoome.util.GroovyUtil;

public class CSTextToEObjectBinding extends EcoreBinding<CSText, EObject> {

	private String templateText;

	
	public CSTextToEObjectBinding(CSText view, EObject model, String templateText) {
		super(view, model);
		this.templateText = templateText;
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(VIEW_CHANGED)) {
			// TODO Implement
			
		}

	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			Map<String,Object> bindings = new HashMap<String, Object>();
			GroovyObject m = CSEcoreUtil.createGroovyObject(model);
			bindings.put("self", m);
			String text = GroovyUtil.applyTemplate(templateText, bindings);
			view.setText(text);
		}
	}

	

	
}
