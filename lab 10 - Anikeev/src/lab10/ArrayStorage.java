package lab10;

import java.util.Arrays;

public class ArrayStorage<E> {

    int it = 0;
    int size;
    E[] arr;

    public ArrayStorage(int size) {

        this.size = size;
        arr = (E[]) new Object[size];
    }

    public void add(E element) {
        try{
            arr[it++] = element;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
    }

    public Object getByIndex(int index) throws Exception {
        if (index < 0) throw new IllegalArgumentException("Negative index");
        else if (index > size - 1) throw new IllegalArgumentException("Out of bounds");

        return arr[index];
    }

    @Override
    public String toString() {
        return "ArrayStorage{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
