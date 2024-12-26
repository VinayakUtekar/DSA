import java.util.HashMap;
import java.util.Scanner;

public class FractionRecurring {
    public static void Fraction(int a, int b){
        if(a==0){
            System.out.println("Invalid");
        }
        String res = (a<0)^(b<0) ? "-" : "";
        a = Math.abs(a);
        b = Math.abs(b);
        res = res + Integer.toString(a/b);
        int rem = a%b;
        if(rem==0){
           System.out.println(res);
        }
        res = res + ".";
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(rem>0){
            if(hm.containsKey(rem)){
                res = res.substring(0,hm.get(rem))+"("+res.substring(hm.get(rem)) + ")";
                break;
            }
            hm.put(rem, res.length());
            rem = rem *10;

            res = res + Integer.toString(rem/b);
            rem = rem%b;
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        Fraction(n,b);
        sc.close();
    }
}
