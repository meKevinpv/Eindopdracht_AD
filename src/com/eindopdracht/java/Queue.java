package com.eindopdracht.java;

import java.util.LinkedList;

class NewQueue {
    private LinkedList<Lego> list = new LinkedList<Lego>();

    // Voeg het Lego element aan het einde van de list toe.
    public void enqueue(Lego item) {
        list.addLast(item);
    }

    // Verwijder het eerste element (head) uit de lijst.
    public Lego dequeue() {
        return list.poll();
    }

    // Returns de lengte van de queue.
    public int size() {
        return list.size();
    }

    // Returns het eerste element (head) maar verwijdert het niet.
    public Lego peek() {
        return list.peek();
    }
}
