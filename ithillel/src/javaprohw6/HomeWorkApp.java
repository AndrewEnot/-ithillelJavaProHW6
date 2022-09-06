package javaprohw6;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("printThreeWords()");
        printThreeWords();
        System.out.println("");
        printThreeWordsVarArgs("Orange", "Banana", "Apple");
        System.out.println("");
        printThreeWords(new String[]{"Orange", "Banana", "Apple"});
        System.out.println("");

        System.out.println("checkSumSign()");
        checkSumSign();
        System.out.println("");
        checkSumSign(10, 20);

        System.out.println("printColor()");
        printColor();
        System.out.println("");
        printColor(101);

        System.out.println("compareNumbers()");
        compareNumbers();
        System.out.println("");
        compareNumbers(36,14);
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
    static void compareNumbers(int a, int b ) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }
}