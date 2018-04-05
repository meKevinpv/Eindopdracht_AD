package com.eindopdracht.java;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;

public class MainTest {
    private ArrayList<Lego> dataSet = new ArrayList<>();
    private ArrayList<Lego> sorted = new ArrayList<>();

    public MainTest() {
        Parser validator = new Parser("C:\\Users\\Cornee\\Google Drive\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("NewStack is active");
        dataSet = validator.getLegoArray();
    }

    @Test
    public void Bubblesort(){
        Bubblesort bubblesort = new Bubblesort();
        sorted = bubblesort.getLegoArray();

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
    public void Quicksort(){
        Quicksort quicksort = new Quicksort();
        sorted = quicksort.getLegoArray();

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

    @After
    public void enqueueLegos(){
        NewStack newStack = new NewStack(dataSet.size());

        for(Lego lego : dataSet) {
            newStack.push(lego);
        }

        System.out.println("Stack size: " + newStack.size());

        newStack.pop();

        System.out.println("Stack size: " + newStack.size());
    }

    @After
    public void sizeLegos(){

    }
}