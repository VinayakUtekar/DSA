import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MergeTwoArray {
    public static void Merge(int [] a, int [] b){
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : a) {
            arr.add(i);
        }
        for (int i : b) {
            arr.add(i);
        }
        Collections.sort(arr);
        for(int i=0; i<a.length; i++){
            a[i] = arr.get(i);
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr.get(a.length+i);
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int [] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        Merge(a,b);
        sc.close();
    }
}
