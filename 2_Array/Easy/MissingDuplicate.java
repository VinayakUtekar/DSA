import java.util.Scanner;

public class MissingDuplicate {
    public static void Miss(int [] arr, int k){
        int[] freq = new int[k + 1];
        int repeating = -1;
        int missing = -1;
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 1; i <= k; i++) {
            if (freq[i] == 2) {
                repeating = i;
            } else if (freq[i] == 0) {
                missing = i;
            }
        }
        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Miss(arr, k);
        sc.close();
    }
}