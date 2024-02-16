package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : When one looks at a set of numbers, one usually wonders if there is a relationship among them? This task is more manageable if there are only three numbers.

	Given three distinct positive integers, you are to determine how one can be computed using the other two.
	Print 1 if any of the three numbers is the sum of the other two numbers, print 2 if any of the three numbers is the product of the other two numbers, print 3 otherwise.
	Assume that exactly one of these three messages will apply.

	input
	10 30 20

	output
	1

	Solution : 1. 단순 케이스 문제
 */

public class BaekJoon_25784 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[3];

		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		if(arr[2].equals(arr[0] + arr[1])) {
			System.out.println("1");
		} else if(arr[2].equals(arr[0] * arr[1])) {
			System.out.println("2");
		} else {
			System.out.println("3");
		}
	}
}