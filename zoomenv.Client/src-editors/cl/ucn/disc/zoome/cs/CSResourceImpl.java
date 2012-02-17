package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class CSResourceImpl extends XMIResourceImpl {

	public CSResourceImpl() {
		super();
	}

	public CSResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected boolean useUUIDs() {
		return true;
	}

}

