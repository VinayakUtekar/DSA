import java.util.Scanner;

public class BitonicPoint {
    public static void Bit(int [] a){
        for (int i = 0; i < a.length; i++) {
            boolean min = true;
            for (int j = i-1; j >=0; j--) {
                if(a[j]>a[i]){
                    min = false;
                }
            }
            boolean max = true;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]>a[i]){
                    max = false;
                }
            }
            if(min && max){
                System.err.println(a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Bit(a);
        sc.close();
    }
}
