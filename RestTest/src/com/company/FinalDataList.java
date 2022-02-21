package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class FinalDataList {
    /**
     * Final Data list
     * @param  newListDataCumulativeSum list of all data that have gone through cumulative Sum
     * @return list of running balance per day
     */
    public static ArrayList<String> finalList(ArrayList<String> newListDataCumulativeSum) {

        if (newListDataCumulativeSum != null) {
            ArrayList<String> output = new ArrayList<>();


            class Record {
                String date;
                String content;

                /**
                 * constructor
                 */
                public Record(String content) {
                    this.content = content;
                    String[] sp = content.split("\\s+");
                    this.date = sp[0];
                }

                /**
                 * for 2 record comparison
                 */
                @Override
                public boolean equals(Object obj) {
                    if (obj == null) {
                        return false;
                    }
                    if (obj.getClass() != this.getClass()) {
                        return false;
                    }
                    Record r = (Record) obj;
                    return date.equals(r.date);
                }

            }
            ;


            ArrayList<Record> records = new ArrayList<>();


            for (String string : newListDataCumulativeSum) {
                Record record = new Record(string);
                boolean notFound = true;
                for (Record rec : records) {
                    if (rec.equals(record)) {
                        rec.content = string;
                        notFound = false;
                        break;
                    }
                }

                if (notFound) {
                    records.add(record);
                }
            }

            for (Record record : records) {
                output.add(record.content);

            }
            for (String element : output) {
                System.out.println(element);
            }
            return output;
        }
        System.out.println("404 page not found");
        return null;
    }

    }

