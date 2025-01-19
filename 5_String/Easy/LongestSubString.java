import java.util.HashMap;
import java.util.Scanner;

public class LongestSubString {
    public static void SubStr(String s) {
        HashMap<Character, Integer> firstOccurrence = new HashMap<>();
        int maxLen = -1;
        String longestSubstr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!firstOccurrence.containsKey(c)) {
                firstOccurrence.put(c, i);
            } else {
                int start = firstOccurrence.get(c);
                int len = i - start - 1; 
                if (len > maxLen) {
                    maxLen = len;
                    longestSubstr = s.substring(start + 1, i); 
                }
            }
        }

        if (maxLen > 0) {
            System.out.println("Longest substring: \"" + longestSubstr + "\" with length: " + maxLen);
        } else {
            System.out.println("No substring found between repeated characters.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        SubStr(s);
        sc.close();
    }
}