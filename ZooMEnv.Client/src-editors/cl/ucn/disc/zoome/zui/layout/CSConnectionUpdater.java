package cl.ucn.disc.zoome.zui.layout;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import cl.ucn.disc.zoome.zui.view.ConnectionView;
import cl.ucn.disc.zoome.zui.view.NodeView;
import edu.umd.cs.piccolo.PNode;

public class CSConnectionUpdater implements PropertyChangeListener  {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		updateConnections((PNode)evt.getSource());
	}

	private void updateConnections(PNode n) {
		if (n instanceof NodeView) {
			NodeView ev = (NodeView)n;
			for (ConnectionView av : ev.getConnections()) {
				av.updateLine();
			}
			
		}
		for (int i=0; i < n.getChildrenCount(); i++) {
			updateConnections(n.getChild(i));
		}
	}
	
};

