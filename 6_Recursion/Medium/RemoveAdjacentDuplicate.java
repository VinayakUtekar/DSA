import java.util.Scanner;

public class RemoveAdjacentDuplicate{
    public static String Remove(String s){
        StringBuilder sg = new StringBuilder();
        int n = s.length();
        for(int i=0; i<n; i++){
            boolean rep = false;
            while(i+1<n && s.charAt(i)==s.charAt(i+1)){
                rep = true;
                i++;
            }
            if(!rep){
                sg.append(s.charAt(i));
            }
        }
        if(n == sg.length()){
            return sg.toString(); 
        }
        return Remove(sg.toString());
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = Remove(s);
        System.out.println(res);
        sc.close();
    }
}