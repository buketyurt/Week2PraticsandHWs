package org.example.ownListClass;

public class MyList<T> {
    private Object[] data;
    private int size;
    private int capacity;

    MyList(){
        capacity=10;
        data=new Object[capacity];
    }
    public MyList(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }


    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T element) {
        if (size == capacity) {
            resize();
        }
        data[size++] = element;
    }

    private void resize() {
        capacity *= 2;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index: " + index + ", Size: " + size);
        }
        return (T) data[index];
    }
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T removedElement = (T) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        return removedElement;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return;
        }
        this.data[index] = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
