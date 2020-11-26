package class4Strings;

public class Solutions {
    public static void main(String[] args) {
        /*
        1. Input a string and an integer k.
        Find the character at index k or print “out of bounds” if k is out of stings length.
         */
        System.out.println("Homework 1");
        String stringToFindIndex = StringAPI.getString();
        int inputInt = StringAPI.getInt();
        StringAPI.findIndexLetter(stringToFindIndex, inputInt);

        /*
        2. Input a string.
        Count number of words in that string.
        Word is any sequence of characters that doesn’t contain space.
         */
        System.out.println("Homework 2");
        StringAPI.findNumberOfWords("Hello  from the  other  side");

        /*
        3. Input a string. Check if string is a palindrome.
        (A palindrome is a sequence of characters which reads the same backward as forward,
        such as madam, racecar).
         */
        System.out.println("Homework 3");
        StringAPI.checkIfPalindrome("madam");

        /*
        4. Input a string that consists of parenthesis( ‘(‘ and ‘)’ ) symbols only.
        Print valid if the parenthesis are balanced, and print invalid otherwise.
         */
        System.out.println("Homework 4");
        StringAPI.getParenthesis(")))(((");

        /*
        5. Write a program to test if a given string contains the specified sequence of char values.
         */
        System.out.println("Homework 5");
        StringAPI.checkCharSequence("Hi there", "there");

        /*
        6. Write a program to check whether a given string starts with the contents of another string.
        (scanner input both: original string and given string).
         */
        System.out.println("Homework 6");
        String startString = StringAPI.getString();
        String startContent = StringAPI.getString();
        StringAPI.startContent(startString, startContent);

         /*
        7. Write a program to check whether a given string ends with the contents of another string.
        (scanner input both: original string and given string).
         */
        System.out.println("Homework 7");
        StringAPI.endContent("Hello world", "world");

        /*
        8. Write a program to print after removing duplicates from a given string.
         */
        System.out.println("Homework 8");
        StringAPI.removeDuplicates("aabbcc");

        /*
        9. Write a program to divide a string in n equal parts and print invalid when can’t divide.
         */
        System.out.println("Homework 9");
        StringAPI.divideStringToEqalParts("abcdefghijklmnopqrstuvwxy", 5);

        /*
        10. Write a program to reverse a string using recursion.
         */
        System.out.println("Homework 10");
        String reverseString = StringAPI.reverseString("Good luck");
        System.out.println("Reversed String : " + reverseString);
    }
}
