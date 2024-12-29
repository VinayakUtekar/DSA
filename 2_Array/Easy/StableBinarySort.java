import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StableBinarySort {
    public static void Bin(int [] arr){
        ArrayList<Integer> eve = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                eve.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        for (int i : eve) {
            System.out.print(i + " ");
        }
        for (int i : odd) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
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
