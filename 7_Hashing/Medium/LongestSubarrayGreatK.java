import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayGreatK {
    public static void Find(int [] a, int d){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res = 0, sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + (a[i]>d ? 1 : -1);
            if(!mp.containsKey(sum)){
                res = Math.max(sum, i);
            }
        }
        if(mp.containsKey(sum)){
            System.out.println(0);
        }
        else{
            mp.put(-a.length, a.length);
            for(int i = -a.length+1; i<=a.length;i++){
                if(!mp.containsKey(i)){
                    mp.put(i, mp.get(i-1));
                }
                else{
                    mp.put(i, Math.min(mp.get(i), mp.get(i-1)));
                }
            }
            sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += (a[i] > d ? 1 : -1);
                if(sum > 0)
                    res = i + 1;
                else 
                    res = Math.max(res, i - mp.get(sum - 1));
            }
            System.out.println(res);
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