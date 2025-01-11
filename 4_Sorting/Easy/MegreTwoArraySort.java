import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MegreTwoArraySort {
    public static void Sort(int [] a, int [] b){
        ArrayList<Integer> as = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            as.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            as.add(b[i]);
        }
        Collections.sort(as);
        for (int i : as) {
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
        int n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        Sort(arr, arr2);
        sc.close();
    }
}
