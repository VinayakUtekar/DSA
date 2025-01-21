import java.util.Scanner;

public class AtoiString {
    public  static void Numb(String s){
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ' && s.charAt(i)>='0' && s.charAt(i)<='9'){
                if(n>=Integer.MAX_VALUE){
                    System.out.println("0");
                    break;
                }
                else{
                    n = n*10 + (int)(s.charAt(i) -'0');
                }
            }
        }
        if(s.charAt(0) == '-'){
            System.out.println(n*-1);
        }
        else{
            System.out.println(n);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Numb(s1);
        sc.close();
    }
}