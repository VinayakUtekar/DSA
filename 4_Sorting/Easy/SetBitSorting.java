import java.util.Scanner;

public class SetBitSorting {
    private static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            count += (num & 1); 
            num >>= 1; 
        }
        return count;
    }
    public static void sortBySetBits(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int setBits1 = countSetBits(arr[j]);
                int setBits2 = countSetBits(arr[j + 1]);
                if (setBits1 < setBits2 || (setBits1 == setBits2 && arr[j] > arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortBySetBits(arr);
        System.out.println("Array sorted by set bits:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
