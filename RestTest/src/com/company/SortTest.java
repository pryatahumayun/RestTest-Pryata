package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    ArrayList<String> data =
            new ArrayList<String>(Arrays.asList("2013-12-12 -91.12", "2013-12-13 -520.85",
                    "2013-12-12 -63.01", "2013-12-12 -42.53", "2013-12-12 -30.69",
                    "2013-12-13 -5518.17"));

    @Test
    void sortList() {
        Sort sortData = new Sort();
        assertEquals("[2013-12-12 -91.12, 2013-12-12 -63.01, 2013-12-12 -42.53, 2013-12-12 -30.69, 2013-12-13 -520.85, 2013-12-13 -5518.17]", sortData.sort(data));

    }
}