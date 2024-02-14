package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 整数 X, L, R が与えられる. L 以上 R 以下の整数のうち，X との差の絶対値が最も小さいものを出力せよ．そのような整数はちょうど 1 つだけ存在することが証明できる．

	input
	8 3 6

	output
	6

	Solution : 1. 중간수를 찾는다.
*/

public class BaekJoon_18414 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = 0;
		Integer maxValue = Integer.MIN_VALUE;
		Integer minValue = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			sum += num;
			maxValue = Math.max(maxValue, num);
			minValue = Math.min(minValue, num);
		}

		System.out.println(sum - (minValue + maxValue));
	}
}
