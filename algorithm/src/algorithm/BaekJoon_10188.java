package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : A quadrilateral is a 4-sided figure. For this program, print out a 4 sided figure using the capital letter X. The largest side will be 20, and the smallest side will be 1.

	input
	3
	2 3
	5 1
	20 8

	output
	XX
	XX
	XX

	XXXXX

	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX
	XXXXXXXXXXXXXXXXXXXX

	Solution : 1. row / col에 대한 수칙 표시 
 */

public class BaekJoon_10188 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());

			for(int j=0; j<b; j++) {
				for(int k=0; k<a; k++) {
					sb.append("X");
				}
				sb.append("\n");
			}

			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}