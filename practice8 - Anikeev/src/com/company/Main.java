package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BoundedWaitList<Integer> bwList = new BoundedWaitList<Integer>(10);
        for(int i =0; i<10;i++)
            bwList.add(i);
        try {
            bwList.add(10);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bounds");
        }
        System.out.println(bwList.toString());

        UnfairWaitList<Integer> uwList = new UnfairWaitList<Integer>();
        for(int i =0; i<10;i++)
            uwList.add(i);
        uwList.remove(0);
        uwList.remove(2);
        System.out.println(uwList.toString());
        uwList.moveToBack(4);
        System.out.println(uwList.toString());

    }
}
