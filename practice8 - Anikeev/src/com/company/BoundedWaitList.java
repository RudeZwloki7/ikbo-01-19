package com.company;

/**
 *
 * @param <E> - generic type
 */
public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    /**
     *
     * @param capacity of list
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return capacity of list
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param element we want to add in list
     */
    public void add(E element){
        if (content.size()<capacity)
            super.add(element);
        else
            throw new ArrayIndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
