import java.util.Scanner;

public class ReverseString {
    public static void Rev(String s){
        System.out.print(s.charAt(s.length()-1));
        if(s.length()!=1){
            Rev(s.substring(0,s.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Rev(s);
        sc.close();
    }
}
