import java.util.Scanner;

public class CheckPower {
    public static boolean Check(int x, int y){
        if(x==1){
            return (y==1);
        }
        int pow = 1;
        while(pow < y){
             pow = pow * x;
        }
        return (pow == y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.err.println(Check(x,y) ? 1 : 0);
        sc.close();
    }
}
