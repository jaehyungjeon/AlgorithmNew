package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 2 つの整数 A, B が与えられる．A+B, A-B の中で最大の値と最小の値を順に出力せよ．

	input
	-2 1

	output
	-1
	-3

	Solution : 1. 더하고 빼서 최대/최소로 나열
*/

public class BaekJoon_24075 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());

		Integer value1 = A + B;
		Integer value2 = A - B;
		System.out.println(Math.max(value1, value2));
		System.out.println(Math.min(value1, value2));
	}
}