package corejava;
import java.util.Scanner;
/**
* Create the EMI Calculator.
* 
* @author Diya
**/
public class EMICalculator {

	public static void main(String[] args) {
		Scanner calculator = new Scanner(System.in);
		// Declare the Principal,rate,time,EMI for the calculator.
		double principal;
		double rate;
		double time;
		double emi;
		System.out.println("Enter the Principal:");
		principal = calculator.nextDouble();
		System.out.println("Enter the rate:");
		rate = calculator.nextDouble();
		System.out.println("Enter your time in year:");
		time = calculator.nextDouble();
		rate = rate/(12*100);
		time = time*12;
		// EMI Formula.
		emi = (principal * rate * Math.pow(1+rate,time)) / (Math.pow(1+rate,time) - 1);
		System.out.println("Your monthly EMI is = " + emi);
		calculator.close();
	}

}