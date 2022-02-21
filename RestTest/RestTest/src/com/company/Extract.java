package com.company;

import java.util.ArrayList;

public class Extract {
    /**
     * extract the list of double value from the list of string
     * @param  extractListData list of string of date and amount in all pages
     * @return list of double value
     */
    public static ArrayList<Double> extract(ArrayList<String> extractListData) {
        ArrayList<Double> DoubleArray = new ArrayList<>();
        if (extractListData != null) {
            for (String str : extractListData) {
                String[] sp = str.split("\\s+");
                try {
                    Double value = Double.parseDouble(sp[1]);
                    DoubleArray.add(value);
                } catch (Exception ex) {
                    DoubleArray.add(0.0);
                }
            }
            return DoubleArray;
        }
        return null;
    }
}
