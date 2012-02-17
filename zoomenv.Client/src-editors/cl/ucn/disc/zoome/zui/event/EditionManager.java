package cl.ucn.disc.zoome.zui.event;

import cl.ucn.disc.zoome.zui.view.TextView;
import edu.umd.cs.piccolo.event.PInputEvent;

public class EditionManager {
	private TextView editedTextNode;
	
	

	
	public void setEditedTextNode(TextView n) {
		this.editedTextNode = n;
	}
	
	public TextView getEditedTextNode() {
		return this.editedTextNode;
	}

	public void stopEditing(PInputEvent event) {
//		if (editedTextNode != null && editedTextNode.isEditing()) {
//			editedTextNode.stopEditing(event);
//			YLogger.instance.debug("Stop editing: "+ editedTextNode);
//			editedTextNode = null;
//		}
	}

	public void startEditing(TextView text, PInputEvent event) {
//		editedTextNode = text;
//		editedTextNode.startEditing(event);
//		YLogger.instance.debug("Start editing: "+ editedTextNode);
		
	}
}
