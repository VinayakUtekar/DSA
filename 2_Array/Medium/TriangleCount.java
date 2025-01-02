import java.util.Scanner;

public class TriangleCount {
    public static void Triangle(int [] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                for (int j2 = j+1; j2 < a.length; j2++) {
                    if(a[i]+a[j] > a[j2] &&
                    a[i]+a[j2] > a[j] &&
                    a[j]+a[j2] > a[i]
                    ){
                        count++;
                        System.out.println(a[i] + " " + a[j] + " " + a[j2]);
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Triangle(a);
        sc.close();
    }
}
