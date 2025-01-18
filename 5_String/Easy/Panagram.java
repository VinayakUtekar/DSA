import java.util.Scanner;

public class Panagram {
    public static void Pan(String s){
        boolean g = true;
        for (char ch='a'; ch<='z'; ch++) {
            boolean b = false;
            for(int i = 0; i < s.length(); i++) {
                if(ch == Character.toLowerCase(s.charAt(i))){
                    b = true;
                    break;
                }
            }
            if(b == false){
                g = false;
            }
        }
        if(g){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not Panagram");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pan(s);
        sc.close();
    }
}
