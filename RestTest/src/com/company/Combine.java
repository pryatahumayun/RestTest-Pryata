package com.company;

import java.util.ArrayList;

public class Combine {

    /**
     * combine the old list of string and the list of new double values
     * @param sortedlist the list of old string
     * @param DoubleArray the list of new double value
     * @return the list of new strings
     */
    public static ArrayList<String> combine(ArrayList<String> sortedlist,
                                            ArrayList<Double> DoubleArray) {

        ArrayList<String> newListDataCumulativeSum = new ArrayList<>();
        if (sortedlist.size() != DoubleArray.size()){
            for (String str : sortedlist) {
                newListDataCumulativeSum.add(str);
            }
        } else {
            for (int i = 0; i < sortedlist.size(); i++) {
                String str = sortedlist.get(i);
                String [] sp = str.split("\\s+");

                try {
                    newListDataCumulativeSum.add(String.format("%s %.2f", sp[0], DoubleArray.get(i)));
                } catch (Exception ex){
                    newListDataCumulativeSum.add(str);
                }
            }
        }

        return newListDataCumulativeSum;
    }
}
