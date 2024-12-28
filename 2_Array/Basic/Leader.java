import java.util.ArrayList;
import java.util.Scanner;

public class Leader {
    public static void Lead(int [] arr){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean l = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    l = false;
                }
            }
            if(l){
                a.add(arr[i]);
            }
        }
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Lead(arr);
        sc.close();
    }
}
