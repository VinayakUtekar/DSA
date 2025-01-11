import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EvenIncOddDec {
    public static void Sort(int [] a){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        for (int i : even) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = a.length-1; j >= 0; j++){
            System.out.print(a[j] + " ");
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