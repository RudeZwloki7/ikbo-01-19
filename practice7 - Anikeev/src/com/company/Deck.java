package com.company;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Deck implements Comparator<Card> {
    int size;
    Queue<Card> queue = new LinkedList<Card>();


    public Deck() {
    }

    public Deck(int size) {
        this.size = size;
    }

    public Deck(int[] array) {
        size = array.length;
        for (int i : array) {
            queue.add(new Card(i));
        }
    }
    public boolean check(Deck enemyDeck){
        if (this.isEmpty()||enemyDeck.isEmpty()) return false;
        if (this.compare(queue.peek(),enemyDeck.queue.peek())>=0){
         queue.offer(queue.poll());
         queue.offer(enemyDeck.queue.poll());
        }
        else{
            enemyDeck.queue.offer(queue.poll());
            enemyDeck.queue.offer(enemyDeck.queue.poll());
        }
        return true;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int getSize() {
        return size;
    }


    @Override
    public int compare(Card o1, Card o2) {
        return o1.compareTo(o2);
    }
}
