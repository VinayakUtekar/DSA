import java.util.Scanner;

public class MissingInAP {
    public static void Miss(int [] a){
        int g = a[1] - a[0];
        for (int i = 1; i < a.length; i++) {
            int k = a[i]-g;
            if(!(a[i-1] == k)){
                System.out.println(k);
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
        Miss(a);
        sc.close();
    }
}
