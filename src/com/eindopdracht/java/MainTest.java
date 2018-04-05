package com.eindopdracht.java;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class MainTest {
    private ArrayList<Lego> legoSet = new ArrayList<>();
    private LinkedList<Lego> listSet = new LinkedList<>();
    private ArrayList<Lego> sorted = new ArrayList<>();
    private Parser validator;

    public MainTest() {
        validator = new Parser("src\\com\\eindopdracht\\java\\data.csv");

        legoSet = validator.getLegoArray();
        listSet = validator.getLinkedList();
    }

    @Test
    public void Bubblesort(){
        Bubblesort bubblesort = new Bubblesort();
        sorted = bubblesort.getLegoArray();

        if(sorted.size() == 0){
            assert(false);
            return;
        }

        int i, j;
        for(j = 0; j < sorted.size(); j++) {
            boolean flag = true;
            for (i = 1; i < sorted.size() - j; i++) {
                if(sorted.get(i-1).item_number > sorted.get(i).item_number) {
                    flag = false;
                }
            }
            if (flag) {
                assert(true);       //test geslaagd
                break;
            }else {
                assert(false);      //test failed
            }

        }



    }

    @Test
    public void Insertionsort(){
        Insertionsort insertionsort = new Insertionsort();
        sorted = insertionsort.getLegoArray();

        if(sorted.size() == 0){
            assert(false);
            return;
        }

        int i, j;
        for(j = 0; j < sorted.size(); j++) {
            boolean flag = true;
            for (i = 1; i < sorted.size() - j; i++) {
                if(sorted.get(i-1).item_number > sorted.get(i).item_number) {
                    flag = false;
                }
            }
            if (flag) {
                assert(true);       //test geslaagd
                break;
            }else {
                assert(false);      //test failed
            }

        }


    }

    @Test
    public void Smartbubblesort(){
        Smartbubblesort smartbubblesort = new Smartbubblesort();
        sorted = smartbubblesort.getLegoArray();

        if(sorted.size() == 0){
            assert(false);
            return;
        }

        int i, j;
        for(j = 0; j < sorted.size(); j++) {
            boolean flag = true;
            for (i = 1; i < sorted.size() - j; i++) {
                if(sorted.get(i-1).item_number > sorted.get(i).item_number) {
                    flag = false;
                }
            }
            if (flag) {
                assert(true);       //test geslaagd
                break;
            }else {
                assert(false);      //test failed
            }

        }


    }

//    @Test
//    public void Quicksort(){
//        Quicksort quicksort = new Quicksort();
//        sorted = quicksort.getLegoArray();
//
//        int i, j;
//        for(j = 0; j < sorted.size(); j++) {
//            boolean flag = true;
//            for (i = 1; i < sorted.size() - j; i++) {
//                if(sorted.get(i-1).item_number > sorted.get(i).item_number) {
//                    flag = false;
//                }
//            }
//            if (flag) {
//                assert(true);       //test geslaagd
//                break;
//            }else {
//                assert(false);      //test failed
//            }
//
//        }
//
//
//    }

    /**
     * De stack wordt geïnstantieerd en gepopuleerd.
     * Ter illustratie van het LIFO-principe wordt de head element verwijderd van de stack en lokaal opgeslagen in een variabel.
     * Daarna wordt het element weer toegevoegd aan het begin van de stack en dus bovenop.
     */
    @Test
    public void StackTest() {
        NewStack newStack = new NewStack(listSet.size());

        for(Lego lego : listSet) {
            newStack.push(lego);
        }

        System.out.println("Stack size: " + newStack.size());
        System.out.println("Stack name: " + newStack.peek().name);

        Lego oldTop = newStack.peek();

        newStack.pop();

        System.out.println("Stack size: " + newStack.size());
        System.out.println("Stack name: " + newStack.peek().name);

        newStack.push(oldTop);

        System.out.println("Stack size: " + newStack.size());
        System.out.println("Stack name: " + newStack.peek().name);
    }

    /**
     * De queue wordt geïnstantieerd en gepopuleerd.
     * Ter illustratie van het FIFO-principe wordt de head element verwijderd van de queue en lokaal opgeslagen in een variabel.
     * Daarna wordt het element weer toegevoegd aan het einde van de queue.
     */
    @Test
    public void QueueTest(){
        NewQueue newQueue = new NewQueue();

        for(Lego lego : listSet) {
            newQueue.enqueue(lego);
        }

        System.out.println("Queue size: " + newQueue.size());
        System.out.println("Queue head: " + newQueue.peek().name);

        Lego oldTop = newQueue.peek();

        newQueue.dequeue();

        System.out.println("Queue new head: " + newQueue.peek().name);
        System.out.println("Queue new size: " + newQueue.size());

        newQueue.enqueue(oldTop);

        System.out.println("Queue new head: " + newQueue.peek().name);
        System.out.println("Queue new size: " + newQueue.size());

        assertEquals(true,newQueue.peek().item_number == 10247);
    }
}