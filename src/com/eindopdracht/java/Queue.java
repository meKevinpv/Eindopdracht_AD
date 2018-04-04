package com.eindopdracht.java;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

class NewQueue {

    private LinkedList<Lego> dataSet = new LinkedList<>();
    private Queue<Lego> queue = new LinkedList<>();

    public NewQueue() {
        Parser validator = new Parser("C:\\Users\\Cornee\\Google Drive\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("NewQueue is active");
        dataSet = validator.getLinkedList();

        Queue<Lego> queue = new LinkedList<>();

        // .addAll() kan een collectie ontvangen en deze in een datatype storen.
        queue.addAll(dataSet);

        listQueue();
    }

    private void listQueue() {
        Iterator it = queue.iterator();

        System.out.println("Queue size:" + queue.size());

        while(it.hasNext())
        {
            String iteratorValue = it.next().toString();
            System.out.println("Queue Next Value :"+iteratorValue);
        }
    }
}
