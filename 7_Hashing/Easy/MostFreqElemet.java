
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFreqElemet {
    public static void Maxi(int [] a){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(!mp.containsKey(a[i])){
                mp.put(a[i], 1);
            }
            else{
                int p = mp.get(a[i]);
                mp.remove(a[i]);
                mp.put(a[i], p+1);
            }
        }
        int i=0, max=0, j=0;
        for(Map.Entry<Integer,Integer> s : mp.entrySet()){
            if(max < s.getValue()){
                max = s.getValue();
                j = s.getKey();
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(j);
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