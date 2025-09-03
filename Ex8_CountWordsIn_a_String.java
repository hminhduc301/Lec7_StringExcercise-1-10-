package Lec7_string;

import java.util.*;

public class Ex8_CountWordsIn_a_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
        s = s.trim();
        String[] a = s.split("\\s+");
        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != "") {
                count++;
            }
        }
        System.out.println("The number of words in the string is: " + count);
    }
}
