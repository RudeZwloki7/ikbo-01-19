package com.company;

/**
 *
 * @param <E> - generic type
 */
public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
    }

    /**
     *
     * @param element we want to remove from list
     */
    public void remove(E element) {
        if(element!= content.peek())
            content.remove(element);
    }

    /**
     *
     * @param element we want to move in end of list
     */
    public void moveToBack(E element){
        content.remove(element);
        content.add(element);

    }
}
