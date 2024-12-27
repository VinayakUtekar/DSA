import java.util.Scanner;

public class LargPrime {
    public static boolean Prime(int n){
        int count = 2;
        for (int i = 2; i <= n/2; i++) {
            if(n%i == 0){
                count ++;
            }
        }
        if(count == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void Fact(int n){
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                if(Prime(i)){
                    if(ans <= i){
                        ans = i;
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fact(n);
        sc.close();
    }   
}
