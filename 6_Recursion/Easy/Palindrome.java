import java.util.Scanner;

public class Palindrome {
    public static boolean Pal(String st, int s, int e){
        if(s==e){
            return true;
        }
        if((st.charAt(s)) != (st.charAt(e))){
            return false;
        }
        if(s<e+1){
            return Pal(st, s+1, e-1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.length() == 0){
            System.out.println(true);
        }
        else{
            if(Pal(s,0,s.length()-1)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        sc.close();
    }
}
