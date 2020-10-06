package online.shop;

public class Client {
    private String name;
    private String surname;
    private String INN;

    public Client(String name, String surname, String INN){
        this.name = name;
        this.surname = surname;
        this.INN = INN;
    }

    public void confirmINN(String INN) throws NotValidINNException {
        if(!INN.equals(this.INN)) throw new NotValidINNException();

    }
}
