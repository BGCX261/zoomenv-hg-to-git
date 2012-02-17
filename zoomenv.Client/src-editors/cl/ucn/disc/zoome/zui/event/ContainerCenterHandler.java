package cl.ucn.disc.zoome.zui.event;

import java.awt.event.InputEvent;

import cl.ucn.disc.zoome.Application;
import cl.ucn.disc.zoome.zui.view.NodeView;
import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.event.PInputEventFilter;
import edu.umd.cs.piccolo.nodes.PText;

/**
 * Handles text editing of {@link PText} classes
 * 
 * @author jpavlich Portions of this code from Lance Good
 */
public class ContainerCenterHandler extends ZUIInputEventHandler {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	
	
	public ContainerCenterHandler(Application yapp) {
		super(yapp);
		setEventFilter(new PInputEventFilter(InputEvent.BUTTON1_MASK));
	}

	/**
	 * A callback that is invoked any time the mouse is double clicked on a
	 * YText instance. It changes it to edit mode
	 * 
	 * @param event
	 *            mouse click event that can be queried
	 */
	@Override
	public void mouseDoubleClicked(final PInputEvent event) {
		PNode n = event.getPickedNode();
		if (n instanceof NodeView) {
			yapp.getViewManager().fitNode(n);
			event.setHandled(true);
		}
	}

}
