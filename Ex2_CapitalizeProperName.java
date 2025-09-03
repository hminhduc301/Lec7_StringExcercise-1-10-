package Lec7_string;

import java.util.Scanner;

public class Ex2_CapitalizeProperName {

    public static String ChuanHoaTen(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder normalizedName = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (!word.isEmpty()) {
                
                String firstLetter = word.substring(0, 1).toUpperCase();
                
                String restOfWord = word.substring(1).toLowerCase();
                
                normalizedName.append(firstLetter).append(restOfWord);
            }
            
            if (i < words.length - 1) {
                normalizedName.append(" ");
            }
        }
        
        return normalizedName.toString();
        
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sen = scanner.nextLine();
        String normalizedName = ChuanHoaTen(sen);
        System.out.print(normalizedName);
    }
}
