/*package com.eindopdracht.java;

import org.junit.After;

import java.util.ArrayList;

class NewStackTest {

    private ArrayList<Lego> dataSet = new ArrayList<>();

    public NewStackTest() {
        Parser validator = new Parser("C:\\Users\\Cornee\\Google Drive\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("NewStack is active");
        dataSet = validator.getLegoArray();
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
}*/