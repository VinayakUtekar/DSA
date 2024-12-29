import java.util.Scanner;

public class SortedSubsequence3 {
    public static void Sort(int [] arr){
        int n = arr.length;
        if(n<3){
            System.out.println("No Sequence");
        }

        int[] smaller = new int[n]; 
        int[] larger = new int[n]; 
        smaller[0] = -1; 
        int minIndex = 0; 
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
                smaller[i] = -1; 
            } else {
                smaller[i] = minIndex;
            }
        }

        larger[n - 1] = -1;
        int maxIndex = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
                larger[i] = -1; 
            } else {
                larger[i] = maxIndex;
            }
        }

        for (int i = 0; i < n; i++) {
            if (smaller[i] != -1 && larger[i] != -1) {
                System.out.println("Sorted subsequence: " +
                        arr[smaller[i]] + " " + arr[i] + " " + arr[larger[i]]);
                return;
            }
        }

        System.out.println("No sorted subsequence of size 3 exists.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Sort(arr);
        sc.close();
    }
}
