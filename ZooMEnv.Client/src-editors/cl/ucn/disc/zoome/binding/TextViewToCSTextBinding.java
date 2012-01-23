package cl.ucn.disc.zoome.binding;

import java.awt.geom.Point2D;
import java.beans.PropertyChangeEvent;

import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.util.ReflectionUtil;
import cl.ucn.disc.zoome.zui.view.TextView;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PNode;

public class TextViewToCSTextBinding extends PiccoloBinding<TextView, CSText> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String modelAttr;

	public TextViewToCSTextBinding(TextView view, CSText model, String modelAttr, ViewManager vm) {
		super(view, model, vm);
		this.modelAttr = modelAttr;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(VIEW_CHANGED)) {
			String text = view.getText();
			ReflectionUtil.setAttr(model, modelAttr, text);
		}
		if (evt.getPropertyName().equals(PNode.PROPERTY_TRANSFORM)
				|| evt.getPropertyName().equals(PNode.PROPERTY_FULL_BOUNDS)) {

			PiccoloToCSMapping.updateYNodeFromPNode(model, view);

//			YLogger.instance.debug("Model updated, name:" + model.getName()
//					+ " x:" + model.getX() + " y:" + model.getY());
		} else if (evt.getPropertyName().equals(CHILD_ORDER_CHANGED)) {
			PiccoloToCSMapping.updateYNodeChildOrder(model, view, evt);
		}
	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			String text = (String) ReflectionUtil.getAttr(model, modelAttr);
			view.setText(text);
			
			PiccoloToCSMapping.updatePNodeFromYNode(view, model);

			Point2D b = view.getGlobalTranslation();
//			YLogger.instance.debug("View updated, name: " + view.getName()
//					+ " | " + b.getX() + "," + b.getY());
		} else if (evt.getPropertyName().equals(CHILD_ORDER_CHANGED)) {
			PiccoloToCSMapping.updatePNodeChildOrder(view, model, evt);
		}
	}

}
