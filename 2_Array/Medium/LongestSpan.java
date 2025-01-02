import java.util.HashMap;

public class LongestSpan {
    public static int findLongestSpan(int[] a, int[] b) {
        int n = a.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = a[i] - b[i];
        }

        // HashMap to store the first occurrence of each cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += diff[i];

            // If the cumulative sum is 0, the span is from 0 to i
            if (sum == 0) {
                maxLen = i + 1;
            }

            // If the sum has been seen before
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                // Store the first occurrence of the sum
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 1, 1, 1};
        int[] b = {1, 1, 1, 0, 0, 1, 0};

        int result = findLongestSpan(a, b);
        System.out.println("Length of the longest span with the same sum: " + result);
    }
}
