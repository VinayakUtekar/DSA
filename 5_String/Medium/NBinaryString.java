import java.util.Scanner;

public class NBinaryString {
    public static String Bin(String s1, String s2){
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
        return res;
    }
    public static void Cal(String [] in){
        String res = Bin(in[0], in[1]);
        for (int i = 2; i < in.length; i++) {
            String g = Bin(res, in[i]);
            res = g;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String []  in = new String[n];
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextLine();
        }
        Cal(in);
        sc.close();
    }
}