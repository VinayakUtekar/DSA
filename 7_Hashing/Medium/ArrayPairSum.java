import java.util.HashMap;
import java.util.Scanner;

public class ArrayPairSum{
    public static void Find(int [] a, int d){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i< a.length; i++) {
            for(int j=0; j<a.length; j++){
                int s = a[i] + a[j];
                if(s%d==0){
                    mp.put(a[i],a[j]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        Find(a, n2);
        sc.close(); 
    }
}