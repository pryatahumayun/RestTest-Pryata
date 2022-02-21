package com.company;

import java.util.ArrayList;

import static com.company.Combine.combine;
import static com.company.CumulativeSum.cumulativeSum;
import static com.company.Extract.extract;
import static com.company.Parse.parse;
import static com.company.Sort.sort;
import static com.company.FinalDataList.finalList;

public class Compile {
    /**
     * Compile all the Methods
     * @param  responseBody list of all data that have gone through cumulative Sum
     * @return list of running balance per day
     */
    public static ArrayList<String> compile(String responseBody) {
        ArrayList<String> listData;
        listData = parse(responseBody.toString());
        ArrayList<String> sortData;
        sortData = sort(listData);
        ArrayList<Double> DoubleArray;
        DoubleArray = extract(sortData);
        ArrayList<Double> DoubleArrayCumulative;
        DoubleArrayCumulative = cumulativeSum(DoubleArray);
        ArrayList<String> CalculatedList;
        CalculatedList = combine(sortData,DoubleArrayCumulative);
        ArrayList<String> finalLists;
        finalLists = finalList(CalculatedList);
        return CalculatedList;
    }
}


