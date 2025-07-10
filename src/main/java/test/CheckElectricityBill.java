package test;

public class CheckElectricityBill {

	public static void main(String[] args) {
		int billUnit = 200;
		int bill;

		if (billUnit > 100) {
			if (billUnit >= 200) {
				if (billUnit > 300) {
					bill = billUnit * 6;
				} else
					bill = billUnit * 7;
			} else
				bill = billUnit * 8;
		} else
			bill = billUnit * 9;

		System.out.println("The billUnit is "+billUnit +" and bill is :" + bill);
	}
}
