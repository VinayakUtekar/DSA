import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNumberMachines {
    static ArrayList<Integer> re = new ArrayList<>();
    public static void Sort(int [] a){
        for(int i = 0; i < a.length; i++) {
            re.add(a[i]);
        }
    }
    public static void Sor(ArrayList<Integer> se){
        Collections.sort(se);
        for(int i : se) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            Sort(a);
        }
        Sor(re);
        sc.close();
    }
}
