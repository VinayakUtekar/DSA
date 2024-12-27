import java.util.Scanner;

public class TowerHanoi {
    public static void Tower(int n, char a, char c, char b){
        if(n==0){
            return;
        }
        Tower(n-1,a,b,c);
        System.out.println("Move Disk: " + n + " From: "+a+" To: "+c);
        Tower(n-1,b,c,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tower(n,'A','C','B');
        sc.close();
    }
}
