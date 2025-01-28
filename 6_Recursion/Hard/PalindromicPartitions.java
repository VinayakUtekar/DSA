import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromicPartitions {

    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static void findPartitions(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                current.add(s.substring(start, i + 1));
                findPartitions(s, i + 1, current, result);
                current.remove(current.size() - 1); 
            }
        }
    }

    public static void printPalindromicPartitions(String s) {
        List<List<String>> result = new ArrayList<>();
        findPartitions(s, 0, new ArrayList<>(), result);

        for (List<String> partition : result) {
            for (String part : partition) {
                System.out.print(part + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Palindromic partitions are:");
        printPalindromicPartitions(s);

        sc.close();
    }
}
