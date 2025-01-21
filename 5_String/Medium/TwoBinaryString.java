import java.util.Scanner;

public class TwoBinaryString {
    public static void Bin(String s1, String s2){
        String res = "";
        int i = s1.length()-1;
        int j = s2.length()-1;
        int car = 0;
        while(i>=0 || j>=0 || car>0){
            int k = i>=0 ? (int)s1.charAt(i)-'0' : 0;
            int l = j>=0 ? (int)s2.charAt(j)-'0' : 0;
            int s = k+l+car;
            String g = res;
            res = s%2 + g;
            car = s/2;
            i--;j--;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Bin(s1, s2);
        sc.close();
    }
}