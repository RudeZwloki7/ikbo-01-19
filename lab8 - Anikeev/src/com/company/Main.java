package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        FileWR fileWR = new FileWR();
        Scanner sc = new Scanner(System.in);
        fileWR.write(sc.nextLine(),false);
        fileWR.read();
        fileWR.replace(sc.nextLine());
        fileWR.add(sc.nextLine());
        fileWR.read();


    }
}
