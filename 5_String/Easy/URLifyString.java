import java.util.Scanner;

public class URLifyString {
    public static void URL(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                ans = ans + "%20";
            }
            else{
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        URL(s1);
        sc.close();
    }
}
