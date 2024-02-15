package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : 3 つの整数 A, B, C が与えられる．これらのうち 2 番目に大きい数を出力せよ．

	input
	7 5 3

	output
	5

	Solution : 1. 중위수를 찾는 문제
			   2. 배열을 sort 시켜서 중간꺼 리턴해주면 편하다.
*/

public class BaekJoon_20976 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[3];

		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		System.out.println(arr[1]);
	}
}