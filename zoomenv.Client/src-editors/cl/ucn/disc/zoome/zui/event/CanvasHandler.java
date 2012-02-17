package cl.ucn.disc.zoome.zui.event;

import cl.ucn.disc.zoome.Application;
import edu.umd.cs.piccolo.event.PInputEvent;

/** Clears selection and clears edited text node when canvas is clicked
 * @author jpavlich
 *
 */
public class CanvasHandler extends ZUIInputEventHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public CanvasHandler(Application yapp) {
		super(yapp);
	}
	@Override
	public void mouseClicked(PInputEvent event) {
		super.mouseClicked(event);
		yapp.getSelection().unselectAll();
		yapp.getEdition().stopEditing(event);
	}

//	@Override
//	public void mouseMoved(PInputEvent event) {
//		super.mouseMoved(event);
//		((YMainWindow)yapp.getWindow()).getjLabelCoordinates().setText("[ " + event.getPosition().getX() + ", " + event.getPosition().getY() + " ] ");
//	}
	
	@Override
	public void mouseDoubleClicked(PInputEvent event) {
		yapp.getViewManager().fitToAll();
	}
	
	
	
	
}
