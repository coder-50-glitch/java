import java.util.*;

public class ReverseString {

    
    static String reverseString(String str) {
        
        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        
        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch); 
    }

    
    static String reverseWordsAndSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(reverseString(words[i])).append(" ");
        }

        return reversedSentence.toString().trim(); 
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string to reverse its words and sentence: ");
        String input = scn.nextLine();
       
        if (input.split(" ").length == 1) {    
            String reversedString = reverseString(input);
            System.out.println("Reversed string: " + reversedString);
        } else {
            String reversedWordsAndSentence = reverseWordsAndSentence(input);
            System.out.println("Reversed string: " + reversedWordsAndSentence);
        }
    }
}