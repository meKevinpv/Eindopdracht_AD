package com.eindopdracht.java;

import java.util.LinkedList;

class NewQueue {
    private LinkedList<Lego> list = new LinkedList<Lego>();

    public void enqueue(Lego item) {
        list.addLast(item);
    }
    public Lego dequeue() {
        return list.poll();
    }
    public boolean hasItems() {
        return !list.isEmpty();
    }
    public int size() {
        return list.size();
    }
    public Lego peek() {
        return list.peek();
    }
    public Lego poll() {
        return list.poll();
    }
    public Lego remove() {
        return list.remove();
    }
}
