package Exercise4;

public class Test {
    public static void main(String[] args) {
        Item juice = new Drink("apple juice","This is juice");
        RestarauntOrder order = new RestarauntOrder();
        order.add(juice);
    }
}
