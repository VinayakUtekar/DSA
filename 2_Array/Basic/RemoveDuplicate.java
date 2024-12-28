import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void Dup(int [] arr){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!a.contains(arr[i])){
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
        Dup(arr);
        sc.close();
    }
}
