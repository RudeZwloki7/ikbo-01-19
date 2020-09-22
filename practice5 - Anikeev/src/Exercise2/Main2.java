package Exercise2;

import java.util.Scanner;

public class Main2 {

    static void foo(int a, int n) {
        a++;
        System.out.printf("%d ",a);
        if (a==n) return;
        else foo(a,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        foo(0,n);
    }
}
