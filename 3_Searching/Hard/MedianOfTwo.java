import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianOfTwo{
    public static void Find(int [] a, int [] a2){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            res.add(a[i]);
        }
        for (int index = 0; index < a2.length; index++) {
            res.add(a2[index]);
        }
        Collections.sort(res);
        if(res.size()%2==0){
            int med = res.size()/2;
            int me = res.get(med-1)+ res.get(med);
            System.out.println(me/2);
        }
        else{
            int med = res.size()/2;
            System.out.println(res.get(med));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int [] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        Find(a,a2);
        sc.close();
    }
}