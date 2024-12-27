import java.util.Scanner;

public class ClockAngle{
    public static void Angle(int h, int m){
        if(h<0 || h>12 || m<0 || m>60){
            System.out.println("Invalid");
        }
        else if(h==12){
            h=0;
        }
        else if(m==60){
            m=0;
            h = h+1;
        }
        else if(h>12){
            h = h-12;
        }
        int ha = (int)(0.5*(h*60+m));
        int ma = (int)(6*m);
        int angle = Math.abs(ha-ma);
        angle = Math.min(360-angle,angle);
        System.out.println(angle);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        Angle(h,m);
        sc.close();
    }
}