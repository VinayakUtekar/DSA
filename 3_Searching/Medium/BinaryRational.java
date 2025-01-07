import java.util.Scanner;

public class BinaryRational {
    public static int binarySearch(int[][] arr, int[] target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int lhs = target[0] * arr[mid][1]; 
            int rhs = target[1] * arr[mid][0]; 
            if (lhs == rhs) {
                return mid; 
            } else if (lhs < rhs) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2]; 
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt(); 
        }
        int[] target = new int[2];
        target[0] = sc.nextInt(); 
        target[1] = sc.nextInt();
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Not Found");
        }
        sc.close();
    }
}
