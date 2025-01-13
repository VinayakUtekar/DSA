import java.util.Arrays;
import java.util.Scanner;

public class MinIncrement{
    public static void Find(int [] a){
        Arrays.sort(a);
        int count=0;
        for (int i = 1; i < a.length; i++) {
            while (a[i] == a[i]) {
                a[i] = a[i] + 1;
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Find(a);
        sc.close();
    }
}