import java.util.Scanner;

public class StringToNumber {
    public static int Conv(String s){
        if (s.length() == 1) {
            return s.charAt(0) - '0';
        }
        int firstDigit = s.charAt(0) - '0'; 
        return firstDigit * (int)Math.pow(10, s.length() - 1) + Conv(s.substring(1));

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = Conv(s);
        System.out.println(res);
        sc.close();
    }
}
