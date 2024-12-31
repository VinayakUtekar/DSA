import java.util.Scanner;

public class ProductArray {
    public static void Prod(int [] a){
        int prod[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int fact = 1;
            for (int j = 0; j < a.length; j++) {
                if(j!=i){
                    fact = fact*a[j];
                }
            }
            prod[i] = fact;
        }
        for (int i : prod) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Prod(a);
        sc.close();
    }
}
