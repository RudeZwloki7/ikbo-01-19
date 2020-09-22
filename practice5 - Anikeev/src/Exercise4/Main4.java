package Exercise4;

import java.util.Scanner;

public class Main4 {

    public static int getCapacity(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int getSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void foo(int num, int k, int s, int counter) {
        if (getCapacity(num) != k) System.out.println(counter);
        else {
            if (getSum(num) == s) {
                counter++;
            }
            num--;
            foo(num, k, s, counter);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int num = (int) (Math.pow(10, k) - 1);
        int counter = 0;
        foo(num, k, s, counter);

    }
}
