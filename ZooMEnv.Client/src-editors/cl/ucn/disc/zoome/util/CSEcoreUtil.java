package cl.ucn.disc.zoome.util;

import groovy.lang.GroovyObject;
import groovy.lang.MetaClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class CSEcoreUtil {

	public static void set(EObject o, String attr, Object value) {
		o.eSet(o.eClass().getEStructuralFeature(attr), value);
	}

	public static Object get(EObject o, String attr) {
		return o.eGet(o.eClass().getEStructuralFeature(attr));
	}

	public static EObject create(EPackage parent, String className) {
		EClassifier c = parent.getEClassifier(className);
		if (c instanceof EClass) {
			return parent.getEFactoryInstance().create((EClass) c);
		} else {
			return null;
		}
	}
	
	public static EObject create(EClass c) {
		return c.getEPackage().getEFactoryInstance().create(c);
	}

	// TODO Optimize
	public static List<EClassifier> getConcreteClasses(Resource r) {
		List<EClassifier> l = new ArrayList<EClassifier>();
		// Finds EClasses only on the second level of the resource tree
		// The assumption is that the top-level elements in a resource are
		// packages that contain all of the instantiable classes
		for (EObject o : r.getContents()) { 
			if (o instanceof EPackage) {
				EPackage parent = (EPackage) o;
				for (EClassifier cls : parent.getEClassifiers()) {
					if (cls instanceof EClass) {
						EClass c = (EClass) cls;
						if (!c.isAbstract()) {
							l.add(c);
						}
					} else {
						if (cls instanceof EDataType) {
							l.add(cls);
						}
					}
				}
			}
		}
		return l;
	}



	public static void print(ENamedElement o, String indent) {
		System.out.println(indent + o.getName() + " : " + o.eClass().getName());
		for (EObject ch : o.eContents()) {
			if (ch instanceof EClass) {
				EClass c = (EClass) ch;
				if (!c.isAbstract()) {
					System.out.print("*");
				}
			}
			if (ch instanceof ENamedElement) {
				print((ENamedElement) ch, indent + "  ");
			}
		}
	}


	
	@SuppressWarnings("unchecked")
	public static void associate(EObject parent, String attr,
			Object child) {
		if (parent == null && (attr == null || attr.length() == 0)) {
			return;
		}

		if (parent == null || attr == null || attr.length() == 0) {
			return;
		}
		EStructuralFeature feature = parent.eClass()
				.getEStructuralFeature(attr);
		if (feature != null) {
				// Checks if feature is changeable
				if (feature.isChangeable()) {
			
				Object o = parent.eGet(feature);
//				if (feature.isMany() && o == null) {
		
				if (o instanceof Collection<?>) {
					Collection<Object> c = (Collection<Object>) o;
					// If the collection is a set, only adds the element if
					// it's not there already
					if (feature.isUnique() && c.contains(child)) {
						return;
					} else {
						if (child instanceof Collection<?>) {
							c.addAll((Collection<? extends Object>) child);
						} else {
							c.add(child);
						}
					}
					
				} else {
					parent.eSet(feature, child);
				}
				return;
				} else {
					throw new RuntimeException(parent.eClass().getName() + "." + attr + " is not changeable.");
				}
//			}
		} else {
			throw new RuntimeException("Attribute " + attr	+ " does not exist.");
		}
	}
	
	public static String name(ENamedElement ne) {
		if (ne == null) {
			return "";
		} else {
			return ne.getName();
		}
	}

	public static GroovyObject createGroovyObject(final EObject model) {
		GroovyObject go = new GroovyObject() {
	
			@Override
			public MetaClass getMetaClass() {
				// TODO Auto-generated method stub
				return null;
			}
	
			@Override
			public Object getProperty(String propertyName) {
				return get(model, propertyName);
			}
	
			@Override
			public Object invokeMethod(String name, Object args) {
				// TODO Auto-generated method stub
				return null;
			}
	
			@Override
			public void setMetaClass(MetaClass metaClass) {
				// TODO Auto-generated method stub
				
			}
	
			@Override
			public void setProperty(String propertyName, Object newValue) {
				set(model, propertyName, newValue);
				
			}
			
		};
	
		return go;
	}

	/** Find all of the EObjects that reference obj through structural feature sf
	 * @param sf
	 * @param obj
	 * @return
	 */
	public static Set<EObject> findReferencingEObjects(EStructuralFeature sf, EObject obj) {
		Set<EObject> referencingEObjects = new HashSet<EObject>();
		Set<EObject> instances = getAllInstancesOf(sf.getEContainingClass(), obj.eResource());
		for (EObject otherObj : instances) {
			Object attrValue = otherObj.eGet(sf);
			if (sf.isMany()) {
				if (attrValue instanceof Collection<?>) {
					Collection c = (Collection)attrValue;
					if (c.contains(obj)) {
						referencingEObjects.add(otherObj);
					}
				}
			} else {
				if (attrValue.equals(obj)) {
					referencingEObjects.add(otherObj);
				}
			}
		}
		
		return referencingEObjects;
	}

	public static Set<EObject> getAllInstancesOf(EClass eContainingClass,
			Resource eResource) {
		Set<EObject> instances = new HashSet<EObject>();
		Iterator<EObject> it = eResource.getAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (eContainingClass.isInstance(o)) {
				instances.add(o);
			}
		}
		return instances;
	
	}

	public static String getFullName(EClass c) {
		String name = c.getName();
		EPackage p = c.getEPackage();
		while (p != null) {
			name += p.getName() + "." + name;
			p = p.getESuperPackage();
		}
		return name;
	}

	public static String getFullName(EStructuralFeature sf) {
		String name = sf.getName();
		EClass c = sf.getEContainingClass();
		return getFullName(c) + "." + name;
	}

}
