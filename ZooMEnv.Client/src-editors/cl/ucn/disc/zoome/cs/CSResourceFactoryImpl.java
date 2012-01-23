package cl.ucn.disc.zoome.cs;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CSResourceFactoryImpl extends XMIResourceFactoryImpl {

	public CSResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		return new CSResourceImpl(uri);
	}

}
