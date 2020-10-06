package lab10;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayStorage<Integer> array = new ArrayStorage<>(3);
        array.add(5);
        array.add(1);
        array.add(9);
        System.out.println(array);

        ArrayStorage<String> arrayStorage = new ArrayStorage<>(3);
        arrayStorage.add("first");
        arrayStorage.add("second");
        arrayStorage.add("third");
        System.out.println(arrayStorage);
    }

}
