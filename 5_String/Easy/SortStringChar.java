import java.util.Scanner;

public class SortStringChar {
    public static void Sort(String s){
        char [] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] < ch[j]){
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }
        }
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Sort(s);
        sc.close();
    }
}
