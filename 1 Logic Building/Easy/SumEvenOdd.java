import java.util.Scanner;

public class SumEvenOdd {
    public static void EveOdd(int [] arr){
        int even =0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                even = even + arr[i];
            }
            else{
                odd = odd + arr[i];
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }
        EveOdd(arr);
        sc.close();
    }
}
