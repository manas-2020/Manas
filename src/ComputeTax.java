import java.util.Scanner;

public class ComputeTax {
	public static void main(String[] args) {
		final double RATE1 = 0.10;
		final double RATE2 = 0.20;
		final double RATE3 = 0.30;
		double annualincome = 0;
		double incometax = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Annual salary = ");
		annualincome = in.nextDouble();
		
		if (annualincome >= 0 && annualincome <= 50000) {
			incometax = 0;
			System.out.println("There is No Income Tax up to 50000 " + incometax);
		}

		else if (annualincome >= 50000 && annualincome <= 60000) {
			incometax = (annualincome - 50000) * RATE1;
			System.out.println("Income Tax for above 50000 to 60000 is " + incometax);
		}

		else if (annualincome >= 60000 && annualincome <= 150000) {
			incometax = 1000 + (annualincome - 60000) * RATE2;
			System.out.println("Income Tax for above 60000 to 150000 is " + incometax);
		}

		else if (annualincome >= 150000) {
			incometax = 19000 + (annualincome - 150000) * RATE3;
			System.out.println("Income Tax for above  150000 is " + incometax);
		}

	}
}