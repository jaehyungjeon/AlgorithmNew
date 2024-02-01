package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Many communities now have “radar” signs that tell drivers what their speed is, in the hope that they will slow down.

	You will output a message for a “radar” sign. The message will display information to a driver based on his/her speed according to the following table:

	input
	100
	131

	output
	You are speeding and your fine is $500.

	Solution : 1. 
*/

public class BaekJoon_6763 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer maxValue = Integer.parseInt(br.readLine());
		Integer value = Integer.parseInt(br.readLine());

		Integer speed = maxValue - value;
		if(speed >= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		} else {
			speed = Math.abs(speed);
			if(speed >= 31) {
				System.out.println("You are speeding and your fine is $500.");
			} else if(speed >= 21) {
				System.out.println("You are speeding and your fine is $270.");
			} else {
				System.out.println("You are speeding and your fine is $100.");
			}
		}
	}
}