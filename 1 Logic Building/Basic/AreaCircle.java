import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(3.14 * r *r);
        sc.close();
    }
}
