import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PositiveNegative {
    public static void Sort(int [] a){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
            }
        }
        Collections.sort(pos);
        Collections.sort(neg);
        for (int i : pos) {
            System.out.print(i + " ");
        }
        for (int i : neg) {
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
        Sort(arr);
        sc.close();
    }
}
