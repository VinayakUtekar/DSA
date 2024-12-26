import java.util.Scanner;

public class JumpingNumber {
    public static void Jumping(int n){
        int temp,digit;
        int check;
        for (int i = 0; i < n; i++) {
            if(i<10){
                System.out.print(i + " ");
                continue;
            }
            check = 1;temp=i;
            digit=temp%10;
            temp /= 10;
            while(temp!=0){
                if(Math.abs(digit-temp%10)!=1){
                    check = 0;
                    break;
                }
                digit = temp % 10;
                temp /= 10;
            } 
            if(check!=0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Jumping(n);
        sc.close();
    }
}
