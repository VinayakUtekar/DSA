import java.util.Scanner;

public class ClosestNumber {
    public static void Closest(int a, int b){
        int clos = 0;
        int diff = 0;
        for(int i=a-b; i<=a+b; ++i){
            if(i%b==0){
                int min = a-i;
                if(min>diff || (min==diff && i>clos)){
                    clos = i;
                    diff = min;
                }
            }
        }
        System.out.println(clos);
    }
    public static void Closest2(int a, int b){
        int q = a/b;
        int n1 = q*b;
        int n2 = (a*b)>0 ?  (b*(q+1)) : (b*(q-1));
        if((a-n1) > (a-n2)){
            System.out.println(n1);
        }
        else{
            System.out.println(n2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Closest(a,b);
        Closest2(a,b);
        sc.close();
    }
}
