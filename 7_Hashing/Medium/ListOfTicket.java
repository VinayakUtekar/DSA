import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ListOfTicket {
    public static ArrayList<ArrayList<String>> find(ArrayList<ArrayList<String>> l){
        HashMap<String, String> d = new HashMap<>();
        HashMap<String,String> r = new HashMap<>();
        for(ArrayList<String> i : l){
            d.put(i.get(0), i.get(1));
        }
        for(ArrayList<String> i : l){
            r.put(i.get(1), i.get(0));
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        String sta = "";
        for(int i=0; i<l.size(); i++){
            if(!r.containsKey(l.get(i).get(0))){
                sta = l.get(i).get(0);
                break;
            }
        }
        String cur = sta;
        while(d.containsKey(cur)){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(cur);
            temp.add(d.get(cur));
            ans.add(temp);
            cur = d.get(cur);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<String>> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            ArrayList<String> se = new ArrayList<>();
            se.add(s1);
            se.add(s2);
            l.add(se);
        }

        ArrayList<ArrayList<String>> res = find(l);
        for(ArrayList<String> i : res){
            System.out.println(i.get(0) + "->" + i.get(1));
        }
    }
}