package com.company;

import java.util.Arrays;

public class Task4 {
    private int[] array;
    int sizeArray = 10;
    private void printArray(int[]array){
        array = this.array;
        for (int i: array){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
    private void generateArray(){
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = (int) (Math.random() * 101);
        }
        this.array = array;
    }

    public void printAnswer(){
        generateArray();
        printArray(array);
        Arrays.sort(array);
        printArray(array);
    }
}
