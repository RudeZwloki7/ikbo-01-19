package Ex1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory obj = new ConcreteFactory();
        Complex num =obj.createComplex();
        num.setRealCoeff(3);
        num.setImgCoeff(-2);
        System.out.println(num);
        System.out.println(obj.CreateComplex(5,2));

    }
}
