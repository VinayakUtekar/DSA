import java.util.Scanner;

public class FourSum {
    public static void Three(int [] a, int t){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+i; j2 < a.length; j2++) {
                    for(int k = j2+1; k<a.length; k++){
                        if((a[i] + a[j] + a[j2] + a[k]) == t){
                            System.out.println(a[i] + " " + a[j] + " " + a[j2] + " " + a[k]);
                        }
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
        int t = sc.nextInt();
        Three(a,t);
        sc.close();
    }
}
