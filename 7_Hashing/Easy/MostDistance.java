import java.util.*;

public class MostDistance {
    public static void Maxi(int [] a){
        int res = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
           if(!mp.containsKey(a[i])){
                mp.put(a[i], i);
           } 
           else{
                res = Math.max(res, i - mp.get(a[i]));
           }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> m: mp.entrySet()){
            if(m.getValue() < max){
                max = m.getValue();
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
        Maxi(a);
        sc.close();
    }
}