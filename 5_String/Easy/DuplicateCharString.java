import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharString{
    public static void Dupli(String s){
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            if(mp.containsKey(s.charAt(index))){
                int n = mp.get(s.charAt(index));
                mp.remove(s.charAt(index));
                mp.put(s.charAt(index), n+1);
            }
            else{
                mp.put(s.charAt(index), 1);
            }
        }
        for (Map.Entry<Character,Integer> m : mp.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Dupli(s1);
        sc.close();
    }
}