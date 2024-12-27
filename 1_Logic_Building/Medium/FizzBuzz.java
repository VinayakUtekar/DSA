import java.util.Scanner;

public class FizzBuzz {
    public static void fizBuz(int n){
        if(n%3==0 && n%5==0){
            System.out.println("FizzBuzz");
        }
        else if(n%3==0){
            System.out.println("Fizz");
        }
        else if(n%5==0){
            System.out.println("Buzz");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fizBuz(n);
        sc.close();
    }
}
