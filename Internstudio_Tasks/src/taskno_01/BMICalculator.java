package taskno_01;

import java.util.Scanner;
import java.util.function.BinaryOperator;

/*
 * BMI Calculator Program
Develop a Java program that calculates Body Mass Index (BMI) based on user input for weight (in kilograms) and height (in meters). Implement logic to calculate BMI using the formula BMI = weight / (height * height). Display the calculated BMI along with a message indicating the user's BMI category (e.g., underweight, normal weight, overweight, obese).
 */

public class BMICalculator {

	public static void main(String[] args) {
		// Create a Scanner object to get user input
		Scanner sc = new Scanner(System.in);
		// BiFunction For Finding BMI
		BinaryOperator<Double> findBMI = (weight, height) -> weight / (height * height);

		System.out.print("Enter your weight in kilograms: ");
		double weight = sc.nextDouble();
		System.out.print("Enter your height in meters: ");
		double height = sc.nextDouble();

		double bmi = findBMI.apply(weight, height);
		System.out.printf("Your BMI is: %.2f%n", bmi);

		if (bmi < 18.5) {
			System.out.println("You are categorized as Underweight.");
		} else if (bmi >= 18.5 && bmi < 24.9) {
			System.out.println("You are categorized as Normal weight.");
		} else if (bmi >= 25 && bmi < 29.9) {
			System.out.println("You are categorized as Overweight.");
		} else {
			System.out.println("You are categorized as Obese.");
		}
		sc.close();

	}

}
