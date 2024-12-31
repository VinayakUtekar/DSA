import java.util.Scanner;

public class RotationCountSort {
    public static void Count(int [] a){
        int min = a[0], m = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
                m=i;
            }
        }
        System.out.println(m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Count(a);
        sc.close();
    }
}
