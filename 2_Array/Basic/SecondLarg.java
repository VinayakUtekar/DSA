import java.util.Scanner;

public class SecondLarg {
    public static void Larg(int[] arr){
        int max = arr[0];
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i]<max && arr[i]>=max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Larg(arr);
        sc.close();
    }
}
