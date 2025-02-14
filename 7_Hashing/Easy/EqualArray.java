import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualArray {
    public static void Equal(int [] a, int [] b){
        int n=a.length, m=b.length;
        boolean res = true;
        if(n!=m){
            System.out.println("Not Equal");
        }
        else{
            Map<Integer,Integer> mp = new HashMap<>();
            int count = 0;
            for(int i = 0; i < n; i++){
                if(mp.get(a[i]) == null){
                    mp.put(a[i],1);
                }
                else{
                    count = mp.get(a[i]);
                    count++;
                    mp.put(a[i],count);
                }
            }
            for(int i = 0; i < n; i++){
                if(!mp.containsKey(b[i])){
                    res = false;
                }
                if(mp.get(b[i])==0){
                    res = false;
                }
                count = mp.get(b[i]);
                --count;
                mp.put(b[i],count);
            }
        }
        if(res){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
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
        int [] a2 = new int[n];
        for(int i=0; i<n2; i++){
            a2[i] = sc.nextInt();
        }
        Equal(a,a2);
        sc.close();
    }
}