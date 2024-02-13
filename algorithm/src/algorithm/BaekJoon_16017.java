package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Here at the Concerned Citizens of Commerce (CCC), we have noted that telemarketers like to use seven-digit phone numbers where the last four digits have three properties.
	Looking just at the last four digits, these properties are:

	the first of these four digits is an 8 or 9;
	the last digit is an 8 or 9;
	the second and third digits are the same.
	For example, if the last four digits of the telephone number are 8229, 8338, or 9008, these are telemarketer numbers.

	Write a program to decide if a telephone number is a telemarketer number or not, based on the last four digits.
	If the number is not a telemarketer number, we should answer the phone, and otherwise, we should ignore it.

	input
	9
	6
	6
	8

	output
	ignore

	Solution : 1. 단순 조건 문제
*/

public class BaekJoon_16017 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[4];
		for(int i=0; i<4; i++) {
			arr[i] = br.readLine();
		}

		if((arr[0].equals("8") || arr[0].equals("9")) && (arr[3].equals("8") || arr[3].equals("9")) && (arr[1].equals(arr[2]))) {
			System.out.println("ignore");
		} else {
			System.out.println("answer");
		}
	}
}