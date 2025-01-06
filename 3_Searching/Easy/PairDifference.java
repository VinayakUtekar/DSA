import java.util.Scanner;

public class PairDifference {
    public static void Diff(int [] a, int d){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(Math.abs(a[i]-a[j])==d){
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        Diff(arr,d);
        sc.close();
    }
}
