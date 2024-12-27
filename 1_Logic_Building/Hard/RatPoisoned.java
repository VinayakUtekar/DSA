import java.util.Scanner;

public class RatPoisoned {
    public static double log2(int x){
        return (Math.log(x)/Math.log(2));
    }
    public static void Rat(int n){
        System.out.println(
            ((int)Math.floor(log2(n))+1)
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rat(n);
        sc.close();
    }
}
