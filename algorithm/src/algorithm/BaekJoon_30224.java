package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
	Question : Fact or Fiction, some people consider 7 to be a lucky digit/number.

	Given a number, determine how lucky the number is by printing one of four values:

	Print 0 if the number does not contain 7 and is not divisible by 7.
	Print 1 if the number does not contain 7 but is divisible by 7.
	Print 2 if the number does contain 7 but is not divisible by 7.
	Print 3 if the number does contain 7 and is divisible by 7.

	input
	25

	output
	0

	Solution : 1. Case 별로 분리해주기만 하면 끝.
*/

public class BaekJoon_30224 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		Integer num = Integer.parseInt(numStr);
		if(!numStr.contains("7")) {
			if(num%7 != 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		} else {
			if(num%7 != 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}
}
