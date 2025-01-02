import java.util.Scanner;

public class PeakEle{
    public static void Peak(int [] a){
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1] && a[i] > a[i+1]){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Peak(a);
        sc.close();
    }
}