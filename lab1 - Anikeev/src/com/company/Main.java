package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int variant = sc.nextInt();
        switch (variant) {
            case (1) -> {
                Task1 task = new Task1();
                task.printArray();
            }
            case (2) -> {
                Task2 task = new Task2();
                task.printArgs(args);
            }
            case (3) -> {
                Task3 task = new Task3();
                task.printRow();
            }
            case (4) -> {
                Task4 task = new Task4();
                task.printAnswer();
            }
            case (5) -> {
                Task5 task = new Task5();
                task.findFactorial();
            }
            default -> System.out.println("error");
        }
    }
}