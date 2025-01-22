import java.util.ArrayList;
import java.util.Scanner;

public class PermutationString {
    
    public static void Permu(String s, String current, ArrayList<String> res){
        if (s.length() == 0) {
            res.add(current);
            return;
        }
        
        for (int i = 0; i < s.length(); i++) {
            String remaining = s.substring(0, i) + s.substring(i + 1);
            Permu(remaining, current + s.charAt(i), res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> res = new ArrayList<>();
        Permu(s, "", res);
        
        for (String perm : res) {
            System.out.println(perm);
        }
        sc.close();
    }
}
