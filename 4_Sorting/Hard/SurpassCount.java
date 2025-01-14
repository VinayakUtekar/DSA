import java.util.Scanner;

public class SurpassCount {
    public static void Find(int[] a){
        int [] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i+1; j < a.length; j++) {
                if(a[i] < a[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Find(a);
        sc.close();
    }
}
