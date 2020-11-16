package Exercise2;

import java.util.Collection;

public class LinkedList<E> {
    private Node front, rear;
    private int size;

    class Node {
        E value;
        Node next;

        public Node(E e) {
            this.value = e;
        }
    }

    public LinkedList() {
        this.size = 0;
    }

    public boolean add(E e) {
        Node node = new Node(e);

        if (front == null) {
            rear = node;
            front = rear;
        } else {
            rear.next = node;
            rear = rear.next;
        }

        size++;
        return true;
    }

    public boolean remove(E e) {
        Node node = front;

        if (front == null) {
            return false;
        } else if (front.value == e) {
            front = front.next;
            size--;
            return true;
        }

        while (node.next != null && node.next.value != e) {
            node = node.next;
        }

        if (node.next != null) {
            node.next = node.next.next;
            size--;
            return true;
        }

        return false;
    }

    public int getSize() {
        return size;
    }
}