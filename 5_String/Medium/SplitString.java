import java.util.HashSet;
import java.util.Scanner;

public class SplitString {
    
    public static boolean canSplitIntoFourDistinctStrings(String str) {
        int n = str.length();
        
        // If the string length is less than 4, it is impossible to split into 4 non-empty substrings.
        if (n < 4) {
            return false;
        }
        
        // Try splitting the string into four non-empty substrings
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Split string into four parts
                    String part1 = str.substring(0, i);
                    String part2 = str.substring(i, j);
                    String part3 = str.substring(j, k);
                    String part4 = str.substring(k);
                    
                    // Add substrings to a HashSet to ensure uniqueness
                    HashSet<String> set = new HashSet<>();
                    set.add(part1);
                    set.add(part2);
                    set.add(part3);
                    set.add(part4);
                    
                    // If the set size is 4, it means all substrings are distinct
                    if (set.size() == 4) {
                        return true; // Found four distinct non-empty substrings
                    }
                }
            }
        }
        
        // If no valid split found
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        if (canSplitIntoFourDistinctStrings(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
