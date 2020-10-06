package Exercises;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            //throw e;
            System.out.println("Key set to empty string");
        }
    }
    private String getDetails(String key) {
        if(key.equals("")) {
            throw new NullPointerException( "Key set to empty string" );
        }
        return "data for " + key; }
}

