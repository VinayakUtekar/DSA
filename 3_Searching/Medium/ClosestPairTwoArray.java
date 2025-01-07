import java.util.ArrayList;
import java.util.Scanner;

public class ClosestPairTwoArray {
    public static void Find(int[] a, int[] a2, int t) {
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> closestPair = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                int sum = a[i] + a2[j];
                int diff = Math.abs(sum - t);
                
                if (diff < minDiff) {
                    minDiff = diff;
                    closestPair.clear();
                    closestPair.add(a[i]);
                    closestPair.add(a2[j]);
                }
            }
        }

        System.out.println(closestPair);
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
        int t = sc.nextInt();
        Find(arr, arr2, t);
        sc.close();
    }
}
