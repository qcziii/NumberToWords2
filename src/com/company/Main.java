package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(557480);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");

        while (number >= 0) {

            int remainder = number % 10;

            if (remainder == 0) System.out.println("Zero");
            if (remainder == 1) System.out.println("One");
            if (remainder == 2) System.out.println("Two");
            if (remainder == 3) System.out.println("Three");
            if (remainder == 4) System.out.println("Four");
            if (remainder == 5) System.out.println("Five");
            if (remainder == 6) System.out.println("Six");
            if (remainder == 7) System.out.println("Seven");
            if (remainder == 8) System.out.println("Eight");
            if (remainder == 9) System.out.println("Nine");

            number = number/10;
            if (number < 1) break;
        }

        }

        public static int reverse (int number) {

        

        }
    }
