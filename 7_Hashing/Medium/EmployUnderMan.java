import java.util.HashMap;

public class EmployUnderMan {
    public static void Find(char [][] a){
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0; i<a.length; i++){
            if(!mp.containsKey(a[i][2])){
                mp.put(a[i][2], 1);
            }
            else{
                mp.get()
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] a = new char[n][2];
        for(int i=0; i<n; i++){
            a[i][0] = sc.next().charAt(0);
            a[i][1] = sc.next().charAt(0);
        }
        Find(a);
    }
}