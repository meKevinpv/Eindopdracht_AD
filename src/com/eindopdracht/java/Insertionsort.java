package com.eindopdracht.java;

import java.util.ArrayList;
import java.util.Collections;

public class Insertionsort {

    private ArrayList<Lego> dataSet = new ArrayList<Lego>();

    public Insertionsort() {
        Parser validator = new Parser("C:\\Users\\Siem\\Documents\\GitHub\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("insertionsort active=====================================================================================================================");
        dataSet = validator.getLegoArray();

        //sorting start hier

//        int x;
//        Lego temp;
//        for (int i = 1; i < dataSet.size(); i++) {
//            x = dataSet.get(i).item_number;
//            temp = dataSet.get(i);
//            while ((i - 1 >= 0) && (x < dataSet.get(i - 1).item_number)) {
//                dataSet.set(i,dataSet.get(i-1));
//                i--;
//            }
//            dataSet.get(i).item_number = x;
//        }

        for(int i=1;i<dataSet.size();i++){

            int key = dataSet.get(i).item_number;
            Lego temp = dataSet.get(i);

            for(int j= i-1;j>=0;j--){
                if(key<dataSet.get(j).item_number){
                    // Shifting Each Element to its right as key is less than the existing element at current index
                    dataSet.set(j+1,dataSet.get(j));

                    // Special case scenario when all elements are less than key, so placing key value at 0th Position
                    if(j==0){
                        dataSet.set(0, temp);
                    }
                }else{
                    // Putting Key value after element at current index as Key value is no more less than the existing element at current index
                    dataSet.set(j+1,temp);
                    break; // You need to break the loop to save un necessary iteration
                }
            }
        }


        //visuele check

        for (int y = 0; y < dataSet.size(); y++) {
            System.out.println(y + " " + dataSet.get(y).item_number);
        }


    }

}
