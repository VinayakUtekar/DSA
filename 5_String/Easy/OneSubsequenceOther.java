import java.util.Scanner;

public class OneSubsequenceOther {
    public static void isSubsequence(String s1, String s2) {
        int i = 0, j = 0;
        
        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        if (i == s1.length()) {
            System.out.println("True: \"" + s1 + "\" is a subsequence of \"" + s2 + "\".");
        } else {
            System.out.println("False: \"" + s1 + "\" is not a subsequence of \"" + s2 + "\".");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        isSubsequence(s1, s2);
        sc.close();
    }
}
