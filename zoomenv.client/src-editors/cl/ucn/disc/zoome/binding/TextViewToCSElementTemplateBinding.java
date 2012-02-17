package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;
import java.util.HashMap;
import java.util.Map;

import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.util.GroovyUtil;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.nodes.PText;

public class TextViewToCSElementTemplateBinding extends
		PiccoloBinding<PText, CSElement> {

	private static final long serialVersionUID = 8236992405794559688L;
	private String templateText;

	public TextViewToCSElementTemplateBinding(PText view, CSElement model,
			String templateText, ViewManager vm) {
		super(view, model, vm);
		this.templateText = templateText;
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(VIEW_CHANGED)) {
		}

	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		// TODO Optimize. It needs to be called only when needed
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			Map<String, Object> bindings = new HashMap<String, Object>();
			bindings.put("self", model);
			String text = GroovyUtil.applyTemplate(templateText, bindings);
			view.setText(text);
//			YLogger.instance.debug("Model updated, name:" + model.getName()
//					+ " text:" + text);
		}
	}

}
