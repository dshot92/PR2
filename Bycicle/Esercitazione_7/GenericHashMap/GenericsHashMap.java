import java.util.HashSet;
import java.util.Collection;
import java.util.Set;

public class GenericsHashMap<K, V>{
	private final HashSet<Pair<K, V>> set;

	public GenericsHashMap(){
		set = new HashSet<>();
	}

	public void put(K key, V value){
		set.add(new Pair<K, V>(key, value));
	}

	public V get(K key){
        for (Pair<K, V> pair : set)
			if (pair.getFirst().equals(key))
				return pair.getSecond();
        return null;
	}

	public V remove(K key){
		V value = null;
        for (Pair<K, V> pair : set)
        	if (pair.getFirst().equals(key)){
            	value = pair.getSecond();
            }
        set.remove(new Pair<K, V>(key, value));
        return value;
	}

	public int size(){
    	return set.size();
	}

	public Set<K> getKeys(){
        Set<K> keySet = new HashSet<>();
        for (Pair<K, V> pair : set)
			keySet.add(pair.getFirst());
        return keySet;
	}

	public Collection<V> getValues(){
    	Collection<V> collection = new HashSet<>();
        for (Pair<K, V> pair : set)
			collection.add(pair.getSecond());
        return collection;
	}
}
