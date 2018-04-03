package com.eindopdracht.java;
//GBP_MSRP","USD_MSRP","CAD_MSRP","EUR_MSRP","Packaging","Availability"
public class Lego {
    public String item_number;
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
    public Lego(String tItem_number,
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
        tItem_number = item_number;
        tName = name;
        tYear = Year;
        tTheme = theme;
        tSubTheme = subTheme;
        tpieces = pieces;
        tMiniFigures = miniFigures;
        tImg_URL = img_URL;
        tGBP_MSRP = GBP_MSRP;
        tUSD_MSRP = USD_MSRP;
        tCAD_MSRP = CAD_MSRP;
        tEUR_MSRP = EUR_MSRP;
        tPackaging = packaging;
        tAvailability = availability;
    }
}
