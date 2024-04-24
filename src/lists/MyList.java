//this is the interface
package lists;
import java.util.Iterator;
public interface MyList<T> {
    void add(T item);


    void add(Object item, int index);
}