package cl.ucn.disc.zoome.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
@SuppressWarnings("rawtypes")
public class ReflectionUtil {

	public static Object getAttr(EObject model, String modelAttr) {
		try {
			Method m = model.getClass().getMethod("get" + modelAttr.substring(0,1).toUpperCase() + modelAttr.substring(1), (Class<?>[])null);
			return m.invoke(model, (Object[])null);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 
		return null;
	}

	public static void setAttr(EObject model, String modelAttr, String text) {
		try {
			Method m = model.getClass().getMethod("set" + modelAttr.substring(0,1).toUpperCase() + modelAttr.substring(1), String.class);
			m.invoke(model, text);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<? extends T> filterByClass(Collection<T> l, Class<?> c) {
		List<T> filtered = new ArrayList();
		for (T o : l) {
			if (c.isInstance(o)) {
				filtered.add(o);
			}
		}
		return filtered;
	}


}
