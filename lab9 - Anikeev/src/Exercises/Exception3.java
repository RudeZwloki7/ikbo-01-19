package Exercises;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        catch (Exception e){
            System.out.println("Some error");
        }
//        Программа не собирает решение, так как исключения, приведенные ниже, перехватываются общим исключением классa Exception


//        catch (NumberFormatException e){
//            System.out.println("Variable was entered in wrong format");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Attempted division by zero");
//        }
    }

}
