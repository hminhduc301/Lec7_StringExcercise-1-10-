
package Lec7_string;

import java.util.Scanner;
public class Ex3_StringCompression {
    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sen = scanner.nextLine();
        String normalizedName = compressString(sen);
        System.out.print(normalizedName);
    }
}
