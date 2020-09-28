package Exercise2;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Пустой список:");
        System.out.println(list.toString());
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        System.out.println("Добавление всех элементов другой коллекции:");
        list.addAll(Arrays.asList(arr));
        System.out.println(list.toString());
        System.out.println("Добавление 5:");
        list.add(5);
        System.out.println(list.toString());
        System.out.println("Добавление 6 по индексу 3:");
        list.add(3,6);
        System.out.println(list.toString());
        System.out.println("Добаление 7 в начало:");
        list.addFirst(7);
        System.out.println(list.toString());
        System.out.println("Добавление 8 в конец:");
        list.addLast(8);
        System.out.println(list.toString());
        System.out.print("Содержится ли число 5 в списке: ");
        System.out.println(list.contains(5));
        System.out.print("Элемент с индексом 4: ");
        System.out.println(list.indexOf(4));
        System.out.println("Удаление элемента с помощью poll():");
        list.poll();
        System.out.println(list.toString());
        System.out.println("Удаление первого элемента с помощью pollFirst():");
        list.pollFirst();
        System.out.println(list.toString());
        System.out.println("Удаление последнего элемента с помощью pollLast()");
        list.pollLast();
        System.out.println(list.toString());
        System.out.printf("peek() : %d%n",list.peek());
        System.out.printf("peekFirst() : %d%n",list.peekFirst());
        System.out.printf("peekLast() : %d%n",list.peekLast());
        System.out.println(list.toString());
    }
}
