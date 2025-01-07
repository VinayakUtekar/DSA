import java.util.Scanner;

public class KClosestEle {
    public static void Find(int[] a, int x,int k){
        int [] res = new int[a.length];
        for (int i = 0; i < res.length; i++) {
            if(a[i] == x){
                res[i] = Integer.MAX_VALUE;
            }
            else{
                res[i] = Math.abs(a[i]-x);
            }
            
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = i+1; j < res.length; j++) {
                if(res[j] < res[i]){
                    int temp = res[j];
                    res[j] = res[i];
                    res[i] = temp;
    
                    int temp2 = a[j];
                    a[j] = a[i];
                    a[i] = temp2; 
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int k = sc.nextInt();
        Find(a,x,k);
        sc.close();
    }
}
