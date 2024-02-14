package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : In one of the beautiful cities of Afghanistan two sisters are going to program a simple game to help them solve their mathematics homework.
	Their homework asks them to calculate the sum and multiplication of two numbers. Your task is to help them to build a simple program for their homework.

	input
	1
	2
	20 30
	40 60

	output
	50 600
	100 2400

	Solution : 1. 단순 사칙연산
*/

public class BaekJoon_18398 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			Integer count = Integer.parseInt(br.readLine());
			for(int j=0; j<count; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				Integer a = Integer.parseInt(st.nextToken());
				Integer b = Integer.parseInt(st.nextToken());
				System.out.println((a+b) + " " + (a*b));
			}
		}
	}
}
