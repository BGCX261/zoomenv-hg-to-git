package cl.ucn.disc.zoome.zui.event;

import java.awt.event.InputEvent;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.services.LoggerUtil;
import cl.ucn.disc.zoome.zui.view.TextView;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.event.PInputEventFilter;
import edu.umd.cs.piccolo.nodes.PText;


/** Handles text editing of {@link PText} classes
 * @author jpavlich
 * Portions of this code from Lance Good
 */
public class TextEditHandler extends ZUIInputEventHandler {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		private TextView text;
		
		public TextEditHandler(TextView t, Application yapp) {
			super(yapp);
			this.text = t;
			setEventFilter(new PInputEventFilter(InputEvent.BUTTON1_MASK));
		}

	    /**
	     * A callback that is invoked any time the mouse is double clicked on a 
	     * YText instance.
	     * It changes it to edit mode
	     * 
	     * @param event mouse click event that can be queried
	     */
	    @Override
	    public void mouseClicked(final PInputEvent event) {
	    	LoggerUtil.instance.debug("Clicking " + event.getPickedNode());
    		super.mouseClicked(event);

	    }

	    @Override
	    public void mouseDoubleClicked(final PInputEvent event) {
	    	yapp.getEdition().startEditing(text,event);
	    	event.setHandled(true);
	    }






	}
