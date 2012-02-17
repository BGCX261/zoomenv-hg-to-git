package cl.ucn.disc.zoome.util;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MultiMap<T1, T2> extends LinkedHashMap<T1, Set<T2>> {

	@Override
	public boolean containsValue(Object value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<Entry<T1, Set<T2>>> entrySet() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Set<T2> put(T1 key, Set<T2> value) {
		throw new UnsupportedOperationException();
	}

	public T2 add(T1 key, T2 value) {
		if (!containsKey(key)) {
			super.put(key, new LinkedHashSet<T2>());
		}
		super.get(key).add(value);
		return value;
	}

	public void remove(T1 key, T2 value) {
		if (containsKey(key)) {
			get(key).remove(value);
		}
	}

	@Override
	public void putAll(Map<? extends T1, ? extends Set<T2>> m) {
		throw new UnsupportedOperationException();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public Set<T2> get(Object key) {
		Set<T2> set = super.get(key);
		if (set == null) {
			set = new LinkedHashSet<T2>();
		} 
		return set;
	}

	
}
