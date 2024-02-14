package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 3 つの整数 A, B, C が与えられる．A, B, C はそれぞれ 1 または 2 である．1 と 2 のうち，どちらが多くあるか．

	input
	1 2 1

	output
	1

	Solution : 1. 단순 수찾기 문제
*/

public class BaekJoon_18408 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer oneCount = 0;
		Integer twoCount = 0;
		for(int i=0; i<3; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			if(num.equals(1)) {
				oneCount++;
			} else if(num.equals(2)) {
				twoCount++;
			}
		}

		if(oneCount > twoCount) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}
}
