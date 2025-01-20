import java.util.Scanner;

public class FirstNotRepeatChar {
    public static void Repeat(String s){
        for(int i=0; i<s.length(); i++){
            boolean not = true;
            for(int j = i+1; j<s.length(); j++){
                if(s.charAt(i) != s.charAt(j)){
                    not = false;
                    break;
                }   
            }
            if(!not){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        Repeat(s1);
        sc.close();
    }
}