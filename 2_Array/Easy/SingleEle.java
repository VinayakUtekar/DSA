import java.util.Scanner;

public class SingleEle {
    public static void Single(int [] a){
        int num = 0;
        for (int i : a) {
            num ^= i;
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Single(arr);
        sc.close();
    }
}
