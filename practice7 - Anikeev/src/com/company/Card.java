package com.company;

public class Card implements Comparable<Card> {

    int value;
    private static final int min_value = 0;
    public static final int max_value = 9;


    Card(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Card o) {
        if (o.value == min_value && value == max_value)
            return o.value - value;
        else
            return value - o.value;
    }
}
