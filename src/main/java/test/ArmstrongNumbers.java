package test;

public class ArmstrongNumbers {

	public static void main(String[] args) {

		int arg = 1000, temp, power, rem;

		for (int i = 0; i < arg; i++) {
			power = 0;
			temp = i;
			while (temp != 0) {
				power++;
				temp = temp / 10;
			}

			temp = i;
			double sum = 0;
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + Math.pow(rem, power);
				temp = temp / 10;
			}

			if (sum == i) {
				System.out.println(i + " is ArmstrongNumbers in the given range");
			}
		}
	}

}
