package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 자연수 A, B가 주어지면 A+B를 구하는 프로그램을 작성하시오.

	input
	37

	output
	10

	Solution : 1. 케이스별로 구분지으면 된다.
 */

public class BaekJoon_15873 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n % 10 == 0) {
			n /= 100;
			System.out.println(10 + n);
		} else {
			int a = n % 10;
			n /= 10;
			if (n == 10) {
				System.out.println(10 + a);
			} else {
				System.out.println(a + n);
			}
		}
	}
}