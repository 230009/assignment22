package lists;
import java.util.Iterator;
public class MyArrayList<T> implements MyList<T>{
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
        arr = (T[]) new Object [initial_cpct];
    }

    @Override
    public void add(T item) {
        ensureCapacity();
        arr[size++] = item;
    }

    @Override
    public void add(Object item, int index) {

    }
    //constructor


}



