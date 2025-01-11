import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigIntegerSort {
    public static void Sort(BigInteger [] a){
        Arrays.sort(a);
        for (BigInteger b : a) {
            System.out.print(b + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger [] arr = new BigInteger[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextBigInteger();
        }
        Sort(arr);
        sc.close();
    }
}
