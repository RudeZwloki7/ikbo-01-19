package com.company;

import java.util.Scanner;

public class Game {

    static int[] parseInput(String input){
        String[] listVal = input.split(" ");
        int[] deck = new int[listVal.length];
        for (int i =0; i<listVal.length; i++){
            deck[i]= Integer.parseInt(listVal[i]);
        }
        return deck;
    }


    Game(){
        Scanner scanner = new Scanner(System.in);
        String inputDeck1 = scanner.nextLine();
        String inputDeck2 = scanner.nextLine();
        int[] arr1 = parseInput(inputDeck1);
        int[] arr2 = parseInput(inputDeck2);
        Deck deck1 = new Deck(arr1);
        Deck deck2 = new Deck(arr2);
        int counter = 0;
        while(counter < 106){
            if(!deck1.check(deck2)) break;
            else counter++;
        }
        System.out.printf("%s %d", (!deck1.isEmpty()&&!deck2.isEmpty())?"botva":(deck1.isEmpty()?"second":"first"), counter);
    }
}
