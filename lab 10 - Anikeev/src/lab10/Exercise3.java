package lab10;

public class Exercise3 {
    public static void main(String[] args) throws Exception {
        ArrayStorage<Integer> array = new ArrayStorage<>(3);
        array.add(5);
        array.add(1);
        array.add(9);
        System.out.println(array.getByIndex(2));

    }
}
