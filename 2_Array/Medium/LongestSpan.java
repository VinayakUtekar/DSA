import java.util.HashMap;

public class LongestSpan {
    public static int findLongestSpan(int[] a, int[] b) {
        int n = a.length;
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = a[i] - b[i];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (sum == 0) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
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
