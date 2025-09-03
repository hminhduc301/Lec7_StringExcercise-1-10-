package Lec7_string;

import java.util.*;

public class Ex6_FindTheLongestWordSentence {

    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.next();
        String longest = longestWord(inputSentence);

        System.out.println(" \"" + longest + "\"");

    }
}
