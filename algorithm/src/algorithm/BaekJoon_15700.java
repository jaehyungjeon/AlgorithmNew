package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : N×M 크기의 벽에 2×1, 1×2 크기의 타일을 채우려고 한다. 겹치지 않게 놓는다면, 최대 몇 개를 채울 수 있을까?

	input
	1 2

	output
	1

	Solution : 1. 몫을 구하면 되려나? 
*/

public class BaekJoon_15700 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long row = Long.parseLong(st.nextToken());
		Long col = Long.parseLong(st.nextToken());

		System.out.println((row * col) / 2);
	}
}