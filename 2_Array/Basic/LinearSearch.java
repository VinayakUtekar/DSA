import java.util.Scanner;


public class LinearSearch {
    public static void Search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Search(arr, x);
        sc.close();
    }
}
