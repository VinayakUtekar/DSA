import java.util.Scanner;

public class SortString {
    public static void Sort(String s){
        char [] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]>ch[j]){
                    char temp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = temp;
                }
            }
        }
        for (char c : ch) {
            System.out.print( c + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Sort(s);
        sc.close();
    }
}
