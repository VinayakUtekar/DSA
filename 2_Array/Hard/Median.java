import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void Med(int [] a){
        for (int i = 1; i <= a.length; i++) {
            int[] temp = Arrays.copyOfRange(a, 0, i);
            Arrays.sort(temp);
            if (i % 2 == 0) {
                double median = (temp[i / 2 - 1] + temp[i / 2]) / 2.0;
                System.out.print((int)median + " ");
            } else {
                System.out.print(temp[i / 2] + " ");
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
        Med(a);
        sc.close();
    } 
}
