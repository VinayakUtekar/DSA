import java.util.Scanner;

public class SortStringLength{
    public static void Sort(String [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                String s = a[i];
                String s2 = a[j];
                if(s.length()>s2.length()){
                    String temp = s2;
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (String  St : a) {
            System.out.print(St + " ");
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        Sort(arr);
        sc.close();
    }
}