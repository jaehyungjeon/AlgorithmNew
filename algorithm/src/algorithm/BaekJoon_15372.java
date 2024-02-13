package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Given a positive integer N, what is the minimum positive integer K such that K is a multiple of the square of N?
	Note that a is a multiple of b if a = b · k for some integer k.

	input
	1
	1

	output
	1

	Solution : 1. 단위가 넘어갈 수 있으므로 Integer -> Long으로 사용
 */

public class BaekJoon_15372 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long t = Long.parseLong(br.readLine());
		for(int i=0; i<t; i++) {
			Long t1 = Long.parseLong(br.readLine());
			System.out.println((long) Math.pow(t1, 2));
		}
	}
}