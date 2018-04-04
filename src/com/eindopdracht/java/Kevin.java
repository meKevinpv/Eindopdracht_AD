package com.eindopdracht.java;

import java.util.ArrayList;

public class Kevin {
    private ArrayList<Lego> arrayList;

    public Kevin(ArrayList<Lego> arrayList){
        this.arrayList = arrayList;
    }
    public Lego sequentialSearch(int id){
        int i=0;
        while(i<arrayList.size()){
            if(arrayList.get(i).item_number==id){
                return arrayList.get(i);
            }
            else{
                i++;
            }
        }
        return null;
    }
}
