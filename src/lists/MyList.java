//this is the interface
package lists;

public interface MyList<T> {
    void add(T item);
    void set(T item);

    void set(T item, int index);

    void add(T item, int index);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst() ;
    T getLast ();
    void remove (int index);
    void removeFirst ();
    void removeLast ();
    void sort(String bubble);
    int index0f (Object object);
    int lastIndex0f (Object object);

    int indexOf(T item);

    int lastIndexOf(T item);

    boolean exists (Object object);
    public Object[] toArray () ;
    void clear ();
    int size();

}