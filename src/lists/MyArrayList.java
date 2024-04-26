package lists;
import java.util.Iterator;
public class MyArrayList<T> implements MyList<T>{
    private T[] arr;
    private int size;
   //
    public MyArrayList() {
        this.arr = new T[10];
        this.size = 0;
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



