import java.util.Arrays;
import java.util.Scanner;

public class SortNtoN2{
    public static void Sort(int [] a){
        Arrays.sort(a);
        for (int i : a) {
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
        Sort(a);
        sc.close();
    }
}