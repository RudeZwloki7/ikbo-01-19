package Exercise1;

public class Person {
    private final String name;
    private final String surname;
    private final String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getInfo() {
        return new StringBuilder(surname)
                .append(name != null&&!name.isEmpty() ? " " + name.charAt(0) + "." : "")
                .append(patronymic != null ? " " + patronymic.charAt(0) + "." : "").toString();
    }
}
