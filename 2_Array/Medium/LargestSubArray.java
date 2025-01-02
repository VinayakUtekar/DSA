import java.util.Scanner;

public class LargestSubArray {
    public static void Larg(int [] a){
        int sum = 0;
        int max = -1, s=0, e=0;
        for (int i = 0; i < a.length; i++) {
            sum = (a[i]==0) ? -1 : 1;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]==0)
                    sum += -1;
                else
                    sum += 1;

                if(sum == 0 && max<j-i+1){
                    max = j-i+1;
                    s=i;
                }
            }
        }
        e = s+max-1;
        if(max==-1){
            System.out.println("No Array");;
        }
        else{
            System.out.println(s + " " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Larg(a);
        sc.close();
    }
}