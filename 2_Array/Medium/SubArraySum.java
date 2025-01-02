import java.util.ArrayList;
import java.util.Scanner;

public class SubArraySum {
    public static void SubArray(int [] a, int t){
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            ArrayList<Integer> ab = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                ab.add(a[j]);
                if (sum == t) {
                    for (int in : ab) {
                        System.out.print(in + " ");
                    }
                    System.out.println();
                    found = true;
                    break; 
                }
                if (sum > t) {
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No subarray found with the given sum.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        SubArray(a, t);
        sc.close();
    }
}
