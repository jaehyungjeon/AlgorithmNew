package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : JOI 君は情報の試験を 3 回受けた．試験の点数はすべて 0 以上 100 以下の整数である．
	JOI 君の成績は 3 回の試験の点数のうち高い方から 2 つを足し合わせた合計によって決まる．
	3 回の試験の点数 A, B, C が与えられたとき，3 回の試験の点数のうち高い方から 2 つを足し合わせた合計を出力するプログラムを作成せよ．

	input
	70 80 90

	output
	170

	Solution : 1. 최대 2개의 합을 구한다.
*/

public class BaekJoon_18411 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = 0;
		Integer minValue = Integer.MAX_VALUE;
		for(int i=0; i<3; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			sum += num;
			minValue = Math.min(minValue, num);
		}

		System.out.println(sum - minValue);
	}
}
