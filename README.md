# RestTest-Pryata
 This is the Rest Test in Java, this code grabs data from an endpoint and returns the running balance of the transactions per day 
 
**Required**

Java 11 or above I used open JDK 17.0.2

 add a Maven JSON dependency (https://mvnrepository.com/artifact/org.json/json/20211205)
 
to test the unit tests you will need the dependency for JUnit 5.8.1

**Installation instructions**

Download the code from github, make sure you have the dependency and Java 11 or above and then go to main.java run it 

**Expected Output**

2013-12-12 -227.35 

2013-12-13 -1456.93

2013-12-15 -1462.32

2013-12-16 -6037.85

2013-12-17 4648.43

2013-12-18 2807.14

2013-12-19 22560.45

2013-12-20 18505.85

2013-12-21 18487.87

2013-12-22 18377.16

**Scalability**

You will notice I used array lists to store the strings almost all through my program because they can dynamically increase and decrease in size. However it cannot hold more than Integer.MAX_VALUE elements which in 32 bits is  2147483647 so if we have more data than that then we would need to look for another solution. 

**Assumptions**

In addition to the assumption that data will not exceed 2147483647, I also assumed that the format of the date will always be yyyy-mm-dd and that each value is calculated to up to 2 decimal places without rounding 

**Shortcuts**

 I utilized the https://resttest.bench.co/transactions/all.json instead of looping through the pages as all the transactions were already displayed on this page 

**Trade-offs**

Due to the assumption of using the endpoint with all the pages it is required we utilize that page only because then the running balance will calculate it with the values per page without considering all the other page values 
stretch goals for this application
instead of being a console application I can move it to a platform that can post 

**what would I do different**

I would loop through every page get the values store them then start the program in this case if the RESTAPI cannot put all its data in one page like they currently have it can still run through the program going page to page 
