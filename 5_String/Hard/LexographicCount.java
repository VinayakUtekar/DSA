import java.util.Arrays;

public class LexicographicCount {
    // Function to calculate factorial
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to find lexicographic rank of a string
    public static int findRank(String str) {
        int n = str.length();
        int rank = 1; // Rank is 1-based
        int fact = factorial(n);
        
        // Count frequency of each character
        int[] charCount = new int[256];
        for (int i = 0; i < n; i++) {
            charCount[str.charAt(i)]++;
        }
        
        // Ensure all characters are unique
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println("Duplicate characters are not allowed.");
                return -1;
            }
        }
        
        // Calculate rank
        for (int i = 0; i < n; i++) {
            fact /= (n - i);
            int countSmaller = 0;

            // Count characters smaller than str[i] to the right
            for (int j = 0; j < str.charAt(i); j++) {
                countSmaller += charCount[j];
            }

            rank += countSmaller * fact;

            // Decrease the count of current character
            charCount[str.charAt(i)]--;
        }
        
        return rank;
    }

    public static void main(String[] args) {
        String str = "string";
        int rank = findRank(str);
        System.out.println("The lexicographic rank of the string \"" + str + "\" is: " + rank);
    }
}
