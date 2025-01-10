import java.util.Arrays;
import java.util.Scanner;

public class TwoTypeSort{
    public static void Bin(int [] a){
        int count = 0;
        int [] res = new int[a.length];
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                count++;
            }
        }
        for (int i = 0; i < res.length-count; i++) {
            res[i] = a[i+count];
        }
        for (int i = res.length-count; i < res.length; i++) {
            res[i] = 0;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Bin(arr);
        sc.close();
    }
}