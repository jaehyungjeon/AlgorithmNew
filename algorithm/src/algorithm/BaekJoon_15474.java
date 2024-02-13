package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : JOI 君は鉛筆を N 本買うために近くの文房具店に行くことにした．
	文房具店では鉛筆が一定の本数ずつのセットで売られている．セット X は A 本で B 円，セット Y は C 本で D 円である．
	JOI 君はセット X かセット Y の一方を選び，選んだセットをいくつか購入する．両方のセットを購入することはできない．N 本以上の鉛筆を得るために必要な金額の最小値を求めよ．

	input
	10 3 100 5 180

	output
	360

	Solution : 1. 단순한 계산. Double로 선언한 뒤 Math.ceil을 이용해 최소보다 작을 경우 하나 더 추가구매하는 로직을 구현한다.
*/

public class BaekJoon_15474 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer N = Integer.parseInt(st.nextToken());
		Integer first = (int) Math.ceil(N / Double.parseDouble(st.nextToken()));
		Integer firstValue = Integer.parseInt(st.nextToken());

		Integer second = (int) Math.ceil(N / Double.parseDouble(st.nextToken()));
		Integer secValue = Integer.parseInt(st.nextToken());
		System.out.println(Math.min(first*firstValue, second*secValue));
	}
}