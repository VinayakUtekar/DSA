import java.util.Scanner;

public class CamelCaseSentence {
    public static void Camel(String s){
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                 ans = ans + Character.toUpperCase(s.charAt(i+1)); 
                 i++; 
            }
            else{
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Camel(s);
        sc.close();
    }
}
