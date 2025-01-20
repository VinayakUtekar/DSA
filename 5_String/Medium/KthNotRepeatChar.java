import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class KthNotRepeatChar {
    public static void Repeat(String s, int k) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) { 
                count++;
                if (count == k) {
                    System.out.println(entry.getKey());
                    return;
                }
            }
        }
        System.out.println("No k-th non-repeating character found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        Repeat(s, k);
        sc.close();
    }
}
