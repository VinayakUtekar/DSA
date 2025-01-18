import java.util.Scanner;

public class SubStringCount {
    public static void Sub(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1'){
                System.out.println(s.substring(i));
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Sub(s);
        sc.close();
    }
}
