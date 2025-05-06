public class NumEvenDigit {
	public static void main(String[] args) {
		int n = 758;
		while(n!=0) 
		{
			int digi = n % 10;
			if(digi % 2 == 0) {
			System.out.println(digi);
			}
			n = n / 10;
		}
	}
}