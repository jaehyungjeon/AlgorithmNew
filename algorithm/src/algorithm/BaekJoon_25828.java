package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Testing for Corona can be done individually, e.g., 100 people require 100 test kits.
	Alternatively, the test can be done in groups (pools), e.g.,100 people can be divided into five group of 20 people each and then using only one test kid per group.
	If one or more groups test positive, then individual tests are needed for each person in those group.
	So, for our example, five groups will need 5 test kits and let’s say two groups test positive, so we would need additional 40 (2*20) test kits for a total of 45 (5+40) test kits.

	Given the data for the two possible testing approaches, determine which approach will use fewer test kits.

	input
	40 3 38

	output
	1

	Solution : 1. 단순한 케이스 문제
 */

public class BaekJoon_25828 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer g = Integer.parseInt(st.nextToken());
		Integer p = Integer.parseInt(st.nextToken());
		Integer t = Integer.parseInt(st.nextToken());

		if (g * p < g + p * t) {
			System.out.println(1);
		} else if (g * p > g + p * t) {
			System.out.println(2);
		} else {
			System.out.println(0);
		}
	}
}