package cl.ucn.disc.zoome.zui.event;

import java.io.Serializable;

import edu.umd.cs.piccolo.PCamera;
import edu.umd.cs.piccolo.event.PInputEvent;
import edu.umd.cs.piccolo.event.PZoomEventHandler;

public class ScrollWheelZoomHandler extends PZoomEventHandler implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID =1L;
	public ScrollWheelZoomHandler() {
		
	}
		@Override
		public void mouseWheelRotated(PInputEvent event) {
			PCamera camera = event.getCamera();
			double scaleDelta = 1.0 - (0.1 * event.getWheelRotation());

			double currentScale = camera.getViewScale();
			double newScale = currentScale * scaleDelta;

			if (newScale < getMinScale()) {
				newScale = getMinScale() / currentScale;
			}
			if ((getMaxScale() > 0) && (newScale > getMaxScale())) {
				newScale = getMaxScale() / currentScale;
			}
			camera.scaleViewAboutPoint(scaleDelta, event.getPosition().getX(), event.getPosition().getY());

		}

	
}
