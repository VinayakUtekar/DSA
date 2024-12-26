import java.util.Scanner;

public class PairCub {
    public static int count(int n){
        int c = 0;
        for(int i=0; i<= Math.cbrt(n); i++){
            int cb = i*i*i;
            int diff = n-cb;
            int cbrt = (int)Math.cbrt(diff);
            if(cbrt*cbrt*cbrt == diff){
                c++;
            }
        }

        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }
}
