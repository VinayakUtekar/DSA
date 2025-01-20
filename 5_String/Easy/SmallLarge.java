import java.util.Scanner;

public class SmallLarge {
    public static void Len(String s){
        String [] sd = s.split(" ");
        String M = sd[0], N = "";
        int min = Integer.MAX_VALUE, max = sd[0].length();
        for (int i = 0; i < sd.length; i++) {
            if(sd[i].length() > max){
                min = max;
                N = M; 
                max = sd[i].length();
                M=sd[i]; 
            }
            else if(sd[i].length() < min){
                min = sd[i].length();
                N=sd[i];
            }
        }
        System.out.println(M + "   " + N);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Len(s);
        sc.close();
    }
}
