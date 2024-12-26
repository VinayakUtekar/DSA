import java.util.ArrayList;
import java.util.Scanner;

public class Divisor3 {
    public static void Divisor(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            int count = 2;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 3){
                ans.add(i);
            }
        }
        for (Integer integer : ans) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Divisor(n);
        sc.close();
    }
}
