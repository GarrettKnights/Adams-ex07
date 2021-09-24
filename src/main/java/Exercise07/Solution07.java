/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise07;

import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanWord = new Scanner(System.in);
        //Declares Ints we will be using
        int length;
        int width;
        int area;
        double meters;
        double metersconversion = 0.09290304;

        //Asks user for input
        System.out.println("What is the length of the room in feet?");
        //Scans users length
        length = ScanWord.nextInt();
        //Asks user for input
        System.out.println("What is the width of the room in feet?");
        //Scans Users width
        width = ScanWord.nextInt();
        System.out.print("You entered dimensions of " + length + " feet by " + width + " feet.\n");

        //Calculates area
        area = length * width;
        //Calculates meters
        meters = area * metersconversion;

        //Final print
        System.out.print("The area is \n" + area +  " square feet\n" + meters + " square meters");

    }
}

