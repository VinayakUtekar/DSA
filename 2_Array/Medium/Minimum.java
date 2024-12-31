import java.util.Scanner;

public class Minimum {
    public static void Min(int [] a){
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Min(a);
        sc.close();
    }
}
