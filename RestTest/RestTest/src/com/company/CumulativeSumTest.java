package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CumulativeSumTest {
    ArrayList<Double> data =
            new ArrayList<Double>(Arrays.asList(-91.12, -63.01, -42.53, -30.69, -5518.17, -520.85));
    @Test
    void CumulativeSumList() {
        CumulativeSum cumulativeSumData = new CumulativeSum();
        assertEquals("[-91.12, -154.13, -196.66, -227.35, -5745.52, -6266.370000000001]", cumulativeSumData.cumulativeSum(data));


    }
}