import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KMissingNumber{
    public static void Miss(int [] a, int k){
        Arrays.sort(a);
        ArrayList<Integer> res = new ArrayList<>();
        int i = 1;
        int ind = 0;
        while(res.size()<k){
            if(ind<a.length && a[ind] == i){
                ind++;
            }
            else{
                res.add(i);
            }
            i++;
        }
        System.out.println(res.get(k-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Miss(a,k);
        sc.close();
    }
}