package com.eindopdracht.java;
//GBP_MSRP","USD_MSRP","CAD_MSRP","EUR_MSRP","Packaging","Availability"
public class Lego {
    public int item_number;
    public String name;
    public String Year;
    public String theme;
    public String subTheme;
    public String pieces;
    public String miniFigures;
    public String img_URL;
    public String GBP_MSRP;
    public String USD_MSRP;
    public String CAD_MSRP;
    public String EUR_MSRP;
    public String packaging;
    public String availability;
    public Lego(int tItem_number,
                String tName,
                String tYear,
                String tTheme,
                String tSubTheme,
                String tpieces,
                String tMiniFigures,
                String tImg_URL,
                String tGBP_MSRP,
                String tUSD_MSRP,
                String tCAD_MSRP,
                String tEUR_MSRP,
                String tPackaging,
                String tAvailability)
    {
        item_number = tItem_number;
        name = tName;
        Year = tYear;
        theme = tTheme;
        subTheme = tSubTheme;
        pieces = tpieces;
        miniFigures = tMiniFigures;
        img_URL = tImg_URL;
        GBP_MSRP = tGBP_MSRP;
        USD_MSRP = tUSD_MSRP;
        CAD_MSRP = tCAD_MSRP;
        EUR_MSRP = tEUR_MSRP;
        packaging = tPackaging;
        availability = tAvailability;
    }
}
