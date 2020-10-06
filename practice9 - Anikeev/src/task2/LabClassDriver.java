package task2;

import java.util.ArrayList;
import java.util.Comparator;

public class LabClassDriver implements LabClassUI {

    private ArrayList<Students> students;

    public LabClassDriver() {
        this.students = new ArrayList<>();
    }

    @Override
    public void add(Students student) {
        students.add(student);
    }

    @Override
    public ArrayList<Students> getStudents() {
        return students;
    }

    @Override
    public void sortBySurname() {
        System.out.println("Sort by surname: ");
        students.sort(Comparator.comparing(Students::getSurname));
    }

    @Override
    public void sortByGPA() {
        SortingStudentsByGPA.sort( students.toArray(Students[]::new));

    }

    @Override
    public Students findStudent(String name, String surname) throws StudentNotFoundException {
            for (Students i : students){
                if (name.equals(i.getName())&&surname.equals(i.getSurname()))
                    return i;
            }
            throw new StudentNotFoundException(name+" "+ surname);
    }
}
