import java.util.Scanner;

public class FixedPoint {
    public static void Find(int []a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == i){
                System.out.println(a[i]);
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
        Find(a);
        sc.close();
    }
}
