import java.util.Scanner;

public class SearchArray {
    public static void Search(int [] a, int k){
        int m = -1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == k){
                m = i;
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
        int k = sc.nextInt();
        Search(a,k);
        sc.close();
    }
}
