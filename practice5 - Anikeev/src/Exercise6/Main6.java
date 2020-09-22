package Exercise6;

import java.util.Scanner;

public class Main6 {

    public static void foo(int inp_num, int num) {
        if (num == 1) {
            System.out.println("YES");
            return;
        }
        try {
            if (inp_num % num == 0)
                System.out.println("NO");
            else{
                num--;
                foo(inp_num, num);
            }
        } catch (ArithmeticException e) {
            System.out.println("YES");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp_num = sc.nextInt();
        int num = inp_num - 1;
        foo(inp_num, num);
    }
}
