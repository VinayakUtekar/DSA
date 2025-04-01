import java.util.HashMap;
import java.util.Scanner;

public class LongestSuubArrayTo0 {
    public static void Find(int [] a){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int len = 0, sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
            if(sum == 0){
                len = i + 1;
            }
            else if(mp.containsKey(sum)){
                len = Math.max(len, i-mp.get(sum));
            }
            else{
                mp.put(sum, i);
            }
        }
        System.out.println(len);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Find(a);
        sc.close(); 
    }
}