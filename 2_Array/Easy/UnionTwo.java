import java.util.ArrayList;
import java.util.Scanner;

public class UnionTwo {
    public static void Find(int [] arr, int [] arr2){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!a.contains(arr[i])){
                a.add(arr[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!a.contains(arr2[i])){
                a.add(arr2[i]);
            }
        }
        for (Integer inter : a) {
            System.out.print(inter + " ");
        }
    }
    public static void main(String[] args) {
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
        Find(arr,arr2);
        sc.close();
    }
}
