public class MyArrayList<T> extends MyList<T>{
    private T[] arr = (T[]) new Object[5];
    private int size;

    public MyArrayList() {
        Object[] elements = new Object[10];
        size = 0;
    }
    public MyArrayList(int size){
        if (size < 0){
            throw new IllegalArgumentException();
            this.array = (T[] ) new Object[size];
        }
    }

    public void add(T item){
        if (size >= array.length){

        }
    }

}



