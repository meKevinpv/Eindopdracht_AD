package com.eindopdracht.java;

import java.util.ArrayList;

public class Quicksort {

    int partition(ArrayList<Lego> arr, int low, int high)
    {
        int pivot = arr.get(high).item_number;
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or equal to pivot
            if (arr.get(j).item_number <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                Lego temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        Lego temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i+1;
    }


    void sort(ArrayList<Lego> arr, int low, int high)
    {
        if (low < high)
        {
            // pi is index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    // A function to print array of size n
    static void printArray(ArrayList<Lego> arr)
    {
        int n = arr.size();
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i).item_number +" ");
        System.out.println();
    }

    //public ArrayList<Lego> getLegoArray() {
    //    return dataSet;
    //}

    // Driver program
    public static void main(String args[])
    {
        ArrayList<Lego> dataSet = new ArrayList<Lego>();
        Parser validator = new Parser("C:\\Users\\Randy\\Documents\\GitHub\\Eindopdracht_AD\\src\\com\\eindopdracht\\java\\data.csv");
        System.out.println("Quicksort active=====================================================================================================================");
        dataSet = validator.getLegoArray();
        int n = dataSet.size();
        Quicksort ob = new Quicksort();
        ob.sort(dataSet, 0, n-1);

        System.out.println("sorted array");
        printArray(dataSet);
    }
}