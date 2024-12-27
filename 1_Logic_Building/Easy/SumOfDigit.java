import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String s = sc.next();
        Suma(n);
        Suma2(s);
        System.out.println(Suma3(n));
        sc.close();
    }
    public static int Suma3(int n){
        if(n==0){
            return 0;
        }
        
        return (n%10) + Suma3(n/10);
    }
    public static void Suma2(String s){
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            int d = s.charAt(i)-'0';
            sum = sum + d;
        }
        System.out.println(sum);
    }
    public static void Suma(int n){
        int sum = 0;
        while(n!=0){
            int d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        System.out.println(sum);
    }
    
}