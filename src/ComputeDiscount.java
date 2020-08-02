import java.util.Scanner;

public class ComputeDiscount {

	public static void main(String[] args) {

		double inputprice = 0;
		double discount = 0;
		char model;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter inputprice= ");
		inputprice = in.nextDouble();
		System.out.print("Enter Model = ");
		model = in.next().charAt(0);
		
		if (inputprice <= 100000) {
			if (model == 'p') {
				discount = inputprice * 0.05;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else if (model == 'd') {
				discount = inputprice * 0.02;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else {
				System.out.println("Invalid Choice");
			}

		}

		if (inputprice >= 100001 && inputprice <= 200000) {
			if (model == 'p') {
				discount = inputprice * 0.075;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else if (model == 'd') {
				discount = inputprice * 0.05;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else {
				System.out.println("Invalid Choice");
			}

		}

		if (inputprice >= 200001 && inputprice <= 300000) {
			if (model == 'p') {
				discount = inputprice * 0.09;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else if (model == 'd') {
				discount = inputprice * 0.065;
				System.out.println("Discount for this Model and Price  is " + discount);

			} else {
				System.out.println("Invalid Choice");
			}

			if (inputprice > 300000) {
				if (model == 'p') {
					discount = inputprice * 0.10;
					System.out.println("Discount for this Model and Price  is " + discount);

				} else if (model == 'd') {
					discount = inputprice * 0.075;
					System.out.println("Discount for this Model and Price  is " + discount);

				} else {
					System.out.println("Invalid Choice");
				}

			}
		}

	}
}