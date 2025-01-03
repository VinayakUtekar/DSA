import java.util.Scanner;

public class TripletsToZero {
    public static void Triplet(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    if((a[i] + a[j] + a[j2])== 0){
                        System.out.println(i + " " + j + " " + j2);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Triplet(a);
        sc.close();
    }
}
