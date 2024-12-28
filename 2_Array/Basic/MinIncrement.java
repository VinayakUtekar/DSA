import java.util.Scanner;

public class MinIncrement {
    public static void Incr(int [] arr, int k){
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if((max - arr[i]) % k != 0){
                System.out.println("Invalid");
            }
            else{
                count += (max-arr[i])/k;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Incr(arr,k);
        sc.close();
    }
}
