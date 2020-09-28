package com.company;

import java.util.Collection;

/**
 * @param <E> - generic type
 */

public interface IWaitList<E> {

    /**
     * @param element we want to add
     */
    void add(E element);

    /**
     *
     * @return removed element
     */
    E remove();

    /**
     *
     * @param element to check on contain
     * @return true if element is on list
     */
    boolean contains(E element);

    /**
     *
     * @param c is checked on contain
     * @return true if collection is on list
     */
    boolean containsAll(Collection<E> c);

    /**
     *
     * @return true if list is empty
     */
    boolean isEmpty();
}
