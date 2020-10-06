package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    static <T> List<T> convert(T[] inputArray) {
        return new ArrayList<>(Arrays.asList(inputArray));
    }

    public static void main(String[] args) {

        String[] stringArray = {"first", "second", "third"};
        Integer[] intArray = {1, 2, 3};
        System.out.println(convert(stringArray));
        System.out.println(convert(intArray));


    }
}
