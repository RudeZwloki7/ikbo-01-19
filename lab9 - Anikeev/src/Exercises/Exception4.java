package Exercises;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        }
        catch (NumberFormatException e){
            System.out.println("Variable was entered in wrong format");
        }
        catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
        finally {
            System.out.println("This text will be printed in every case");
        }
    }
}