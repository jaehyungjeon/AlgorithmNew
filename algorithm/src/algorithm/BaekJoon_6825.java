package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The Body Mass Index (BMI) is one of the calculations used by doctors to assess an adult’s health. The doctor measures the patient’s height (in metres) and weight (in kilograms), then calculates the BMI using the formula

	BMI = weight/(height × height).

	Write a program which prompts for the patient’s height and weight, calculates the BMI, and displays the corresponding message from the table below.

	BMI Category	Message
	More than 25	Overweight
	Between 18.5 and 25.0 (inclusive)	Normal weight
	Less than 18.5	Underweight

	input
	69
	1.73

	output
	Normal weight

	Solution : 1. Double로 받아서 소숫점자리까지 계산하였다. 
*/

public class BaekJoon_6825 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double weight = Double.parseDouble(br.readLine());
		Double height = Double.parseDouble(br.readLine());

		Double BMI = weight / (height * height);
		if(BMI >= 25) {
			System.out.println("Overweight");
		} else if(BMI >= 18.5) {
			System.out.println("Normal weight");
		} else {
			System.out.println("Underweight");
		}
	}
}