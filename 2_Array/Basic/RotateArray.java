import java.util.Scanner;

public class RotateArray {
    public static void Rot(int [] arr, int n){
        int b = arr.length;
        for (int i = 0; i < n; i++) {
            int l = arr[b-1];
            for (int j = b-1; j >0; j--) {
                arr[j] = arr[j-1];
            }  
            arr[0] = l;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        Rot(arr,d);
        sc.close();
    }   
}
