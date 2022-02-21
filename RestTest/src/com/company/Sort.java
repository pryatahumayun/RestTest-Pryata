package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
    /**
     * Sort Data list
     * @param  listDataSorted list of string of date and amount in all pages
     * @return list of date and amount in all pages sorted
     */
    public static ArrayList<String> sort(ArrayList<String> listDataSorted) {
        Collections.sort(listDataSorted, new Comparator<String>() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

            @Override
            public int compare(String Date1, String Date2) {
                try {
                    return dateFormat.parse(Date1).compareTo((dateFormat).parse(Date2));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }

            }
        });

        /*System.out.println(listDataSorted);*/
        return listDataSorted;
    }

}
