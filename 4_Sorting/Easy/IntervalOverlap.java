import java.util.Scanner;

public class IntervalOverlap{
    public static void Over(int [] a, int n){
        for(int i = 1; i < n; i++){
            if((a[i][0] < a[i-1][1])){
                
                if(a[i-1][1]<a[i][1]){
                    System.out.println("Overlap");
                }
                System.out.println("Overlappp");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            int [] b = new int[2];
            for (int j = 0; j < 2; j++) {
                b[0] = sc.nextInt();
                b[1] = sc.nextInt();
            }
        }
        Over(a,n);
        sc.close();
    }
}