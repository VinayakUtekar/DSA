import java.util.Scanner;

public class SumGP {
    public static float Sum(float a, float r, int n){
        float s=0;
        for (int i = 0; i < n; i++) {
            s = s +a;
            a = a*r;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float r = sc.nextFloat();
        int n = sc.nextInt();

        System.out.printf("%.5f",Sum(a,r,n));
    }
}
