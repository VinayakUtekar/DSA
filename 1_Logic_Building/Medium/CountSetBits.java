import java.util.Scanner;

public class CountSetBits {
    public static String Bin(int n){
        String se = "";
        if(n==0){
            se = se + '0';
        }
        while(n>0){
            int d = n%2;
            se = d + se;
            n = n/2;
        }
        return se;
    }
    public static void Set(int n){
        String ans = Bin(n);
        int count = 0;
        for (int i = 0; i < ans.length(); i++) {
            if(ans.charAt(i)=='1'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set(n);
        sc.close();
    }
}
