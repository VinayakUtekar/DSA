import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void Ana(String s1, String s2){
        char [] a1 = s1.toCharArray();
        char [] a2 = s2.toCharArray();
        boolean g = true;
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(a1.length == a2.length){
            for (int i = 0; i < a2.length; i++) {
                if(a1[i] != a2[i]){
                    g = false;
                }
            }
        }
        else{
            g = false;
        }
        if(g){
            System.out.println("Anagram");
        }
        else{
            System.out.println("No Anagram");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Ana(s1,s2);
        sc.close();
    }
}
