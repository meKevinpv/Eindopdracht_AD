package com.eindopdracht.java;

import java.util.ArrayList;

public class NewStack {
    private int top;
    int size;
    Lego[] stack;

    public NewStack(int parSize){
        size = parSize;
        stack= new Lego[size];
        top=-1;
    }

    public void push(Lego value){
        if(top == size-1) {
            System.out.println("Stack zit vol!");
        } else {
            top += 1;
            stack[top] = value;
        }
    }

    public void pop() {
        if(!isEmpty()) {
            top = top - 1;
        } else {
            System.out.println("Stack leeg!");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i = 0; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return this.top;
    }
}