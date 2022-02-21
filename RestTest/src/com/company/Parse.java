package com.company;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Parse {
    /**
     * Parse response body to get Date and Amount
     * @param responseBody the JSON body
     * @return list of date and amount in all pages
     */
    public static ArrayList<String> parse(String responseBody) {
        if (responseBody.contains("404 page not found")) {
        return null;
        }
            JSONObject transactions = new JSONObject(responseBody);

            JSONArray arr = transactions.getJSONArray("transactions");
            ArrayList<String> listData = new ArrayList<String>();
            for (int i = arr.length() - 1; i >= 0; i--) {

                JSONObject transaction = arr.getJSONObject(i);
                String date = transaction.getString("Date");
                String amount = transaction.getString("Amount");
                String dateAndAmount = date + " " + amount;
                listData.add(dateAndAmount);
            }
            return listData;

        }
        /*System.out.println(listData);*/

    }

