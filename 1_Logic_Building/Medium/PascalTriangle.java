import java.util.Scanner;

public class PascalTriangle {
    public static void Pascal(int n){
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0;j<=i; j++){
                if(j==0 || j==n){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1] + arr[i-1][j];
                    
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pascal(n);
        sc.close();
    }
}
