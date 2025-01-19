import java.util.Scanner;

public class RotateMatch {
    public static void Rot(String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            if(s1.equals(s2)){
                System.out.println("Match");
                break;
            }
            char l = s1.charAt(s1.length()-1);
            s1 = l + s1.substring(0, s1.length()-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        Rot(s1,s2);
        sc.close();
    }
}
