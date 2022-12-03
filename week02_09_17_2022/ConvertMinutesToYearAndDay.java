package week02_09_17_2022;

import java.io.PrintStream;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
        /*
        8. Create class named ConvertMinutesToYearAndDay, write a Java program to convert minutes
         into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
         */
    int givenMinutes= 3456789;
    int howManyMinutesInYear= (24*365*60);
    int year=givenMinutes/howManyMinutesInYear;

        System.out.println("year=" + year);
int remainderMinutes=givenMinutes%howManyMinutesInYear;
        System.out.println("remainderMinutes="+ remainderMinutes);
        int days= remainderMinutes /(24*60);
        System.out.println("days+" + days);
        System.out.println(givenMinutes+ " minutes is approximately "+ year );
        /*
        120 seconds how many minutes?
        seconds/60 we can find the minutes

        24*60 minutes
        1 day= 24 hour (24*60*60 seconds)
         */





    }
}
