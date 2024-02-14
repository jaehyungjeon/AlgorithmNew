package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Barley the dog loves treats. At the end of the day he is either happy or sad depending on the number and size of treats he receives throughout the day.
	The treats come in three sizes: small, medium, and large. His happiness score can be measured using the following formula:
	1 × S + 2 × M + 3 × L
	where S is the number of small treats, M is the number of medium treats and L is the number of large treats.
	If Barley’s happiness score is 10 or greater then he is happy. Otherwise, he is sad. Determine whether Barley is happy or sad at the end of the day.

	input
	3
	1
	0

	output
	sad

	Solution : 1. 합계 계산 문제
*/

public class BaekJoon_19602 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer S = Integer.parseInt(br.readLine());
		Integer M = Integer.parseInt(br.readLine());
		Integer L = Integer.parseInt(br.readLine());
		Integer sum = (1 * S) + (2 * M) + (3 * L);
		if (sum >= 10) {
			System.out.println("happy");
		} else {
			System.out.println("sad");
		}
	}
}