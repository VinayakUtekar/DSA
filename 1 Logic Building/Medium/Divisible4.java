import java.util.Scanner;

public class Divisible4 {
    public static void check(int n){
        if(n%4==0){
            System.out.println("Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
        sc.close();
    }
}
