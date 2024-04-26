//this is the interface
package lists;
import java.util.Iterator;
public interface MyList<T> {
    void add(T item);
    void set(T item);
    void add(T item, int index);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst() ;
    T getLast ();
    void remove (int index);
    void removeFirst ();
    void removeLast ();
    void sort();
    int index0f (Object object);
    int lastIndex0f (Object object);
    boolean exists (Object object);
    public Object[] toArray () ;
    void clear ();
    int size();

}