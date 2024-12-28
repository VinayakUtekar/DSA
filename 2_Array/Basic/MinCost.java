import java.util.Scanner;

public class MinCost {
    public static void Cost(int [] arr){
        int n = arr.length;int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println((n-1)*min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Cost(arr);
        sc.close();
    }
}
