package cl.ucn.disc.zoome.zui.layout;

import java.awt.geom.Rectangle2D;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import edu.umd.cs.piccolo.PNode;

public class FitToChildrenUpdater implements PropertyChangeListener {

	private static final double MIN_W = 100;
	private static final double MIN_H = 50;
	
	double margin = 10;

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		PNode n = (PNode) evt.getSource();
		Rectangle2D b = n.getUnionOfChildrenBounds(null);
		resizeToMinimum(b);
		n.setBounds(b);
	}

	private void resizeToMinimum(Rectangle2D b) {
		b.setRect(b.getX(),b.getY(), b.getWidth() < MIN_W? MIN_W : b.getWidth(), b.getHeight() < MIN_H? MIN_H : b.getHeight());
	}

};
