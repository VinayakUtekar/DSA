import java.util.*;

public class MinNumberFromSequence {

    public static String printMinNumberForPattern(String str) {
        int n = str.length();
        int[] res = new int[n + 1];
        int num = 1;

        // Initialize result array with -1
        Arrays.fill(res, -1);

        // Find the positions of 'I' in the pattern
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    res[stack.peek()] = num++;
                    stack.pop();
                }
                stack.push(i + 1);
            } else {
                stack.push(i + 1);
            }
        }

        // Fill the remaining positions with the remaining numbers
        while (!stack.isEmpty()) {
            res[stack.peek()] = num++;
            stack.pop();
        }

        // Construct the final string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "D";
        String str2 = "I";
        String str3 = "DD";
        String str4 = "II";
        String str5 = "DIDI";
        String str6 = "IIDDD";
        String str7 = "DDIDDIID";

        System.out.println("Min number for " + str1 + ": " + printMinNumberForPattern(str1));
        System.out.println("Min number for " + str2 + ": " + printMinNumberForPattern(str2));
        System.out.println("Min number for " + str3 + ": " + printMinNumberForPattern(str3));
        System.out.println("Min number for " + str4 + ": " + printMinNumberForPattern(str4));
        System.out.println("Min number for " + str5 + ": " + printMinNumberForPattern(str5));
        System.out.println("Min number for " + str6 + ": " + printMinNumberForPattern(str6));
        System.out.println("Min number for " + str7 + ": " + printMinNumberForPattern(str7));
    }
}