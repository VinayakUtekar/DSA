import java.util.Scanner;

public class SmallestMiss {
    public static void Missing(int [] arr, int n, int m){
        for (int i = 0; i < m; i++) {
            boolean g = false;
            for (int j = 0; j < arr.length; j++) {
                if(i == arr[j]){
                    g = true;
                    break;
                }
            }
            if(!g){
                System.out.print(i + " ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Missing(a,n,m);
        sc.close();
    }
}
