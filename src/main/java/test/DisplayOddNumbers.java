package test;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		System.out.println("The odd numbers are:");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
