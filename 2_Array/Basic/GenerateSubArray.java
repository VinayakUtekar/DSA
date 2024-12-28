import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSubArray {
    public static void Sub(int [] arr){
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            ArrayList<Integer> a = new ArrayList<>();
            a.add(arr[i]);
            for (int j = i+1; j < arr.length; j++) {
                a.add(arr[j]);
                for (Integer integer : a) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Sub(arr);
        sc.close();
    }
}
