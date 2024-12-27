import java.util.Scanner;

public class SwapTwo {
    public static void Swap1(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a+","+b);
    }
    public static void Swap2(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+","+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+","+b);
        Swap1(a, b);
        Swap2(a, b);
        sc.close();
    }
}
