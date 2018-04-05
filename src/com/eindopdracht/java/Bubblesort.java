package com.eindopdracht.java;

import java.util.ArrayList;
import java.util.Collections;

public class Bubblesort {

    private ArrayList<Lego> dataSet = new ArrayList<Lego>();

    public Bubblesort() {
        Parser validator = new Parser("C:\\Users\\Siem\\Documents\\GitHub\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("bubblesort active=====================================================================================================================");
        dataSet = validator.getLegoArray();

        //sorting start hier

        int i, j;
        for(j = 0; j < dataSet.size(); j++) {
            for (i = 1; i < dataSet.size() - j; i++) {
                if(dataSet.get(i-1).item_number > dataSet.get(i).item_number) {
                    Collections.swap(dataSet, i, i-1);
                }
            }
        }

        //visuele check

        for (int x = 0; x < dataSet.size(); x++) {
            System.out.println(x + " " + dataSet.get(x).item_number);
        }


    }

    public ArrayList<Lego> getLegoArray() {
        return dataSet;
    }

}


