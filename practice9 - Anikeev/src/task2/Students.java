package task2;

public class Students implements Comparable<Students>{
    final private String name;
    final private String surname;
    final private int grade;

    public Students(String name, String surname, int grade) throws EmptyStringException {
        this.name = name;
        if(name.isEmpty()) throw new EmptyStringException("name");
        this.surname =  surname;
        if(surname.isEmpty()) throw new EmptyStringException("surname");
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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
        return "Students{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                '}';
    }
}
