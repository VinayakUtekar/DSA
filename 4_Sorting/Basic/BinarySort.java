import java.util.Scanner;

public class BinarySort{
    public static void Bin(int [] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0){
                count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i<=count){
                a[i]=0;
            }
            else{
                a[i]=1;
            }
        }
        for (int i : a) {
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