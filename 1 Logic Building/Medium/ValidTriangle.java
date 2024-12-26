import java.util.Scanner;

public class ValidTriangle {
    public static void Triangle(int a, int b, int c){
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Not Triangle");
        }
        else{
            System.out.println("Triangle");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Triangle(a,b,c);
        sc.close();
    }
}
