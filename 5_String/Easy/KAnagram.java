import java.util.Arrays;
import java.util.Scanner;

public class KAnagram {
    public static void Ana(String s1, String s2, int k){
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        for (int i = 0; i < a2.length; i++) {
            if(a1[i] != a2[i]){
                count++;
            }
        }
        if(count <= k){
            System.out.println("K-Anagram");
        }
        else{
            System.out.println("No K-Anagram");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int k = sc.nextInt();
        Ana(s1,s2,k);
        sc.close();
    }
}
