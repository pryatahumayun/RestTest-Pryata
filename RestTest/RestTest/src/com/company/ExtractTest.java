package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ExtractTest {
    ArrayList<String> data =
            new ArrayList<String>(Arrays.asList("2013-12-12 -91.12",
                    "2013-12-12 -63.01", "2013-12-12 -42.53", "2013-12-12 -30.69",
                    "2013-12-13 -5518.17", "2013-12-13 -520.85"));
    @Test
    void ExtractValueFromList() {
        Extract extractData = new Extract();
        assertEquals("[-91.12, -63.01, -42.53, -30.69, -5518.17, -520.85]", extractData.extract(data));


    }
    }