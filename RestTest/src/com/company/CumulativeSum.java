package com.company;

import java.util.ArrayList;

public class CumulativeSum {
    /**
     * Cumalative sum all the values for amount
     * @param  DoubleArray of string of date and amount in all pages
     * @return list of double value
     */

    public static ArrayList<Double> cumulativeSum(ArrayList<Double> DoubleArray) {

        Double sum = Double.valueOf(0);

        for (int i=0; i<DoubleArray.size(); i++) {
            sum += DoubleArray.get(i);
            DoubleArray.set(i, sum);
            /* System.out.println(DoubleArray.get(i));*/
        }

        return DoubleArray;
    }
}
