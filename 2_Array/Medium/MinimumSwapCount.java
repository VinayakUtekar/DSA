import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MinimumSwapCount {

    public static void Min(int[] arr) {
        int n = arr.length;
        
        Pair[] arrPos = new Pair[n];
        for (int i = 0; i < n; i++) {
            arrPos[i] = new Pair(arr[i], i);
        }

        Arrays.sort(arrPos, Comparator.comparingInt(p -> p.value));

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arrPos[i].index == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arrPos[j].index;
                cycleSize++;
            }

            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }

        System.out.println(swaps);
    }

    static class Pair {
        int value, index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        Min(a);
        sc.close();
    }
}
