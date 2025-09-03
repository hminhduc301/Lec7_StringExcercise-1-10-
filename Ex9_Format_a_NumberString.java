package Lec7_string;

import java.util.*;

public class Ex9_Format_a_NumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        for (int i = s.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println("fix: " + sb.toString());
    }
}
