import java.util.Scanner;

public class SecondMostRepeat {
    public static void Repeat(String [] s){
        for (int i = 0; i < s.length; i++) {
            for (int j = i+1; j < s.length; j++) {
                if(s[i].equals(s[j])){
                    System.out.println(s[i]);
                }
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] sg = new String[n];
        for (int i = 0; i < n; i++) {
            sg[i] = sc.nextLine();
        }
        Repeat(sg);
        sc.close();
    }
}
