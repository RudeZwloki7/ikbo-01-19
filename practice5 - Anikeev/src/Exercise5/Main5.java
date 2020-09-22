package Exercise5;

import java.util.Scanner;

public class Main5 {

    public static void foo(int num, int sum) {
        if (num==0) System.out.println(sum);
        else{
            sum+=num%10;
            num/=10;
            foo(num, sum);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        foo(num,sum);
    }

}
