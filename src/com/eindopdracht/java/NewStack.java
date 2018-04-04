package com.eindopdracht.java;

import java.util.ArrayList;

public class NewStack {
    private int top;
    int size;
    Lego[] stack;

    private ArrayList<Lego> dataSet = new ArrayList<>();

    public NewStack(){
        size = dataSet.size();
        stack= new Lego[size];
        top=-1;

        Parser validator = new Parser("C:\\Users\\Cornee\\Google Drive\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("NewQueue is active");
        dataSet = validator.getLegoArray();
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
            System.out.println("Can't pop...stack is empty");
        }
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void display(){

        for(int i = 0; i <= top; i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println();
    }
}