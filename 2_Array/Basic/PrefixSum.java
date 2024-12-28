import java.util.Scanner;

public class PrefixSum {
    public static void Sum(int [] a){
        int [] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if(i==0){
                res[i] = a[i];
            }
            else{
                res[i] = a[i] + res[i-1];
            }
        }
        for (int i : res) {
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
        Sum(a);
        sc.close();
    }
}
