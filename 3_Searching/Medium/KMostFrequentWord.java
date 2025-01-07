import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KMostFrequentWord {
    public static void sortByValue(Map<String, Integer> map, int k) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        for (int i = 0; i < k && i < list.size(); i++) {
            System.out.println("Word = " + list.get(i).getKey() + ", Frequency = " + list.get(i).getValue());
        }
    }

    public static void Find(String s, int k){
        String [] a = s.split(" ");
        HashMap<String,Integer> mp = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(mp.containsKey(a[i])){
                int j = mp.get(a[i]);
                mp.remove(a[i]);
                mp.put(a[i], j+1);
            }
            else{
                mp.put(a[i], 1);
            }
        }
        sortByValue(mp,k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        Find(s,k);
        sc.close();
    }
}
