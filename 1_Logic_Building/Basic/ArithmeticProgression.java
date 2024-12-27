import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArithmeticProgression {
    public static boolean IfAp(int[] arr, int n){
        if(n==1){
            return true;
        }
        Arrays.sort(arr);
        int d = arr[1] - arr[0];
        for(int i=2; i<n; i++){
            if(arr[i] - arr[i-1] !=d){
                return false;
            }
        }
        return true;
    }
    public static boolean IfAp2(int[] arr, int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int small=Integer.MAX_VALUE, small2=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < small){
                small2 = small;
                small = arr[i];
            }
            else if(arr[i] !=  small && arr[i] < small2 ){
                small2 = arr[i];
            }
            if(!(hm.containsKey(arr[i]))){
                hm.put(arr[i], 1);
            }
            else{
                return false;
            }
        }
        int d = small2-small;
        for (int i = 0; i < n; i++) {
            if(!(hm.containsKey(small)))
                return false;
            small2 += d;
        }
        return true;
    }
    public static boolean Count(int [] arr, int n){
        int [] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        for (int i = 0; i < n; i++) {
            if(count[i] !=1){
                return false;
            }
        }
        return true;
    }
    public static boolean IfAp3(int[] arr, int n){
        int small=Integer.MAX_VALUE, small2=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < small){
                small2 = small;
                small = arr[i];
            }
            else if(arr[i] !=  small && arr[i] < small2 ){
                small2 = arr[i];
            }
        }
        int d = small2-small;
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] - small;
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] % d !=0){
                return false;
            }
            else{
                arr[i] = arr[i]/d;
            }
        }
        if(Count(arr,n)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int j = sc.nextInt();
            arr[i] = j;
        }
        if(IfAp(arr, arr.length)){
            System.out.println("AP");
        }
        else{
            System.out.println("Not AP");
        }
        if(IfAp2(arr, arr.length)){
            System.out.println("AP");
        }
        else{
            System.out.println("Not AP");
        }
        if(IfAp3(arr, arr.length)){
            System.out.println("AP");
        }
        else{
            System.out.println("Not AP");
        }
        sc.close();
    }
}
