package com.eindopdracht.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Parser {
    private ArrayList<Lego> dataSet = new ArrayList<Lego>();
    private LinkedList<Lego> doublyLinkedList = new LinkedList<Lego>();
    private SinglyLinkedList<Lego> singlyLinkedList = new SinglyLinkedList<Lego>();

    public Parser(String fileLocation){
        String csvFile = fileLocation;
        //String csvFile = "C:\\Users\\Kevin\\Documents\\GitHub\\ThinkDataStructures\\Eindopdracht\\src\\com\\eindopdracht\\java\\data.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int lines = 1;
        int i =0;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if (lines != 1) {
                    String[] stringArray = line.split(cvsSplitBy);
                    int validationNum = validateLines(stringArray, lines);
                    if (validationNum != -1) {
                        Lego tempLego = new Lego(validationNum,
                                stringArray[1],
                                stringArray[2],
                                stringArray[3],
                                stringArray[4],
                                stringArray[5],
                                stringArray[6],
                                stringArray[7],
                                stringArray[8],
                                stringArray[9],
                                stringArray[10],
                                stringArray[11],
                                stringArray[12],
                                stringArray[13]);
                        dataSet.add(tempLego);
                        doublyLinkedList.add(tempLego);
                        singlyLinkedList.add(tempLego);
                    }
                }
                lines++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println(dataSet.size());
    }

    public ArrayList<Lego> getLegoArray() {
        return dataSet;
    }
    public LinkedList<Lego> getLinkedList(){
        return doublyLinkedList;
    }

    private static int validateLines(String[] stringArr, int lineNo){
        int returnInt = -1;
        if(stringArr.length==14){
            try {
                returnInt = Integer.parseInt(stringArr[0].replace("\"", ""));
                return returnInt;
            } catch (NumberFormatException e) {
                System.out.println("line: "+lineNo+" INVALID LINE: ID was not integer");
                return returnInt;
            }
        }

        System.out.println("line: "+lineNo+" INVALID LINE: Not enough values");
        return returnInt;
    }

}
