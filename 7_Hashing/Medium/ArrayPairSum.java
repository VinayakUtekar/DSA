import java.util.HashMap;
import java.util.Scanner;

public class ArrayPairSum{
    public static boolean Find(int [] a, int d){
        if(a.length%2 == 1){
            return false;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0; i< a.length; i++) {
                int rem = ((a[i]%d)+d)%d;
                if(!mp.containsKey(a[i])){
                    mp.put(rem,0);
                }
                else{
                    mp.put(rem, mp.get(rem) + 1);
                }
        }
        for(int i=0; i<a.length; i++){
            int rem = ((a[i]%d)+d)%d;
            if(2*rem==d){
                if(mp.get(rem)%2==1){
                    return false;
                }
            }
            else if(rem == 0){
                if(mp.get(rem)%2==1){
                    return false;
                }
            }
            else{
                int f  = mp.get(d-rem);
                int g = mp.get(rem);
                if(f!=g){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        if(Find(a, n2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close(); 
    }
}