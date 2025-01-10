import java.util.Scanner;

public class IntervalOverlap{
    public static void Over(int [][] a, int n){
        for(int i = 1; i < n; i++){
            if((a[i][0] < a[i-1][1])){
                
                if(a[i-1][1]<a[i][1]){
                    System.out.println("Overlap");
                }
                System.out.println("Overlappp");
                System.out.println(a[i-1][0]);
                System.out.println(a[i-1][1]);
                System.out.println(a[i][0]);
                System.out.println(a[i][1]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] a = new int [n][2];
        for(int i = 0; i < n; i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Over(a,n);
        sc.close();
    }
}