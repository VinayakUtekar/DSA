import java.util.Scanner;

public class Maximum {
    public static void Max(int [] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Max(a);
        sc.close();
    }
}
