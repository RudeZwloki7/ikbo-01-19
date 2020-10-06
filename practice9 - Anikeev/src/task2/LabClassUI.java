package task2;


import java.util.ArrayList;

public interface LabClassUI {
    void add(Students student);
    ArrayList<Students> getStudents();
    void sortBySurname();
    void sortByGPA();
    Students findStudent(String name, String surname) throws StudentNotFoundException;
}
