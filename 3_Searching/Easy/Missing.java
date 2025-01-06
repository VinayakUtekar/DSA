import java.util.Scanner;

public class Missing {
    public static void Miss(int [] arr, int k){
        int sum = 0, c = (k*(k+1))/2;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        
        System.out.println("Missing : " + (c-sum));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Miss(arr, k);
        sc.close();
    }
}
