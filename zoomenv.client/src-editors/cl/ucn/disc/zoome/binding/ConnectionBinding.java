package cl.ucn.disc.zoome.binding;

import java.beans.PropertyChangeEvent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSConnectionEnd;
import cl.ucn.disc.zoome.cs.CSPackage;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.zui.layout.ListLayout;
import cl.ucn.disc.zoome.zui.view.ConnectionView;
import cl.ucn.disc.zoome.zui.view.ViewManager;

public class ConnectionBinding extends PiccoloBinding<ConnectionView, CSConnection> {

	private static final long serialVersionUID = -8285441537569977694L;

	public ConnectionBinding(ConnectionView view, final CSConnection model, ViewManager vm) {
		super(view, model, vm);
		for (CSConnectionEnd ce : model.getConnectionEnds()) {
			
			// Any changes to connection ends should notify the connection
			ce.eAdapters().add(new AdapterImpl() {
	
				@Override
				public void notifyChanged(Notification msg) {
					LoggerUtil.instance.debug("CE changed") ;
					model.eNotify(new ENotificationImpl((InternalEObject) model, Notification.SET, CSPackage.CS_CONNECTION_END__TIP_TYPE, msg.getOldValue(), msg.getNewValue()));
					
				}
					
			});
		}
	}

	@Override
	protected void updateModel(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(VIEW_CHANGED)) {
			for (int i=0; i<model.getConnectionEnds().size(); i++) {
				CSConnectionEnd ce = model.getConnectionEnds().get(i);
				ce.setTipType(view.getTip(i));
			}
			
		}
	}

	@Override
	protected void updateView(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(MODEL_CHANGED)) {
			view.setName(model.getName());
			if (model.getLayout() == null) {
				view.getLayoutManager().setLayout(null);
			} else {
				view.getLayoutManager().setLayout(new ListLayout());
			}
			for (int i=0; i<model.getConnectionEnds().size(); i++) {
				CSConnectionEnd ce = model.getConnectionEnds().get(i);
				view.setTip(i, ce.getTipType());
			}
			view.updateLine();
		}
		
	}



}
