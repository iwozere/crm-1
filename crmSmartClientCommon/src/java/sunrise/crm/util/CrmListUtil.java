package sunrise.crm.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.formula.functions.T;

/**
 * @author Goncalves
 */
public final class CrmListUtil {

    public static List<String> getListWithoutDuplicatesOrdered(List<String> sourceList) {
        List<String> listWithoutDuplicatesOrdered = new ArrayList<>(new HashSet<String>(sourceList));
        Collections.sort(listWithoutDuplicatesOrdered);
        return listWithoutDuplicatesOrdered;
    }

    public static List<String> getListWithoutDuplicatesNotOrdered(List<String> sourceList) {
        return new ArrayList<>(new LinkedHashSet<String>(sourceList));
    }

    public static boolean isEmpty(List<?> sourceList) {
        return sourceList == null || sourceList.isEmpty();
    }

    public static boolean isNotEmpty(List<?> sourceList) {
        return sourceList != null && !sourceList.isEmpty();
    }

    public static <T extends Enum<T>> String[] enumArrayToStringArray(T[] values) {
        int i = 0;
        String[] result = new String[values.length];
        for (T value: values) {
            result[i++] = value.toString();
        }
        return result;
    }
    
    public static <E> List<List<E>> splitIntoChunks(List<E> list, int chunkSize) {
        List<List<E>> chunks = new ArrayList<>();
        for (int i = 0; i < list.size(); i += chunkSize) {
            int end = Math.min(list.size(), i + chunkSize);
            chunks.add(new ArrayList<>(list.subList(i, end)));
        }
        return chunks;
    }    

    /** In case of empty or null parameter the original list is returned.
     * @param <T>
     * @param items
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T[] removeNullItems(T[] items) {
        if (items == null || items.length == 0) {
            return items;
        }
        Class<?> type = items.getClass().getComponentType();
        
        final List<T> lst = new ArrayList<>(Arrays.asList(items));
        lst.removeAll(Collections.singleton(null));
        
        return lst.toArray((T[])Array.newInstance(type, lst.size()));
    }
    
    public static String[] list2array(List<String> list) {
        return list.toArray(new String[list.size()]);
    }

    public static <T> T getFirstItem(List<T> list) {
        if(isEmpty(list)) {
            return null;
        }
        return list.get(0);
    }
    
    /**
     * Based on Collections4, added to avoid conflicts with library versions
     * @param collection
     * @param retain
     * @return
     */
	public static <E> List<E> retainAll(Collection<E> collection, Collection<?> retain) {
		List<E> list = new ArrayList<>(Math.min(collection.size(), retain.size()));
		Iterator<E> i$ = collection.iterator();

		while (i$.hasNext()) {
			E obj = i$.next();
			if (retain.contains(obj)) {
				list.add(obj);
			}
		}

		return list;
	}
}
