package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The International Standard Book Number (ISBN) is a 13-digit code for identifying books. These numbers have a special property for detecting whether the number was written correctly.
	The 1-3-sum of a 13-digit number is calculated by multiplying the digits alternately by 1’s and 3’s (see example) and then adding the results. For example, to compute the 1-3-sum of the number 9780921418948 we add
	9 ∗ 1 + 7 ∗ 3 + 8 ∗ 1 + 0 ∗ 3 + 9 ∗ 1 + 2 ∗ 3 + 1 ∗ 1 + 4 ∗ 3 + 1 ∗ 1 + 8 ∗ 3 + 9 ∗ 1 + 4 ∗ 3 + 8 ∗ 1 to get 120.
	The special property of an ISBN number is that its 1-3-sum is always a multiple of 10.
	Write a program to compute the 1-3-sum of a 13-digit number. 
	To reduce the amount of typing, you may assume that the first ten digits will always be 9780921418, like the example above. 
	Your program should input the last three digits and then print its 1-3-sum. Use a format similar to the samples below.

	input
	9
	4
	8

	output
	The 1-3-sum is 120

	Solution : 1. 이전값 + 나머지 3개의 1, 3 곱 값의 합산
 */

public class BaekJoon_6810 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer a = Integer.parseInt(br.readLine());
		Integer b = Integer.parseInt(br.readLine());
		Integer c = Integer.parseInt(br.readLine());
		System.out.print("The 1-3-sum is " + (91 + a*1 + b*3 + c*1));
	}
}
