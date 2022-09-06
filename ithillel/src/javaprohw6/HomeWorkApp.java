package javaprohw6;

import java.time.LocalDate;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("printThreeWords()");
        printThreeWords();
        printThreeWordsVarArgs("Orange", "Banana", "Apple");
        printThreeWords(new String[]{"Orange", "Banana", "Apple"});
        System.out.println("");

        System.out.println("checkSumSign()");
        checkSumSign();
        checkSumSign(10, 20);
        System.out.println("");

        System.out.println("printColor()");
        printColor();
        printColor(101);
        System.out.println("");

        System.out.println("compareNumbers()");
        compareNumbers();
        compareNumbers(36, 14);
        System.out.println("");

        System.out.println("isNumbersInRange(int a, int b)");
        System.out.println(isNumbersInRange(5, 7));
        System.out.println("");

        System.out.println("printSignNumber()");
        printSignNumber(-50);
        System.out.println("");

        System.out.println("isNegativeNumber");
        System.out.println(isNegativeNumber(-50));
        System.out.println("");

        System.out.println("printNumberOfStrings()");
        printNumberOfStrings("Print", 5);
        System.out.println("");

        System.out.println("isLeapYear()");
        System.out.println(isLeapYear());
        System.out.println(isLeapYear(1456));
        System.out.println("");
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void printThreeWordsVarArgs(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
    static void printThreeWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
    static void checkSumSign() {
        int a = 10;
        int b = 20;
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }
    static void checkSumSign(int a, int b) {
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }
    static void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        }
        System.out.println("Yellow");
    }
    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("Yellow");
        }
    }
    static void compareNumbers() {
        int a = 10;
        int b = 20;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
    static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
    static boolean isNumbersInRange(int a, int b) {
        return a + b <= 20 && a + b > 10;
    }
    static void printSignNumber(int a) {
        System.out.println(a >= 0 ? "Positive number" : "Negative Number");
    }
    static boolean isNegativeNumber(int a) {
        return a < 0;
    }
    static void printNumberOfStrings(String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }
    static boolean isLeapYear() {
        return LocalDate.now().isLeapYear();
    }
    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}