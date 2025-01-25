import java.util.Scanner;

public class CountSetBit {
    public static int Count(int n){
        if(n==0){
            return 0;
        }
        if((n&1) == 1){
            return 1+Count(n >> 1);
        }
        else{
            return Count(n >> 1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int su = Count(n);
        System.out.println(su);
        sc.close();
    }
}
