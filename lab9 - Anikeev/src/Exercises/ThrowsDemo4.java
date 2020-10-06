package Exercises;

import java.util.Scanner;

public class ThrowsDemo4 {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        while (true) {
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if(!key.equals("")) break;
        }

    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}