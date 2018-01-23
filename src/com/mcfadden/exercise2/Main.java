package com.mcfadden.exercise2;
//Ean McFadden
//January 23, 2018
//Exercise 2
public class Main {

    public static void main(String[] args) {
        int [] dayTemperature = {45, 29, 10, 22, 41, 28, 33};
        int [] dayPrecipitation = { 95, 60, 25, 5, 0, 75, 90};
        for (int i = 0; i < dayTemperature.length; i++) {
            if ((dayTemperature[i] <= 32) && (dayPrecipitation[i] > 50))
                System.out.println("That day's temperature is: " + dayTemperature[i] + "\n That day's chance of precipitation is: " + dayPrecipitation[i] + "\n");

        }


    }
}
