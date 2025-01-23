import java.util.*;

public class MinAdjacentSwaps {

    public static int minSwaps(String s) {
        int n = s.length();
        int leftCount = 0;
        int rightCount = 0;
        int swaps = 0;

        // Count the number of left and right brackets
        for (char c : s.toCharArray()) {
            if (c == '[') {
                leftCount++;
            } else {
                rightCount++;
            }
        }

        // If the number of left and right brackets is not equal, the string cannot be balanced
        if (leftCount != rightCount) {
            return -1; // Impossible to balance
        }

        // Calculate the number of swaps required
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '[') {
                leftCount--;
            } else {
                rightCount--;
            }

            // If there are more right brackets encountered than left brackets, 
            // swaps are needed to move them to the right
            if (rightCount > leftCount) {
                swaps += rightCount - leftCount;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        String s1 = "[][]][";
        String s2 = "[[][]]";

        System.out.println("Minimum swaps for " + s1 + ": " + minSwaps(s1));
        System.out.println("Minimum swaps for " + s2 + ": " + minSwaps(s2));
    }
}