package com.company;

public class Main {

    public static void main(String[] args) {

        Students[] arr ={
                new Students("Ivan", (int) (Math.random()*100%10+1)),
                new Students("Petr", (int) (Math.random()*100%10+1)),
                new Students("Oleg", (int) (Math.random()*100%10+1)),
                new Students("John", (int) (Math.random()*100%10+1))
        };

        SortingStudentsByGPA.sort(arr);
    }
}
