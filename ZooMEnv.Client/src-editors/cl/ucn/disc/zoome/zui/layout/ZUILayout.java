package cl.ucn.disc.zoome.zui.layout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.umd.cs.piccolo.PNode;

/** This class is added to components with layout, i.e.,
 * classes that implement the {@link ElementView} interface.
 * This class is in charge to layout the set of children (@see {@link ZUILayout#nodes})
 * within the parent node (@see {@link ZUILayout#parent})
 * @author jpavlich
 *
 */
public abstract class ZUILayout<N extends PNode> implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<N> nodes = new ArrayList<N>();
	
	protected PNode parent;

	public PNode getParent() {
		return parent;
	}

	public void setParent(PNode parent) {
		this.parent = parent;
	}

	public List<N> getNodes() {
		return nodes;
	}

	public ZUILayout() {
		
	}
	
	public void addNode(N n) {
		nodes.add(n);
	}
	
	public boolean removeNode(N n) {
		return nodes.remove(n);
	}
	
	
	
	public abstract void update();

	public boolean isAuto() {
		return true;
	}
	
	
};

