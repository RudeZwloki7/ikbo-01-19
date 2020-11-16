package Exercise4;

import java.util.Collection;

public class CircleList<E> {
    private Node front, rear;
    private int size = 0;

    class Node {
        E value;
        Node next;
        Node prev;

        Node(Node prev, E value, Node next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public CircleList() {
    }

    public CircleList(Collection<? extends E> c) {
        addAll(c);
    }

    public boolean add(E e) {
        linkRear(e);
        return true;
    }

    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }

    public boolean addAll(int index, Collection<? extends E> c) {
        checkIndex(index);
        Object[] objects = c.toArray();
        int length = objects.length;

        if (length == 0) {
            return false;
        }

        Node pred, succ;

        if (index == size) {
            succ = null;
            pred = rear;
        } else {
            succ = find(index);
            pred = succ.prev;
        }

        for (Object o : objects) {
            E e = (E) o;
            Node node = new Node(pred, e, null);

            if (pred == null) {
                front = node;
            } else {
                pred.next = node;
            }

            pred = node;
        }

        if (succ == null) {
            rear = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }

        size += length;
        return true;
    }

    public boolean remove(Object item) {
        if (item == null) {
            for (Node f = front; f != null; f = f.next) {
                if (f.value == null) {
                    unlink(f);
                    return true;
                }
            }
        } else {
            for (Node f = front; f != null; f = f.next) {
                if (item.equals(f.value)) {
                    unlink(f);
                    return true;
                }
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    private void checkIndex(int index) {
        if (!(index >= 0 && index < size)) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void linkFront(E e) {
        Node front = this.front;
        Node node = new Node(null, e, front);
        this.front = node;

        if (front == null) {
            rear = node;
        } else {
            front.prev = node;
        }

        size++;
    }

    private void linkRear(E e) {
        Node rear = this.rear;
        Node node = new Node(rear, e, null);
        this.rear = node;

        if (rear == null) {
            front = node;
        } else {
            rear.next = node;
        }

        size++;
    }

    void linkBefore(E e, Node node) {
        Node previous = node.prev;
        Node temp = new Node(previous, e, node);
        node.prev = temp;

        if (previous == null) {
            front = temp;
        } else {
            previous.next = temp;
        }

        size++;
    }

    private void unlink(Node node) {
        Node next = node.next;
        Node previous = node.prev;

        if (previous == null) {
            front = next;
        } else {
            previous.next = next;
            node.prev = null;
        }

        if (next == null) {
            rear = previous;
        } else {
            next.prev = previous;
            node.next = null;
        }

        node.value = null;
        size--;
    }

    private Node find(int index) {
        Node node;

        if (index < (size >> 1)) {
            node = front;
            for (int i = 0; i < index; i++)
                node = node.next;
        } else {
            node = rear;

            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }

        return node;
    }

    public E[] toArray() {
        Object[] objects = new Object[size];
        int i = 0;

        for (Node node = front; node != null; node = node.next) {
            objects[i++] = node.value;
        }

        return (E[]) objects;
    }
}
