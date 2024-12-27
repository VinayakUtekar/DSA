import java.util.Scanner;

public class WeekOfDay {
    public static void Day(int a, int b, int c){
        int[] mon = {0,3,3,6,1,4,6,2,5,0,3,5};
        String[] dy = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        int ce = 0;int sum =0;
        if(c>=1600 && c<=1699)
            ce = 6;
        else if(c>=1700 && c<=1799)
            ce = 4;
        else if(c>=1800 && c<=1899)
            ce = 2;
        else if(c>=1900 && c<=1999)
            ce = 0;
        else if(c>=2000 && c<=2099)
            ce = 6;

        int y = c%100;
        sum = y + (y/4) + a + mon[b-1] + ce;
        int da = sum % 7;
        System.out.println(dy[da]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        Day(dd,mm,yyyy);
        sc.close();
    }
}
