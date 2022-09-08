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

    //TASK #2: This group of methods brings in console just three words one under another: "Orange", "Banana", "Apple"
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //This method use Varargs
    static void printThreeWordsVarArgs(String... words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    //This method use array of Strings
    static void printThreeWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    //TASK #3: This group of methods check sum of two integers.
    //This one uses integers in body of method
    static void checkSumSign() {
        int a = 10;
        int b = 20;
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }

    //This method gets entering integers
    static void checkSumSign(int a, int b) {
        System.out.println(a + b >= 0 ? "The sum is positive" : "The sum is negative");
    }

    //TASK #4: These methods drop into console colour, depends on integer
    //First variant gets integer from body of the method
    static void printColor() {
        int value = 23;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        }
        System.out.println("Yellow");
    }

    //Second variant gets integer from outside
    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Green");
        } else {
            System.out.println("Yellow");
        }
    }

    //TASK #5: These methods compares two integers and drop into console result of comparing
    //Integers in body of method
    static void compareNumbers() {
        int a = 10;
        int b = 20;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    //Integers come from outside
    static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    //TASK #6: This method compares two integers and gives in result boolean
    static boolean isNumbersInRange(int a, int b) {
        return a + b <= 20 && a + b > 10;
    }

    //TASK #7: Method prints is integer Positive or Negative number
    static void printSignNumber(int a) {
        System.out.println(a >= 0 ? "Positive number" : "Negative Number");
    }

    //TASK #8: Method gives boolean (is integer negative)
    static boolean isNegativeNumber(int a) {
        return a < 0;
    }

    //TASK #9: This method prints some string for number times
    static void printNumberOfStrings(String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }

    //TASK #10: These methods help to find out is this Year or any other year Leap Year
    //This variant for actual year
    static boolean isLeapYear() {
        return LocalDate.now().isLeapYear();
    }

    //This method for any year
    static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}