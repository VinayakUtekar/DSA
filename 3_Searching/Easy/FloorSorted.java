import java.util.Scanner;

public class FloorSorted {
    public static void Floor(int [] a, int x){
        int floor = 0;
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] <= x && max < a[i]){
                floor = a[i];
                max = a[i];
                break;
            }
        }
        System.out.println(floor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        Floor(a,x);
        sc.close();
    }
}
