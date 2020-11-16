package com.company;

import java.util.regex.Pattern;

public class Main {
    private static final String regex = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/(19[0-9]{2}|[2-9][0-9]{3})";

    public static void main(String[] args) {
        for (String input: new String[]{"15/07/2002", "00/03/2021", "12/12/1999", "45/12/1880"})
            System.out.println(input + " is " + Pattern.compile(regex).matcher(input).matches() + " date" );
    }
}
