package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : It is Greg’s birthday! To celebrate, his friend Sam invites Greg and two other friends for a small party. Of course, every birthday party must have cake.
	Sam ordered a square cake. She makes a single horizontal cut and a single vertical cut. In her excitement to eat cake, Sam forgot to make these cuts through the middle of the cake.
	Of course, the biggest piece of cake should go to Greg since it is his birthday. Help Sam determine the volume of the biggest piece of cake that resulted from these two cuts.

	input
	10 4 7

	output
	168

	Solution : 1. 단순 사칙연산 문제
 */

public class BaekJoon_17874 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int maxValue = Math.max(h, N - h) * Math.max(v, N - v);
		System.out.println(maxValue * 4);
	}
}