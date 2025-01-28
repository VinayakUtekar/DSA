import java.util.Scanner;

public class LengthLongestPalindrome {
    public static int Find(String str, int i, int j, int count){
        if (i > j)
            return count;
        if (i == j)
            return (count + 1);
        if (str.charAt(i) == str.charAt(j)) {
            count = Find(str, i + 1, 
                      j - 1, count + 2);
            return Math.max(count, 
            Math.max(Find(str, i + 1, j, 0), 
             Find(str, i, j - 1, 0)));
        }
        return Math.max(
           Find(str, i + 1, j, 0), 
           Find(str, i, j - 1, 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = Find(s,0,s.length(),0);
        System.out.println(count);
        sc.close();
    }
}
