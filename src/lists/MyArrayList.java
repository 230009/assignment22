package lists;

public abstract class MyArrayList<T> implements MyList<T>{
    private static final int initialSize = 5;
    private T[] arr;
    private int size;
    public MyArrayList() {
        arr = (T[]) new Object[initialSize];
    }

    public MyArrayList(int size) {
        if (size < 0)
            throw new IllegalArgumentException("Illegal ArrayList size: " + size);
        this.arr = (T[]) new Object[size];
    }

    @Override
    public void add(T item) {
        if (size >= arr.length)
            increaseSize();
        arr[size++] = item;
    }
    private void increaseSize() {
        T[] newArr = (T[]) new Object[size * 2];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }
    @Override
    public void set(T item, int index) {
        checkIndex(index);
        arr[index] = item;
    }

    @Override
    public void add(T item, int index) {
        checkIndex(index);
        if (size >= arr.length)
            increaseSize();

        for (int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        size++;
    }
    private void checkIndex(int index) {
        if (index >= size || index < 0) throw new IndexOutOfBoundsException("Index must be between 0 and " + size);
    }
    @Override
    public void addFirst(T item) {
        add(item, 0);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }
    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }
    @Override
    public T getFirst() {
        return arr[0];
    }
    public T getLast() {
        return arr[size-1];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (size * 2 < arr.length)
            decreaseSize();
        for(int i = index; i < size; i++)
            arr[i] = arr[i+1];
        size--;
    }
    private void decreaseSize(){
        T[] newArr = (T[]) new Object[(int) (size / 2)];
        for (int i = 0; i < size; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }
    @Override
    public void removeFirst() {
        remove(0);
    }
    public void removeLast() {
        remove(size-1);
    }

    @Override
    public void sort() {
    }

    @Override
    public int indexOf(T item) {
        for (int i = 0; i < size; i++)
            if (item.equals(arr[i]))
                return i;
        return -1;
    }
    @Override
    public int lastIndexOf(T item) {
        for(int i = size - 1; i >= 0; i--)
            if(item.equals(arr[i]))
                return i;
        return -1;
    }
    @Override
    public boolean exists(Object item) {
        return indexOf((T) item) >= 0;
    }
    @Override
    public T[] toArray() {
        return arr;
    }
    @Override
    public void clear() {
        for(int i = 0; i < size; i++)
            arr[i] = null;
    }
    @Override
    public int size() {
        return size;
    }



}



