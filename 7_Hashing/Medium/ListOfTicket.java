import java.util.Scanner;
import java.util.ArrayList;

public class ListOfTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<String>> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            ArrayList<String> se = new ArrayList<>();
            se.add(s1);
            se.add(s2);
            l.add(se);
        }
    }
}