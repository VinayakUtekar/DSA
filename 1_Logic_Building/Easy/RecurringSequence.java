import java.util.HashMap;
import java.util.Scanner;

public class RecurringSequence {
    public static String Recurssion(int n, int d){
        String res="";
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.clear();
        int rem = n%d;
        while((rem!=0) &&(!hm.containsKey(rem))){
            hm.put(rem, res.length());
            rem = rem * 10;
            int res_part = rem/d;
            res = res + String.valueOf(res_part);
            rem = rem % d;
        }
        if(rem==0){
            return "";
        }
        else if(hm.containsKey(rem)){
            return res.substring(hm.get(rem));
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        String res = Recurssion(n,d);
        if(res == ""){
            System.out.println("No Recurssion");
        }
        else{
            System.out.println("Recurssion:" + res);
        }
        sc.close();
    }
}
