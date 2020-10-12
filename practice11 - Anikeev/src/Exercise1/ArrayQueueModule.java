package Exercise1;

import java.util.Arrays;

public class ArrayQueueModule {
    private static int size;
    private static int front;
    private static int rear;
    private static Object[] data = new Object[10];

    static void fixCapacity(int capacity)
    {
        int len = data.length;
        if (capacity > len)
        {
            Object[] newElements = new Object[data.length * 2];
            int i = 0;
            while (rear != front)
            {
                newElements[i] = data[front];
                front = (front + 1) % len;
                i++;
            }
            front = 0;
            rear = len - 1;
            data = newElements;
        }
    }

    //pre: element != null
    //post: data[rear] = element,
    //      rear = (rear + 1) % data.length,
    //      size = size + 1
    public static void enqueue(Object element)
    {
        assert element != null;
        fixCapacity(size + 2);
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    //pre: size > 0
    //post: R = data[front]
    public static Object element()
    {
        assert size > 0;
        return data[front];
    }

    //pre: size > 0
    //post: R = data[front],
    //      front = (front + 1) % data.length,
    //      size = size - 1
    public static Object dequeue()
    {
        Object ret = element();
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return ret;
    }

    //post: R = size
    public static int size()
    {
        return size;
    }

    //post: R = (size == 0)
    public static boolean isEmpty()
    {
        return (size == 0);
    }

    //post: size = 0,
    //      front = 0,
    //      rear = 0
    public static void clear()
    {
        front = 0;
        rear = 0;
        size = 0;
        data = new Object[10];
    }

    @Override
    public String toString() {
        return "ArrayQueueModule{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
