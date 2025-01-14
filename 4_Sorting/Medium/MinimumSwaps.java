import java.util.HashMap;
import java.util.Scanner;

public class MinimumSwaps {
    public static int minSwaps(int[] arrA, int[] arrB) {
        int n = arrA.length;
        int swaps = 0;
        HashMap<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            positionMap.put(arrB[i], i);
        }
        for (int i = 0; i < n; i++) {
            if (arrA[i] != arrB[i]) {
                swaps++;
                int correctIndex = positionMap.get(arrA[i]);
                int temp = arrB[i];
                arrB[i] = arrB[correctIndex];
                arrB[correctIndex] = temp;
                positionMap.put(temp, correctIndex);
                positionMap.put(arrB[i], i);
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays:");
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        int result = minSwaps(arrA, arrB);
        System.out.println("Minimum swaps required: " + result);
        sc.close();
    }
}
