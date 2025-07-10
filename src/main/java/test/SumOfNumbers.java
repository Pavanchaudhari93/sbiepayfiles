package test;

public class SumOfNumbers {

	public static void main(String[] args) {

		int sum = 0;
		int num = 10;

		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Total sum of n numbers is :" + sum);
	}

}
