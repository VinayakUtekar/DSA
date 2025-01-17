import java.util.Scanner;

public class LengthOfString{
    public static void Find(String s){
        int co = 0;
        for(char c : s.toCharArray()){
            co++;
        }
        System.out.println(co);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.length());
        Find(s);
        sc.close();
    }
}