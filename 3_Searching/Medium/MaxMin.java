import java.util.Scanner;

public class MaxMin {
    public static void MaxM(int [] a){
        int max = a[0];
        int min = a[1];
        for (int i = 0; i < a.length; i++) {
            if(a[i]> max){
                max = a[i];  
            }
            else if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(max + " " + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        MaxM(a);
        sc.close();
    }
}
