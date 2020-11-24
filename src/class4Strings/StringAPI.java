package class4Strings;

import java.util.Scanner;

public class StringAPI {
    //GET ANY STRING VALUE
    static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String inputString = scanner.next();
        System.out.println("String : " + inputString);
        return inputString;
    }

    //GET ANY INT VALUE
    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any integer value");
        while (!scanner.hasNextInt()) {
            //Error message when entering non integer value
            System.out.println("Please enter only integer value");
            scanner.next();
        }
        int inputInt = scanner.nextInt();
        //Error message when entering negative numeric value or zero
        while (inputInt <= 0) {
            System.out.println("Please enter only positive integer value");
            //Error message when entering non integer value
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter only integer value");
                scanner.next();
            }
            inputInt = scanner.nextInt();
        }
        System.out.println("Int : " + inputInt);
        return inputInt;
    }

    //FIND THE LETTER OF STRING WITH INPUT INDEX
    static void findIndexLetter(String getString, int getInt) {
        //Create array of char type
        char[] ch = new char[getString.length()];
        //Fill-in String elements in char array
        for (int i = 0; i < getString.length(); ++i) {
            ch[i] = getString.charAt(i);
            if (i == getInt) {
                System.out.println("The character at index " + i + " of your String is letter " + ch[i - 1]);
                return;
            }
        }
        System.out.println("Out of bounds");
    }

    //FIND NUMBER OF WORDS IN A TEXT
    static void findNumberOfWords(String getString) {
        int count = 0;
        String[] startWord = getString.split(" ");
        for (int i = 0; i < startWord.length; ++i) {
            if (!startWord[i].isEmpty()) {
                count++;
            }
        }
        System.out.println("Number of words : " + (count));
    }

    //CHECK IF STRING IS PALINDROME
    static void checkIfPalindrome(String getString) {
        for (int i = 0, j = getString.length() - 1; i < getString.length(); ++i, --j) {
            if (getString.charAt(i) != getString.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    //CHECK IF OPENING AND CLOSING PARANTHESIS ARE EQUAL
    static void getParenthesis(String getString) {
        for (int i = 0; i < getString.length(); ++i) {
            //Error message when entering non parenthesis
            if (getString.charAt(i) != '(' && getString.charAt(i) != ')') {
                System.out.println("You are allowed to enter only parenthesis");
                return;
            }
        }
        int open = 0;
        int close = 0;
        //Count opening and closing parenthesis
        for (int i = 0; i < getString.length(); ++i) {
            if (getString.charAt(i) == '(') {
                open++;
            } else {
                close++;
            }
        }
        //Message when opening and closing parenthesis are equal
        if (open == close) {
            System.out.println("valid");
            //Message when opening and closing parenthesis are not equal
        } else System.out.println("invalid");
    }

    //CHECK SEQUENCE OF VALUE IN A TEXT
    static void checkCharSequence(String text, String sequence) {
        if (text.contains(sequence)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //CHECK IF TEXT STARTS WITH GIVEN CONTENT
    static void startContent(String text, String content) {
        if (text.startsWith(content)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //CHECK IF TEXT ENDS WITH GIVEN CONTENT
    static void endContent(String getText, String getContent) {
        if (getText.endsWith(getContent)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //REMOVE DUPLICATE CHARACTERS
    static void removeDuplicates(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (i + 1 < word.length() && word.charAt(i) != word.charAt(i + 1)) {
                result = result + word.charAt(i);
            }
            if (i + 1 == word.length()) {
                result = result + word.charAt(i);
            }
        }
        System.out.println("Without duplicates : " + result);
    }

    // DIVIDE STRING TO EQUAL PARTS
    static void divideStringToEqalParts(String word, int number) {
        int part_size = word.length() / number;
        if (word.length() % number == 0) {
            for (int i = 0; i < word.length(); i++) {
                if (i % part_size == 0)
                    System.out.println();
                System.out.print(word.charAt(i));
            }
            //Error message when impossible to divide word to equal parts
        } else
            System.out.println("invalid");
        System.out.println();
    }

    //REVERSE STRING
    public static String reverseString(String myStr) {
        if (myStr.isEmpty()) {
            return myStr;
        }
        //Calling Function Recursively
        return reverseString(myStr.substring(1)) + myStr.charAt(0);
    }
}