import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static void Iso(String s1, String s2){
        HashMap<Character,Character> mp = new HashMap<>();
        boolean h = true;
        for(int i=0; i<s1.length(); i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(mp.containsKey(a)){
                char c = mp.get(a);
                if(c!=b){
                    h = false;
                }
            }
            else{
                mp.put(a, b);
                mp.put(b, a);
            }
        }
        if(h){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Iso(s1, s2);
        sc.close();
    }
}
