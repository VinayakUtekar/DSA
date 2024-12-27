import java.util.Scanner;

public class TwoDistancePodouble {
    public static void Distance(double a, double b, double c, double d){
        double s1 = d-b;
        double s2 = c-a;
        double s3 = s1*s1 + s2*s2;
        System.out.println(Math.sqrt(s3));
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       Distance(x1,y1,x2,y2);
       sc.close();
    }
}
