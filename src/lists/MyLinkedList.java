package lists;

public abstract class MyLinkedList<T extends Object & Comparable<T>>implements MyList<T> {
    private class Node<T> {
        public T item;
        T data;
        Node next;
        Node prev;

        Node(T data, Object o) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    public void add(T item) {
        size++;
        if (head == null) {
            head = new Node<>(item, null);
            return;
        }
        Node<T> last = getLastNode();
        last.next = new Node<T>(item, null);
    }
    private Node<T> getLastNode() {
        Node<T> node = head;
        while (node.next != null)
            node = node.next;
        return node;
    }
    public void addFirst(T item) {
        add(item, 0);
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public void set(T item, int index) {
        Node<T> node = head;
        while (index-- != 0 && node.next != null)
            node = node.next;
        node.item = item;
    }

    @Override
    public T get(int index) {
        return getNodeAt(index + 1).item;
    }
    private Node<T> getNodeAt(int index) {
        checkIndex(index);
        Node<T> node = head;
        if (node == null)
            return null;
        while (--index != 0 && node.next != null)
            node = node.next;
        return node;
    }
    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index must be between 0 and " + size);
    }

    @Override
    public T getFirst() {
        return (T) head.item;
    }

    @Override
    public T getLast() {
        return getLastNode().item;
    }
    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        Node<T> node = getNodeAt(index);
        node.next = node.next.next;
        size--;
    }

    @Override
    public void removeFirst() {
        head = head.next;
        size--;
    }

    @Override
    public void removeLast() {
        Node<T> node = getNodeAt(size - 1);
        node.next = null;
        size--;
    }
    public void sort() {
        boolean swapped;
        Node<T> node;

        if (head == null)
            return;

        do {
            swapped = false;
            node = head;

            while (node.next != null) {
                if (node.item.compareTo((T) node.next.item) > 0) {
                    T t = (T) node.next.item;
                    node.next.item = node.item;
                    node.item = t;
                    swapped = true;
                }
                node = node.next;
            }
        } while (swapped);
    }
    public int indexOf(T item) {
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item))
                return i;
            node = node.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T item) {
        Node<T> node = head;
        int t = -1;
        for (int i = 0; i < size; i++) {
            if (node.item.equals(item))
                t = i;
            node = node.next;
        }
        return t;
    }
    public boolean exists(Object item) {
        return indexOf((T) item) != -1;
    }

    @Override
    public T[] toArray() {
        T[] array = (T[]) new Object[size];
        Node<T> node = head;
        for (int i = 0; i < size; i++) {
            array[i] = node.item;
            node = node.next;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

}

