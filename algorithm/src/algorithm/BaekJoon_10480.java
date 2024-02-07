package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Some numbers are just, well, odd. For example, the number 3 is odd, because it is not a multiple of two.
	Numbers that are a multiple of two are not odd, they are even. More precisely, if a number n can be expressed as n = 2 ∗ k for some integer k, then n is even. For example, 6 = 2 ∗ 3 is even.

	Some people get confused about whether numbers are odd or even. To see a common example, do an internet search for the query “is zero even or odd?” (Don’t search for this now! You have a problem to solve!)

	Write a program to help these confused people.

	input
	3
	10
	9
	-5

	output
	10 is even
	9 is odd
	-5 is odd

	Solution : 1. 절댓값을 이용하여 나머지가 홀수인지 짝수인지 가리는 문제.
 */

public class BaekJoon_10480 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			Integer num = Integer.parseInt(br.readLine());
			System.out.println(num + " is " + ((Math.abs(num)%2 == 1) ? "odd" : "even"));
		}
	}
}