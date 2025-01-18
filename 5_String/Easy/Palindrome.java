import java.util.Scanner;

public class Palindrome {
    public static void Pal(String s){
        boolean b = true;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) != s.charAt(n-1-i)){
                b = false;
                break;
            }
        }
        if(b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pal(s);
        sc.close();
    }
}
