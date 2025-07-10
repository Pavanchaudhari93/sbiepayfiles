package test;

public class DigitSum {

	public static void main(String[] args) {

		int num = 12345678;
		int sum = 0;
		int rem = num;
		
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("Sum of all digits is :" + sum);
	}

}
