package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Read two integer numbers R and C from the standard input and then print R lines with C asterisks (*) each.
	Example (R=3, C=5):
	*****
	*****
	*****

	Example (R=2, C=10):
	**********
	**********

	input
	3
	5

	output
	*****
	*****
	*****

	Solution : 1. 첫번째 줄 = row / 두번째 줄 = col 에 맞추어 StringBuilder로 구현하였음.
 */

public class BaekJoon_15232 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer row = Integer.parseInt(br.readLine());
		Integer col = Integer.parseInt(br.readLine());
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				sb.append("*");
			}
			if(i < row-1) {
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());
	}
}