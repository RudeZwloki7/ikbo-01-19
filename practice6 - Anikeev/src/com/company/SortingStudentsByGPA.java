package com.company;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Students> {


    public static void sort (Students[] listStudents){
        int n = listStudents.length;
        QuickSort sorter = new QuickSort();
        sorter.sort(listStudents, 0, n-1);
        System.out.println("sorted array");
        QuickSort.printArray(listStudents);
    }

    @Override
    public int compare(Students o1, Students o2) {
        return o1.compareTo(o2);
    }
}
