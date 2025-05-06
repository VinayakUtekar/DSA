public class GCD {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 48, gcd =1;
		for(int i=1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}