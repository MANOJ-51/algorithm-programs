package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    //anagram detection method
    public static void anagramDetection(String string1, String string2) {
        String removeSpacesString1 = string1.replaceAll("//s", "");
        String removeSpacesString2 = string2.replaceAll("//S", "");       //REMOVING SPACES

        if (removeSpacesString1.length() == removeSpacesString2.length()) {             //checking two strings are equal or not
            char[] string1ToChar1 = removeSpacesString1.toLowerCase().toCharArray();   //strings to lower case and char array
            char[] string2ToChar2 = removeSpacesString2.toLowerCase().toCharArray();

            Arrays.sort(string1ToChar1);
            Arrays.sort(string2ToChar2);        //sorting strings

            if (Arrays.equals(string1ToChar1, string2ToChar2)) {            //checking two char arrays are equal or not
                System.out.println("The Two  Strings Are Anagrams");
            } else {
                System.out.println("The Two Strings are not Anagrams ");
            }
        }
    }

    //taking two strings from user input
    public static void takingUserInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String:");
        String userString1 = scanner.nextLine();
        System.out.println("Enter the Second String:");
        String userString2 = scanner.nextLine();

        anagramDetection(userString1, userString2);        //calling detection method
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Welcome to Anagram Detection ");

        AnagramDetection.takingUserInputs();   //calling input method
    }
}
