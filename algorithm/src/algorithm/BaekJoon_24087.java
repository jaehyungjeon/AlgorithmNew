package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : JOI アイスクリーム店は，非常に高さのあるアイスクリームタワーが名物のアイスクリーム店である．アイスクリームタワーとは，ベースとなるアイスクリームの上に，追加のアイスクリームを 0 個以上積み重ねたものである．
	ベースとなるアイスクリームの金額は 250 円で，高さは A cm である．追加のアイスクリームは 1 個につき 100 円で，1 個追加するごとにアイスクリームタワーの高さが B cm 増える．
	あなたは，この店で高さが S cm 以上のアイスクリームタワーを買いたい．高さが S cm 以上のアイスクリームタワーを買うために必要な金額の最小値を求めよ．

	input
	28
	20
	5

	output
	450

	Solution : 1. 
*/

public class BaekJoon_24087 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double S = Double.parseDouble(br.readLine());
		Double A = Double.parseDouble(br.readLine());
		Double B = Double.parseDouble(br.readLine());

		if(S < A) {
			System.out.println(250);
		} else {
			S -= A;
			Integer height = (int)Math.ceil(S/B);
			System.out.println(250 + (height*100));
		}
	}
}
