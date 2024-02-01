package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : You know a family with three children. Their ages form an arithmetic sequence: 
	the difference in ages between the middle child and youngest child is the same as the difference in ages between the oldest child and the middle child. 
	For example, their ages could be 5, 10 and 15, since both adjacent pairs have a difference of 5 years.

	Given the ages of the youngest and middle children, what is the age of the oldest child?

	input
	12
	15

	output
	18

	Solution : 1. 두 수중 Max값 + (Max-Min)
*/

public class BaekJoon_6749 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer age1 = Integer.parseInt(br.readLine());
		Integer age2 = Integer.parseInt(br.readLine());
		Integer maxAge = Math.max(age1, age2);
		Integer diffAge = maxAge - Math.min(age1, age2);

		System.out.println(maxAge + diffAge);
	}
}