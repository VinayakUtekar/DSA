import java.util.Scanner;

public class MajorityEle {
    public static void Major(int [] a){
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i] == a[j]){
                    count++;
                }
            }
            if(count > a.length/2){
                System.out.println("ans : " + a[i]);
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
        Major(a);
        sc.close();
    }
}
