import java.util.Scanner;

public class KFrequentEle {
    public static void Find(int[] a, int k){
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count >= k){
                System.out.print(a[i] + " ");
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
        int t = sc.nextInt();
        Find(a,t);
        sc.close();
    }
}
