import java.util.ArrayList;
import java.util.Scanner;

public class PossibleString {
    public static void Possible(String s){
        ArrayList<String> g = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String h = "" + s.charAt(i);
            if (!g.contains(h)) {
                g.add(h);
            }
            for (int j = i+1; j < s.length(); j++) {
                h = h + s.charAt(j);
                if (!g.contains(h)) {
                    g.add(h);
                }
            }
        }
        for (String i : g) {
            System.out.print(i + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Possible(s);
        sc.close();
    }
}
