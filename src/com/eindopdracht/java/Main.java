package com.eindopdracht.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
      Parser validator = new Parser("src\\com\\eindopdracht\\java\\data.csv");
      Insertionsort insertionsort = new Insertionsort();
      Bubblesort bubblesort = new Bubblesort();
      Smartbubblesort smartbubblesort = new Smartbubblesort();
      //Parser validator = new Parser("C:\\Users\\SequentialSearcher\\Documents\\Eindopdracht\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
    }
}
