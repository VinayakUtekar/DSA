import java.util.Scanner;

public class SimpleInterest {
    public static void Interest(float p, float r, float t){
        float intr = (p*r*t) /100;
        System.out.println(intr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        Interest(p,r,t);
    }    
}
