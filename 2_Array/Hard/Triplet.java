import java.util.Arrays;
import java.util.Scanner;

public class Triplet {
    public static void Trip(int [] a, int [] a2, int [] a3){
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(a2);
        Arrays.sort(a3);
        int min =0, max=0, mid=0, i=0, j=0, k=0;
        int diff = 243214144;
        while(i<n && j<n && k<n){
            int sum = a[i] + a2[j] + a3[k];
            int m = Math.max(a[i], Math.max(a2[j], a3[k]));
            int mi = Math.min(a[i], Math.min(a2[j], a3[k]));
            if(mi == a[i])
                i++;
            else if(mi == a2[j])
                j++;
            else
                k++;
            if(diff > (m-mi)){
                diff = m - mi;
                max = m;
                min = mi;
                mid = sum - (m + mi);
            }
        }
        System.out.println(max + " " + mid + " " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int [] a2 = new int[n];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int [] a3 = new int[n];
        for (int i = 0; i < a3.length; i++) {
            a3[i] = sc.nextInt();
        }
        Trip(a,a2,a3);
        sc.close();
    }
}
