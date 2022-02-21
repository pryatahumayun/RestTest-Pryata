package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParseTest {
    @Test
    void ParseJsonData(){
        Parse parseData = new Parse();
      assertEquals("[2013-12-21 -8.1, 2013-12-22 -110.71]",parseData.parse("{\n" +
                "    \"totalCount\": 38,\n" +
                "    \"page\": 1,\n" +
                "    \"transactions\": [{\n" +
                "        \"Date\": \"2013-12-22\",\n" +
                "        \"Ledger\": \"Phone & Internet Expense\",\n" +
                "        \"Amount\": \"-110.71\",\n" +
                "        \"Company\": \"SHAW CABLESYSTEMS CALGARY AB\"\n" +
                "    }, {\n" +
                "        \"Date\": \"2013-12-21\",\n" +
                "        \"Ledger\": \"Travel Expense, Nonlocal\",\n" +
                "        \"Amount\": \"-8.1\",\n" +
                "        \"Company\": \"BLACK TOP CABS VANCOUVER BC\"\n" +
                "    }]\n" +
                "}") );
    }

}