import java.util.Scanner;

public class LengthOfString {
    public static int Len(String s){
        if(s.equals("")){
            return 0;
        }
        else{
            return Len(s.substring(1))+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = Len(s);
        System.out.println(l);
        sc.close();
    }
}
