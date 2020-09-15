package Exercise1;


public class CircleTest {

    public static void main (String[] args) {
        Circle circ = new Circle(0,0,5);
        System.out.println("Длина окружности "+ circ.calculateLength());
        circ.printInfo();
    }
}
