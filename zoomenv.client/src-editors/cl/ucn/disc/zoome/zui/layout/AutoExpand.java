package cl.ucn.disc.zoome.zui.layout;

import java.awt.geom.Rectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import edu.umd.cs.piccolo.PNode;

public class AutoExpand implements PropertyChangeListener {
		
		public void propertyChange(PropertyChangeEvent evt) {
			PNode n = (PNode) evt.getSource();
			Rectangle2D b = n.getGlobalFullBounds();
			n.setBounds(n.globalToLocal(b));
		}



}
