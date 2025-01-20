import java.util.Scanner;

public class CountEqualPair {
    public static void Count(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Count(s);
        sc.close();
    }
}
