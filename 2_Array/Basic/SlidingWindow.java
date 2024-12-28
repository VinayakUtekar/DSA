import java.util.Scanner;

public class SlidingWindow {
    public static void Slide(int [] a , int k){
        if (a.length == 0 || k > a.length || k <= 0) {
            System.out.println("Invalid input");
            return;
        }
        int wind = 0;
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = max + a[i];
        }
        wind = max;
        for (int i = k; i < a.length; i++) {
            max = max + a[i] - a[i-k];
            if(max>wind){
                wind = max;
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
        int k = sc.nextInt();
        Slide(a,k);
        sc.close();
    }
}
