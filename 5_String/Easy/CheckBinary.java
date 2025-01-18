import java.util.Scanner;

public class CheckBinary{
    public static void Check(String s){
        boolean b = true;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!='0' && s.charAt(i)!='1'){
                b = false;
            }
        }
        if(b){
            System.out.println("Binary");
        }
        else{
            System.out.println("Not Binary");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Check(s);
        sc.close();
    }
}