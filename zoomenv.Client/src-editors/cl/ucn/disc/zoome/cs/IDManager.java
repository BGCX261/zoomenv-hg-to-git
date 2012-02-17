package cl.ucn.disc.zoome.cs;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import cl.ucn.disc.zoome.services.LoggerUtil;

/**
 * Manages unique names for concrete syntax objects
 * 
 * @author jpavlich
 * 
 */
public class IDManager {



	private Adapter nameUpdater = new AdapterImpl() {

		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeatureID(CSElement.class) == CSPackage.CS_ELEMENT__NAME) {
				updateName(msg.getOldStringValue(), msg.getNewStringValue());
			}

		}

	};

	/**
	 * Tracks the IDs of the model components.
	 */
	private Map<String, EObject> csElementIndex = new HashMap<String, EObject>();
	private Map<EClass, Integer> lastIds = new HashMap<EClass, Integer>();

	public String register(EObject o) {
		EStructuralFeature nameSF = o.eClass().getEStructuralFeature("name");
		if (nameSF != null) {
			o.eSetDeliver(false);
			String name = (String) o.eGet(nameSF);
			if (name == null || (csElementIndex.containsKey(name) && !csElementIndex.get(name).equals(o))) {
				name = getUniqueName(o);
				o.eSet(nameSF, name);
			}
			csElementIndex.put(name, o);
			o.eAdapters().add(nameUpdater);
	
			// e.addPropertyChangeListener(Y.MODEL_COMPONENT_CHANGED, this);
			o.eSetDeliver(true);
			return name;
		} 
		LoggerUtil.instance.info("Can only register instances of ENamedElement");
		return null;

	}

	public void registerAll(CSRoot r) {
		TreeIterator<EObject> it = r.eAllContents();
		while (it.hasNext()) {
			EObject o = it.next();
			if (o instanceof CSElement) {
				register((CSElement) o);
			}
		}
	}

	public void unregisterAll() {
		csElementIndex.clear();
		lastIds.clear();
	}

	public void unregister(CSElement e) {
		if (e.getName() != null) {
			csElementIndex.remove(e.getName());
			e.eAdapters().remove(nameUpdater);

			// a.removePropertyChangeListener(YModelComponent.MODEL_COMPONENT_CHANGED,
			// this);
		}
	}

	private void updateName(String oldName, String newName) {
		if (oldName != null) { // Only of oldID != null it is an update,
			// otherwise it is a creation
			if (!newName.equals(oldName)) {
				if (csElementIndex.containsKey(oldName)) {
					if (!csElementIndex.containsKey(newName)) {
						EObject e = csElementIndex.remove(oldName);
						csElementIndex.put(newName, e);
						return;
					} else {
						throw new RuntimeException("Name: \""+ newName  + "\" already exists");
					}
				} else {
					throw new RuntimeException("Name does not exist");
				}
			}
		}
	}

	public Map<String, EObject> getCsElementIndex() {
		return csElementIndex;
	}

	private String getUniqueName(EObject e) {
		Integer lastId = lastIds.get(e.eClass());
		if (lastId == null) {
			lastId = new Integer(0);
		}
		String name = e.eClass().getName() + lastId;
		while (csElementIndex.containsKey(name)) {
			lastId++;
			name = e.eClass().getName() + lastId;
			
		}
		lastIds.put(e.eClass(), lastId);
		return name;
	}

}