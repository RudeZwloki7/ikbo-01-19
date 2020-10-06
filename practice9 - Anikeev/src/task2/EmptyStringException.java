package task2;

public class EmptyStringException extends Exception {
    public EmptyStringException(String field) {
        super(field+" is empty.");
    }
}
