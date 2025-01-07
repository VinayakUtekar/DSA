import java.util.Scanner;

public class PartitionPoint {
    public static void Peak(int [] a){
        for (int i = 0; i < a.length; i++) {
            boolean g = true;
            boolean f = true;
            for (int j = 0; j < i; j++) {
                if(a[j] > a[i]){
                    g = false;
                }
            }
            for (int j = i+1; j < a.length; j++) {
                if(a[j] < a[i]){
                    f = false;
                }
            }
            if(g && f){
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
        Peak(a);
        sc.close();
    }
}
