import java.util.ArrayList;
import java.util.Scanner;

public class SortToN {
    public static void Sort(int [] a, int [] a2){
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a2[i] == a[j]){
                    ar.add(a[j]);
                }
            }
        }
        for (Integer i : ar) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < a.length; i++) {
            boolean g = false;
            for (int j = 0; j < a2.length; j++) {
                if(a[i]==a2[j]){
                    g = true;
                }
            }
            if(!g){
                System.out.print(a[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int nu = sc.nextInt();
        int [] a2 = new int[nu];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        Sort(a,a2);
        sc.close();
    }
}
