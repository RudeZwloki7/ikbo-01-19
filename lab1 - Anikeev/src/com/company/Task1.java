package com.company;

public class Task1 {
    private int[] array = {13, 14, 32, 84, 32, 58, 10, 6, 1};

    public void printArray() {
        int sum = 0;
        System.out.print("Сумма элементов массива с помощью цикла for: ");
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum);
        sum = 0;
        System.out.print("Сумма элементов массива с помощью цикла while: ");
        int j = 0;
        while (j < array.length) {
            sum += array[j];
            j++;
        }
        System.out.println(sum);
        System.out.print("Сумма элементов массива с помощью цикла do while: ");
        sum = 0;
        j = 0;
        do {
            j++;
            sum += array[j - 1];
        } while (j < array.length);
        System.out.println(sum);
    }

}
