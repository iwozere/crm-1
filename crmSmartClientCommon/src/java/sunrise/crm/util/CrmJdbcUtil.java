package sunrise.crm.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author goncalves
 *
 */
public class CrmJdbcUtil {
    
    private static final int ORACLE_MAX_LIST_SIZE = 1000;
    
    /**
     * Return a list with sublists containing all the elements of the main list, but up to
     * ORACLE_MAX_LIST_SIZE elements each sublist.
     * 
     * @param elements the source list
     * @return the list of sublists
     */
    public static <T> List<List<T>> splitListInSubLists(List<T> elements) {
        List<List<T>> subLists = new LinkedList<List<T>>();
        List<T> subList = null;
        int i = ORACLE_MAX_LIST_SIZE;
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (i == ORACLE_MAX_LIST_SIZE) {
                subList = new LinkedList<T>();
                subLists.add(subList);
                i = 0;
            }
            subList.add(it.next());
            i++;
        }
        return subLists;
    }

}
