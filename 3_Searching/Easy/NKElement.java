import java.util.Scanner;

public class NKElement {
    public static void Ele(int [] a, int k){
        int d = a.length/k;
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > d){
                System.out.println(a[i]);
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
        int k = sc.nextInt();
        Ele(a,k);
        sc.close();
    }
}
