package cl.ucn.disc.zoome.binding;

import java.io.Serializable;
import java.util.Iterator;

import cl.ucn.disc.zoome.cs.CSConnection;
import cl.ucn.disc.zoome.cs.CSElement;
import cl.ucn.disc.zoome.cs.CSNode;
import cl.ucn.disc.zoome.cs.CSRoot;
import cl.ucn.disc.zoome.cs.CSTemplateDescription;
import cl.ucn.disc.zoome.cs.CSText;
import cl.ucn.disc.zoome.zui.view.ConnectionView;
import cl.ucn.disc.zoome.zui.view.NodeView;
import cl.ucn.disc.zoome.zui.view.TextView;
import cl.ucn.disc.zoome.zui.view.ViewManager;
import edu.umd.cs.piccolo.PLayer;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.nodes.PText;

public class PiccoloBinder extends Binder<PNode,CSElement> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8780724469708905768L;
	private ViewManager viewManager;
	
	public PiccoloBinder(ViewManager vm) {
		this.viewManager = vm;
	}
	
	public void bind(ConnectionView view, final CSConnection c) {
		ConnectionBinding b = new ConnectionBinding(view, c, viewManager);

		bind(view, c, b, InitType.NONE);
	}

	public void bind(PLayer view, CSRoot r) {
		PLayerToCSRootBinding b = new PLayerToCSRootBinding(view, r, viewManager);
		bind(view,r,b,InitType.NONE);
	}
	
	public void bind(NodeView view, CSNode n, InitType initType) {
		NodeViewToCSNodeBinding b = new NodeViewToCSNodeBinding(view, n, viewManager);
		bind(view,n,b,initType);
	}
	
	

	public void bind(TextView view, CSText model, String modelAttr) {
		PiccoloToCSMapping.updatePNodeFromYNode(view, model);
		TextViewToCSTextBinding b = new TextViewToCSTextBinding(view, model, modelAttr, viewManager);
		bind(view, model, b, InitType.MODEL_TO_VIEW);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void unbindRecursive(PNode n) {
		unbind(n);
		Iterator<PNode> it = n.getChildrenIterator();
		while (it.hasNext()) {
			unbindRecursive(it.next());
		}
	}

	public void bind(NodeView nv, CSTemplateDescription td) {
		NodeViewToTemplateDescriptionBinding b = new NodeViewToTemplateDescriptionBinding(nv, td, viewManager);
		bind(nv,td, b, InitType.NONE);
	}

	public void bindWithTemplate(PText t, CSTemplateDescription td,
			String templateText) {
		TextViewToCSElementTemplateBinding b = new TextViewToCSElementTemplateBinding(t, td, templateText, viewManager);
		bind(t,td,b,InitType.NONE);
		
	}
	
}