package Exercise2;

public class Test {
    public static void main(String[] args) {
        Food apple = new Food(1.25);
        Clothes tShirt = new Clothes(104.5);
        Transport bicycle = new Transport(5124);
        System.out.println(apple.getPrice());
        System.out.println(tShirt.getPrice());
        System.out.println(bicycle.getPrice());
    }
}
