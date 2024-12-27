import java.util.Scanner;

public class DeciToBina {
    public static void bin(int n){
        String res = "";
        while(n>0){
            int d = n % 2;
            res = res + d;
            n = n / 2;
        }
        char[] r = res.toCharArray();
        for(int i=r.length-1; i>=0; i--){
            System.out.print(r[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bin(n);
        sc.close();
    }
}
