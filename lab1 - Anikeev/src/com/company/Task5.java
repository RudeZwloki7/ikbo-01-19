package com.company;

import java.util.Scanner;
public class Task5 {
    public void findFactorial(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 2; i <= n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
