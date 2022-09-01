//Find out first and last digit
package assignment25aug2022;

public class FindFirstandLastDigit {

	public static void main(String[] args) {
		int num=123456789;
		int firstDigit=0;
		int lastDigit=0;
		lastDigit=num%10;
		System.out.println("Last Digit: "+lastDigit);
		while(num!=0)
		{
			firstDigit=num%10;
			num=num/10;
		}
		System.out.println("First Digit: "+firstDigit);
	}
}
