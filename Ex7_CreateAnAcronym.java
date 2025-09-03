package Lec7_string;

import java.util.*;

public class Ex7_CreateAnAcronym {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String s = scanner.nextLine();
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
        }
        System.out.println("Acronym: " + sb.toString());
    }
}
