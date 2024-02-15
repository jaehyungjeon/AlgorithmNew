package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : A 地点から B 地点に移動するのに X 時間，B 地点から C 地点に移動するのに Y 時間かかる．
	A 地点から B 地点を経由して C 地点に移動するとき，Z 時間 30 分以内に移動することができるか判定せよ．

	input
	2
	3
	4

	output
	0

	Solution : 1. 분 기준으로 세팅하였다.
*/

public class BaekJoon_24079 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer X = Integer.parseInt(br.readLine());
		Integer Y = Integer.parseInt(br.readLine());
		Integer Z = Integer.parseInt(br.readLine());

		Integer value = (X + Y) * 60;
		Integer zValue = Z * 60 + 30;
		if (value < zValue) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}