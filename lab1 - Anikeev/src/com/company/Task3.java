package com.company;

public class Task3 {
    public void printRow() {
        System.out.print("1");
        for (int i = 2; i < 11; i++) {
            System.out.printf(", 1/%d", i);
        }
    }
}
