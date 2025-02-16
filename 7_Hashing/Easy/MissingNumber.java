import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber{
    public static void Missing(int [] a, int l, int h){
        HashSet<Integer> he = new HashSet<>();
        for (int i = 0; i < a.length; i++) 
            he.add(a[i]);
        for(int i=l; i<=h; i++){
            if(!he.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int h = sc.nextInt();
        Missing(a,l,h);
        sc.close();
    }
}