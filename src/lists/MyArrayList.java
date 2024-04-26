package lists;
import java.util.Iterator;
// The MyList<T> class uses an array as its primary way of storing data.
// It allows you to add, retrieve, modify, and delete items.
// It is a data structure that provides a convenient way to manage a collection of items.
public abstract class MyArrayList<T> implements MyList<T>{
    private static final int INITIAL_CAPACITY = 5;
    private T[] arr;
    private int size = 0;
   //
    public MyArrayList() {
        arr = (T[]) new Object [INITIAL_CAPACITY];
    }
    public MyArrayList(int initial_cpct){
        if (initial_cpct < 0){
            throw new IllegalArgumentException();
        }
        this.arr = (T[]) new Object [initial_cpct];
    }

    @Override
    public void add(T item) {
        if (size >= arr.length){
            increaseSize(size + 1);
            arr[size++] = item;
        }
    }
    private void increaseSize(){
        T[] newarr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++)
            newarr[i] = arr[i];
        arr = newarr;
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);

    }
    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("index not correct");
        }
    }
    public void addFirst(T item){
        add(item, 0);
    }
    public void addLast(T item){
        add(item);
    }
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }
    public T getFirst(int index) {
        return arr[0];
    }
    public T getLast(int index) {
        return arr[size - 1];
    }
    public void remove(int index){
        checkIndex(index);
        if (size * 2 < arr.length)
            decraseSize();
        for (int i = index; i < size; ++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }
    private void decraseSize(){
        T[] newarr = (T[]) new Object[size*2];
        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;

    }
    public void removeFirst(){
        remove(0);
    }
    public void removeLast(){
        remove(0);
    }
    public void sort(){

    }
    public int index0f (Object object){
        for (int i = 0; i < size; i++) {

            if (item.equals(arr[i]))
                return i;
        }
        return -1;
    }
    public int lastIndex0f (Object object){
        T item;
        for (int i = size - 1; i >= 0; i--) {
            if (item.equals(arr[i]))
                return i;
        }
        return -1;
    }
    public boolean exists(Object item){
        return indexOf(item) >= 0;
    }
    public T[] toArray(){
        return arr;
    }
    public void clear() {
        for(int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }
    public int size(){
        return size;
    }

}




