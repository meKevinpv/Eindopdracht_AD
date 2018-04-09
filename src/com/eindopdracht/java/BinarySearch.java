package com.eindopdracht.java;

import java.util.ArrayList;

public class BinarySearch {
    // Returns index of x if it is present in dataset
    int binarySearch(int x)
    {
        Parser validator = new Parser("C:\\Users\\Randy\\Documents\\GitHub\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        ArrayList<Lego> dataSet = new ArrayList<Lego>();
        dataSet = validator.getLegoArray();
        int l = 0, r = dataSet.size() - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if x is present at mid
            if (dataSet.get(m).item_number == x)
                return m;

            // If x greater, ignore left half
            if (dataSet.get(m).item_number < x)
                l = m + 1;
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not found
         return -1;
    }
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        System.out.println("BinarySearchTree insert active=====================================================================================================================");
        int x = 101;
        int result = ob.binarySearch(x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

