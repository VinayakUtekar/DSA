import java.util.Scanner;

public class SameStringOrNot {
    public static void Find(String s1, String s2){
        boolean t = true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(1) != s2.charAt(i)){
                t = false;
            }
        }
        if(t){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1.equals(s2));
        Find(s1,s2);
        sc.close();
    }
}
