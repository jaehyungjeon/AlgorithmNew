package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : JOI 高校の生徒である葵と凛は，教師の理恵先生と一緒に 3 人で金平糖を同じ数だけ食べることにした．

	いま，葵は A 粒，凛は B 粒，理恵先生は C 粒の金平糖を食べた．3 人が食べた金平糖の個数を等しくするには，最小で合計いくつの金平糖を追加で食べる必要があるだろうか．

	3 人が食べた金平糖の個数 A, B, C が与えられたとき，追加で食べる金平糖の個数の最小値を求めるプログラムを作成せよ．

	input
	4 6 9

	output
	8

	Solution : 1. 최대 * 2 - 나머지 값의 합
*/

public class BaekJoon_22015 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] arr = new Integer[3];
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(2*arr[2] - arr[0] - arr[1]);
	}
}