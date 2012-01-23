package cl.ucn.disc.zoome.zui.event;

import java.awt.event.InputEvent;

import cl.ucn.disc.zoome.Application;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.event.PInputEventFilter;
import edu.umd.cs.piccolo.util.PDimension;

public class DragSelectHandler extends ZUIInputEventHandler   {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PNode node;




	public DragSelectHandler(PNode node, Application yapp) {
		super(yapp);
		this.node = node;
		setEventFilter(new PInputEventFilter(InputEvent.BUTTON1_MASK));
	}
	
	public void mouseClicked(final PInputEvent event) {
		yapp.getEdition().stopEditing(event);
    	performSelection(event);
    }
	
	public void mousePressed(final PInputEvent event) {
    	performSelection(event);
	}

	

    public void mouseDragged(final PInputEvent event) {
		final PDimension delta = event.getDeltaRelativeTo(node); 
        if (yapp.getSelection().isSelected(node)) {
        	for (PNode selected : yapp.getSelection().getView()) {
        		selected.translate(delta.width, delta.height);
        	}
        } else {
    		node.translate(delta.width, delta.height);
        }
        node.signalBoundsChanged();
        event.setHandled(true);
    }


	public void mouseReleased(final PInputEvent event) {
        event.setHandled(true);
    }




	private void performSelection(final PInputEvent event) {
		if (yapp.getSelection().isSelected(node)) {
			// Nothing, it's already selected
			event.setHandled(true);
			return;
		} else {
	    		// Shift key is used to select multiple nodes
	    		if (!event.isShiftDown()) { 
	    			yapp.getSelection().unselectAll();
	    		}
	    		yapp.getSelection().select(node);

	    		event.setHandled(true);
		}
	}
	
}
