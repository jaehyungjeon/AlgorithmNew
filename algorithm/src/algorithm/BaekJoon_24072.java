package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : ビーバーのビ太郎は帰省することにした．今日から A 日後の午前に実家に着き，今日から B 日後の午前に実家を去る．それを聞きつけたビーバーのビバ子は，今日から C 日後の午後にビ太郎の実家を訪れることにした．ビバ子がビ太郎に会えるか判定せよ．

	input
	2 5 3

	output
	1

	Solution : 1. 단순한 조건 문제
*/

public class BaekJoon_24072 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());
		Integer C = Integer.parseInt(st.nextToken());
		System.out.println(C < A || B <= C ? 0 : 1);
	}
}