package kirksey_p2;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	int BMIselector;
	double weight, height, BMIvalue;
	
	//Asks the user which type of units they want to use
	System.out.print("Please enter 0 if you would like to use metric units or enter 1 for imperial units: ");
	BMIselector = scnr.nextInt();
	
	//asks the user for weight and height if the user selected metric units
	if(BMIselector == 0) {
		System.out.println("\nPlease enter your weight in kilograms: ");
		weight = scnr.nextDouble();
		System.out.println("Please enter your height in meters: ");
		height = scnr.nextDouble();
	}

	//asks the user for weight and height if the user selected imperial units
	else {
		System.out.println("\nPlease enter your weight in pounds: ");
		weight = scnr.nextDouble();
		System.out.println("Please enter your height in inches: ");
		height = scnr.nextDouble();
	}
	
	//BMI calculation for metric units
	BMIvalue = weight / (height * height);
	
	//Changes BMI calculation for imperial units
	if(BMIselector == 1) {
		BMIvalue *= 703;
	}
	
	//Printing the results and the BMI categories
	System.out.printf("Your BMI value is: %.1f\n\n", BMIvalue);
	System.out.println("Below are the BMI categories:");
	System.out.println("Underweight: less than 18.5 BMI");
	System.out.println("Normal weight: 18.5 - 24.9 BMI");
	System.out.println("Overweight: 25 - 29.9 BMI");
	System.out.println("Obesity: 30.0 BMI or greater");
	}

}
