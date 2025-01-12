import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeOverlap {
    public static void Merge(int [][] a){
        Arrays.sort(a, Comparator.comparingInt(b -> b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = a[0];
        merged.add(currentInterval);

        for (int[] i : a) {
            int currentEnd = currentInterval[1];
            if (i[0] <= currentEnd) {
                currentInterval[1] = Math.max(currentEnd, i[1]);
            } else {
                currentInterval = i;
                merged.add(currentInterval);
            }
        }

        System.out.println("Merged a:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int[n][2];
        for (int i = 0; i < a.length; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Merge(a);
        sc.close();
    }
}
