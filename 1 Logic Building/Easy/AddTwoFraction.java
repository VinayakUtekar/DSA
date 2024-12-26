import java.util.Scanner;

public class AddTwoFraction {
    public static int gcd(int den1, int den2){
        if(den1==0){
            return den2;
        }
        return gcd(den2%den1, den1);
    }
    public static void lowest(int den3, int n3){
        int c = gcd(n3, den3);
        den3 = den3/c;
        n3 = n3/c;
        System.out.println(n3+"/"+den3);
    }
    public static void AddFract(int n1, int den1, int n2, int den2){
        int den3 = gcd(den1,den2);
        den3 = (den1*den2)/den3;
        int n3 =((n1)*(den3/den1))+((n2)*(den3/den2));
        lowest(den3, n3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int d1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.print(n1+"/"+d1+"+"+n2+"/"+d2+"=");
        AddFract(n1,d1,n2,d2);
        sc.close();
    }
}
