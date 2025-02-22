import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarray {
    public static void Find(int [] a, int d){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res = 0, sum = 0;
        for(int i=0; i<a.length; i++){
            sum = ((sum+a[i])%d+d)%d;
            if(sum == 0){
                res = i + 1;
            }
            else if(mp.containsKey(sum)){
                res = Math.max(res, i-mp.get(sum));
            }
            else{
                mp.put(sum, i);
            }
        }
        System.out.println(res);
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