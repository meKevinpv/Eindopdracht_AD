package com.eindopdracht.java;

import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NewQueueTest {

    private ArrayList<Lego> dataSet = new ArrayList<>();

    public NewQueueTest() {
        Parser validator = new Parser("C:\\Users\\Cornee\\Google Drive\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("NewQueue is active");
        dataSet = validator.getLegoArray();
    }

    @After
    public void enqueueLegos(){
        NewQueue newQueue = new NewQueue();

        for(Lego lego : dataSet) {
            newQueue.enqueue(lego);
        }

        System.out.println("Queue size: " + newQueue.size());
        System.out.println("Queue peek: " + newQueue.peek());
        System.out.println("Queue poll: " + newQueue.poll());
        System.out.println("Queue size: " + newQueue.size());
    }

    @After
    public void sizeLegos(){

    }

}