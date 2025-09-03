
package Lec7_string;

import java.util.Scanner;
import java.util.Arrays;
public class Ex4_CheckForAnagrams {
        public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
        public static void main(String[] args) {

        String testStr1_1 = "listen";
        String testStr1_2 = "silent";
        if (areAnagrams(testStr1_1, testStr1_2)) {
            System.out.println("Input: \"" + testStr1_1 + "\" and \"" + testStr1_2 + "\"");
            System.out.println("Output: The two strings are Anagrams.");
        } else {
            System.out.println("Input: \"" + testStr1_1 + "\" and \"" + testStr1_2 + "\"");
            System.out.println("Output: The two strings are not Anagrams.");
        }
        System.out.println(); 
        String testStr2_1 = "hello";
        String testStr2_2 = "world";
        if (areAnagrams(testStr2_1, testStr2_2)) {
            System.out.println("Input: \"" + testStr2_1 + "\" and \"" + testStr2_2 + "\"");
            System.out.println("Output: The two strings are Anagrams.");
        } else {
            System.out.println("Input: \"" + testStr2_1 + "\" and \"" + testStr2_2 + "\"");
            System.out.println("Output: The two strings are not Anagrams.");
        }
    }

}
