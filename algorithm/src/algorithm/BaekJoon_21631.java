package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Dima is bored of playing checkers with himself. Since there is nothing but checker pieces to play with, he came up with the following game.

	Each piece he has is either white or black. Dima builds a tower by stacking his pieces on top of each other in some order.
	A black stripe is a sequence of adjacent black pieces, with either a white piece, or the end of the tower at the bottom and top of it.
	In other words, two adjacent black pieces always belong to the same black stripe. The goal of the game is to get the maximum number of black stripes in the tower.

	The game has just started. Dima has $a$ white and $b$ black pieces. What is the maximum number of black stripes he can get in his tower?

	input
	5 2

	output
	2

	Solution : 1. 입력 MAX 조건을 생각하여 Long으로 파싱한다.
*/

public class BaekJoon_21631 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long A = Long.parseLong(st.nextToken());
		Long B = Long.parseLong(st.nextToken());

		if(A >= B) {
			System.out.println(B);
		} else {
			System.out.println(A+1);
		}
	}
}