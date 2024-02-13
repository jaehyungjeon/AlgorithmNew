package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : A congruent number is an integer that is the area of some right triangle where the length of each side of the triangle is a rational number.
	For this problem, we’ll only consider the legs of the right triangle, and not the hypotenuse.
	A rational number is a fraction, p/q, where p, the numerator, and q, the denominator, are integers. Note that if q = 1, then p/1 is an integer, so any integer is a rational number.
	Given two rational numbers which are the non-hypotenuse legs of a right triangle, determine if the area of that triangle is a congruent number.
	For the purposes of this problem, it is not necessary for the length of the hypotenuse to be a rational number.

	input
	3 1 4 1

	output
	1

	Solution : 1. 어쩌다보니 좀 복잡하게 구해졌음..
 */

public class BaekJoon_15128 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().replaceAll(":", ""));
		Double[] arr = new Double[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}

		if((((arr[0] * arr[2]) / (arr[1] * arr[3])) / 2) * 10 % 10 != 0.0) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}