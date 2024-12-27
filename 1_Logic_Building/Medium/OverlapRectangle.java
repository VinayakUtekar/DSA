import java.util.Scanner;

class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class OverlapRectangle extends Point{

    public static boolean Overlap(Point l1, Point r1, Point l2, Point r2){
        if(l1.x > r2.x || l2.x > r1.x){
            return false;
        }
        if(r1.y > l2.y || r2.y > l1.y){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l11 = sc.nextInt();
        int l12 = sc.nextInt();
        int r11 = sc.nextInt();
        int r12 = sc.nextInt();
        int l21 = sc.nextInt();
        int l22 = sc.nextInt();
        int r21 = sc.nextInt();
        int r22 = sc.nextInt();

        Point l1 = new Point(l11,l12);
        Point r1 = new Point(r11,r12);
        Point l2 = new Point(l21,l22);
        Point r2 = new Point(r21,r22);

        if(Overlap(l1,r1,l2,r2)){
            System.out.println("Overlap");
        }
        else{
            System.out.println("Not Overlap");
        }
        sc.close();
    }
}
