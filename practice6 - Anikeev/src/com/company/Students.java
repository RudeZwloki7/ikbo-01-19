package com.company;

public class Students implements Comparable<Students>{
    final private String name;
    final private int grade;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Students o) {
        return Integer.compare(getGrade(),o.getGrade());
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", grade=" + grade;
    }
}
