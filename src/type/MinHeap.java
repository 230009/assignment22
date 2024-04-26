package type;
import lists.MyArrayList;

public class MinHeap<T extends Comparable<T>> {
    private MyArrayList<T> heap = new MyArrayList<>() {
        @Override
        public void set(T item) {

        }

        @Override
        public int index0f(Object object) {
            return 0;
        }

        @Override
        public int lastIndex0f(Object object) {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    };
    private MyArrayList<T> sorter = new MyArrayList<>() {
        @Override
        public void set(T item) {

        }

        @Override
        public int index0f(Object object) {
            return 0;
        }

        @Override
        public int lastIndex0f(Object object) {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    };
    public MinHeap() {
    }
    public void insert(T item) {
        heap.add(item);
        bubbleSort();
    }

    private void bubbleSort() {
        sorter.sort("bubble");
        heap = sorter;
        sorter = new MyArrayList<>() {
            @Override
            public void set(T item) {

            }

            @Override
            public int index0f(Object object) {
                return 0;
            }

            @Override
            public int lastIndex0f(Object object) {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };
    }
    public T deleteMin() {
        if (isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }
        T min = heap.get(0);
        heap.remove(0);
        return min;
    }
    public boolean isEmpty() {
        return heap.isEmpty();
    }
    public T findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("heap is empty");
        }
        return heap.get(0);
    }


}