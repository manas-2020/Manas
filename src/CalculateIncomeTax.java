import java.util.Scanner;

public class CalculateIncomeTax {
	final static double RATE1 = 0.10;
	final static double RATE2 = 0.20;
	final static double RATE3 = 0.30;
	static double annual_gradePay = 0;
	static double anuual_incometax = 0;
	static int age = 0;
	static String empCode;
	static String empName;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee code  = ");
		empCode = input.nextLine();
		System.out.print("Enter Employee Name  = ");
		empName = input.nextLine();
		System.out.print("Enter Employee Annual Grade Pay  = ");
		annual_gradePay = input.nextDouble();
		System.out.print("Enter Employee age  = ");
		age = input.nextInt();
		if (annual_gradePay >= 0 && annual_gradePay <= 250000) {
			anuual_incometax = 0;
			display();

		} else if (annual_gradePay >= 250000 && annual_gradePay <= 350000) {

			if (age > 65) {
				double temp = (annual_gradePay - 250000) * RATE1;
				double special_tax = temp * 0.05;
				anuual_incometax = temp - special_tax;
				display();

			} else {
				anuual_incometax = (annual_gradePay - 250000) * RATE1;
				display();

			}

		}

		else if (annual_gradePay >= 350000 && annual_gradePay <= 500000) {

			if (age > 65) {
				double temp = (annual_gradePay - 350000) * RATE2;
				double special_tax = temp * 0.05;
				anuual_incometax = temp - special_tax;
				display();

			} else {
				anuual_incometax = (annual_gradePay - 350000) * RATE2;
				display();

			}

		}

		else if (annual_gradePay > 500000) {

			if (age > 65) {
				double temp = (annual_gradePay - 500000) * RATE3;
				double special_tax = temp * 0.05;
				anuual_incometax = temp - special_tax;
				display();

			} else {

				double temp_tax = (annual_gradePay - 500000) * RATE3;
				double education_tax = temp_tax * 0.02;
				anuual_incometax = temp_tax + education_tax;
				display();

			}

		}

	}

	public static void display() {
		System.out.println("Details of The Employee ");
		System.out.println("Employee Code  :  " + empCode);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Annual Grade Pay " + annual_gradePay);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee Annual Income Tax : " + anuual_incometax);
	}

}
