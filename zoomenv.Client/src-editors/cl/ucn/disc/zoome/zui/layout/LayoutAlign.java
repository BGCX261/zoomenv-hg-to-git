package cl.ucn.disc.zoome.zui.layout;

import java.util.List;

import edu.umd.cs.piccolo.PNode;
import edu.umd.cs.piccolo.util.PBounds;

/** Aligns a set of children w.r.t. a parent. The parent is the first element in the
 * {@link ZUILayout#nodes} list. The children are the remaining elements.
 * @author jpavlich
 *
 */
public class LayoutAlign extends ZUILayout<PNode> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final float MARGIN = 10;

	public enum HAlignment { LEFT, RIGHT, CENTER };
	public enum VAlignment { TOP, BOTTOM, MIDDLE };
	
	private HAlignment halign = HAlignment.CENTER;
	private VAlignment valign = VAlignment.MIDDLE;
	
	public LayoutAlign(List<PNode> nodes, HAlignment halign, VAlignment valign) {
		if (nodes != null && !nodes.isEmpty()) {
		this.nodes = nodes;
		this.halign = halign;
		this.valign = valign;
		} else {
			throw new RuntimeException("Nodes must not be empty");
		}
	}

	public LayoutAlign(List<PNode> nodes) {
		this.nodes = nodes;
	}

	
	@Override
	public void update() {
		PNode parent = nodes.get(0);
		for (int i=1; i<nodes.size(); i++) {
			PNode child = nodes.get(i);
			PBounds b = parent.getBounds();
			switch(halign) {
			case LEFT:
				b.x += MARGIN;
				break;
			case RIGHT:
				b.x += b.width - MARGIN - child.getWidth();
				break;
			case CENTER:
				b.x = b.getCenterX() - child.getWidth()/2;
				break;
			}
			
			switch(valign) {
			case TOP:
				b.y += MARGIN;
				break;
			case BOTTOM:
				b.y += b.height - MARGIN - child.getHeight();
				break;
			case MIDDLE:
				b.y = b.getCenterY() - child.getHeight()/2;
				break;
			}
			child.setBounds(b);
		}
	}

	

}
