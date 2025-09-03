
package Lec7_string;
import java.util.Scanner;
public class Ex1_ReverseTheWords {
    public static String Reverseword(String s) {
        if(s == null || s.isEmpty()){
               return s;  
        }
        String[] words = s.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
         return reversedSentence.toString();   
    }
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an sentence: ");
        String sen = scanner.nextLine();
         String outputSentence = Reverseword(sen);
         System.out.println(outputSentence);
        
    }
}
