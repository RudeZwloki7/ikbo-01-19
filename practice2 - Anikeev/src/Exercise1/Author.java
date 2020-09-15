package Exercise1;

public class Author {

    private String name;
    private String email;
    private char gender;

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public Author (String name, String email, char gender){
       this.setEmail(email);
       this.gender = gender;
       this.name = name;
    }

    @Override
    public String toString() {
        return getName() + '(' + getGender() + ") at "+ getEmail();
    }
}
