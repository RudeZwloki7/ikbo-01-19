package task2;

public class LabClass {
    public static void makeStudentClass(String[] args) {
        LabClassDriver studentsClass = new LabClassDriver();

        try {
            studentsClass.add(new Students("Ivan", "Ivanov", (int) (Math.random() * 100 % 10 + 1)));
            studentsClass.add(new Students("Petr", "Petrov", (int) (Math.random() * 100 % 10 + 1)));
            studentsClass.add(new Students("Oleg", "Nechiporenko", (int) (Math.random() * 100 % 10 + 1)));
            studentsClass.add(new Students("John", "White", (int) (Math.random() * 100 % 10 + 1)));

        } catch (EmptyStringException e) {
            e.printStackTrace();
        }

        studentsClass.sortBySurname();
        System.out.println(studentsClass.getStudents());

        studentsClass.sortByGPA();

        try {
            System.out.println("Found student: "+ studentsClass.findStudent("Ivan","Ivanov"));

        } catch (StudentNotFoundException e) {
            e.printStackTrace();
        }


    }
}
