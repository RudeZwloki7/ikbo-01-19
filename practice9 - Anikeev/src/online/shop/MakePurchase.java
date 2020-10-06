package online.shop;

public class MakePurchase {

    public static void main(String[] args) throws NotValidINNException {
        Client client = new Client("Walter", "White","119535");
        try {
            client.confirmINN("112343");
        }catch (NotValidINNException e){
            e.printStackTrace();
        }
    }
}
