import java.util.Scanner;

public class QueriesCharacter {
    public static void Quer(String s, int k, int [][] g){
        int max = 0;
        for (int i = 0; i < k; i++) {
            if(g[k][1] > max){
                max = g[k][1];
            }
            if(g[k][2] > max){
                max = g[k][2];
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();
        int [][] g = new int[k][2];
        Quer(s, k, g);
        sc.close();
    }
}
