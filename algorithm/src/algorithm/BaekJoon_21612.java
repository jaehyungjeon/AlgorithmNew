package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : At sea level, atmospheric pressure is 100 kPa and water begins to boil at 100◦C. As you go above sea level, atmospheric pressure decreases, and water boils at lower temperatures.
	As you go below sea level, atmospheric pressure increases, and water boils at higher temperatures. A formula relating atmospheric pressure to the temperature at which water begins to boil is

	P = 5 × B − 400

	where P is atmospheric pressure measured in kPa, and B is the temperature at which water begins to boil measured in ◦C.
	Given the temperature at which water begins to boil, determine atmospheric pressure. Also determine if you are below sea level, at sea level, or above sea level.
	Note that the science of this problem is generally correct but the values of 100◦C and 100 kPa are approximate and the formula
	is a simplification of the exact relationship between water’s boiling point andatmospheric pressure.

	input
	99

	output
	95
	1

	Solution : 1. B와 P를 비교하는 문제
*/

public class BaekJoon_21612 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer B = Integer.parseInt(br.readLine());
		Integer P = (5*B) - 400;

		System.out.println(P);
		if(P > B) {
			System.out.println("-1");
		} else if(P.equals(B)) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}
	}
}