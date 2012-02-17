package cl.ucn.disc.zoome.zui.event;

import java.awt.geom.Point2D;
import java.io.Serializable;

import cl.ucn.disc.zoome.Application;
import edu.umd.cs.piccolo.event.PBasicInputEventHandler;
import edu.umd.cs.piccolo.event.PInputEvent;

public abstract class ZUIInputEventHandler extends PBasicInputEventHandler implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final long DOUBLE_CLICK_INTERVAL = 500;
	
	
	protected Application yapp;

	private long timeLastClick;

	private Point2D lastPos;

	public ZUIInputEventHandler(Application yapp) {
		this.yapp = yapp;
	}

    /**
     * Includes checking for double click
     * 
     * @param event mouse click event that can be queried
     */
    @Override
    public void mouseClicked(final PInputEvent event) {
        if (event.getPosition().equals(lastPos) && 
           (System.currentTimeMillis()-timeLastClick < DOUBLE_CLICK_INTERVAL)) {
		        mouseDoubleClicked(event);
        } 
    	timeLastClick = System.currentTimeMillis();
    	lastPos = event.getPosition();
    }

    public void mouseDoubleClicked(final PInputEvent event) {
    	
    }
}
