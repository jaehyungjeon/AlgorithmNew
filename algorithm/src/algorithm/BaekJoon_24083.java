package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : JOI 高校の生徒である葵はアナログ時計を手に入れた．この時計には外周に沿って 12 個の目盛りがあり，時計回りに 1 から 12 までの番号が順に付けられている．
	この時計の短針は時計回りに回っており，1 時間で目盛り 1 つ分進む．
	たった今，短針がある目盛りを指した．この目盛りの番号は A である．
	この状態からちょうど B 時間が経過したときに短針が指す目盛りの番号を出力せよ．

	input
	9
	5

	output
	2

	Solution : 1. 12로 나눴을때 나머지가 없으면 시침이 12를 가리켜야 함.
*/

public class BaekJoon_24083 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer A = Integer.parseInt(br.readLine());
		Integer B = Integer.parseInt(br.readLine());

		if((A+B) % 12 == 0) {
			System.out.println(12);
		} else {
			System.out.println((A+B) % 12);
		}
	}
}
