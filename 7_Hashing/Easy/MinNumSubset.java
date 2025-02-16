
import java.util.Scanner;
import java.util.HashSet;

public class MinNumSubset{
    public static void Min(int [] a){
        int count = 1;
        HashSet<Integer> he = new HashSet<>();
        for (int i = 0; i < a.length; i++) 
        {
            if(!he.contains(a[i])){
                he.add(a[i]);
            }
            else{
                count++;
                he.clear();
                he.add(a[i]);
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Min(a);
        sc.close();
    }
}