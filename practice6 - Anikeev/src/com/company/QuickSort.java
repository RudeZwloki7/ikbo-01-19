package com.company;

class QuickSort {
    Students[] listStudents;

    int partition(Students[] listStudents, int low, int high) {
        Students pivot = listStudents[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (listStudents[j].compareTo(pivot) < 0) {
                i++;

                // swap arr[i] and arr[j]
                Students temp = listStudents[i];
                listStudents[i] = listStudents[j];
                listStudents[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Students temp = listStudents[i + 1];
        listStudents[i + 1] = listStudents[high];
        listStudents[high] = temp;

        return i + 1;
    }

    void sort(Students[] listStudents, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(listStudents, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(listStudents, low, pi - 1);
            sort(listStudents, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(Students[] listStudents) {
        int n = listStudents.length;
        for (Students listStudent : listStudents) System.out.println(listStudent.toString());
    }
}


