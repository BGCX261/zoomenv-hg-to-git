package cl.ucn.disc.zoome.zui.layout;

import java.util.Comparator;

import edu.umd.cs.piccolo.PNode;

public class PNodeNameComparator implements Comparator<PNode> {

	@Override
	public int compare(PNode o1, PNode o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
