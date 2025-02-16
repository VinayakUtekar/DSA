
import java.util.Scanner;
import java.util.HashSet;

public class RepeatElement {
    public static void Repeat(int [] a){
        HashSet<Integer> h = new HashSet<>();
        for(int i : a){
            if(h.contains(i)){
                System.out.println(i);
            }
            else{
                h.add(i);
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
        Repeat(a);
        sc.close();
    }
}