import java.util.Arrays;
import java.util.Scanner;

public class MissingElements {
    public static void Over(int [] a){
        Arrays.sort(a);
        int min = a[0], max = a[a.length-1];
        while(min <= max){
            boolean f = true;
            for (int i = 0; i < a.length; i++) {
                if(min == a[i]){
                    f = false;
                }
            }
            if(f){
                System.out.print(min + " ");
            }
            min++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int j = 0; j < n; j++) {
            a[j] = sc.nextInt();
        }
        Over(a);
        sc.close();
    }
}
