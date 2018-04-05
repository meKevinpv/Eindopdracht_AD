package com.eindopdracht.java;

public class NewStack {
    private int top;
    int size;
    Lego[] stack;

    public NewStack(int parSize){
        size = parSize;
        stack= new Lego[size];
        top = -1;
    }

    public boolean push(Lego value){
        if(top == size-1) {
           return false;
        }

        top += 1;
        stack[top] = value;
        return true;
    }

    public boolean pop() {
        if(!isEmpty()) {
            top = top - 1;
            return true;
        }

        return false;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public int size() {
        return this.top;
    }
    public Lego peek() { return stack[top]; }
}