package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : When determining the age of a bull moose, the number of tines (sharp points), extending from the main antlers, can be used.
	An older bull moose tends to have more tines than a younger moose. However, just counting the number of tines can be misleading, as a moose can break off the tines,
	for example when fighting with other moose. Therefore, a point system is used when describing the antlers of a bull moose.

	The point system works like this: If the number of tines on the left side and the right side match, the moose is said to have the even sum of the number of points.
	So, “an even 6-point moose”, would have three tines on each side.
	If the moose has a different number of tines on the left and right side, the moose is said to have twice the highest number of tines, but it is odd.
	So “an odd 10-point moose” would have 5 tines on one side, and 4 or less tines on the other side.

	Can you figure out how many points a moose has, given the number of tines on the left and right side?

	input
	2 3

	output
	Odd 6

	Solution : 1. 조건에 따른 결과 도출 문제
 */

public class BaekJoon_15025 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());

		Integer maxValue = Math.max(A, B);
		Integer minValue = Math.min(A, B);
		
		if(maxValue.equals(0)) {
			System.out.println("Not a moose");
		} else if(maxValue.equals(minValue)) {
			System.out.println("Even " + (A+B));
		} else {
			System.out.println("Odd " + (maxValue*2));
		}
	}
}