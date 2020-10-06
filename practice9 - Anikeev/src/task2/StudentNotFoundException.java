package task2;


public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super(name + "not found");
    }
}
