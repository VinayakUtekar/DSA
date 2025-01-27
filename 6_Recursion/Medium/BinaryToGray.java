import java.lang.StrictMath.pow;
import java.util.Scanner;

public class BinaryToGray {
    public static int Find(int n, int i){
        int a,b;
        int res = 0;
        if(n!=0){
            a=n%10;
            n=n/10;
            b=n%10;
            if((a&~b)==1 | (~a&b)==1){
                res = (int)(res+ pow(10,i));
            }
            return Find(n, ++i) + res;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = Find(n,0);
        System.out.println(res);
    }
}
