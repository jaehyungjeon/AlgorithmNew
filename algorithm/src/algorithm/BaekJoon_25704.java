package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 쇼핑몰에서 30일간 출석 이벤트를 진행한다. 쇼핑몰의 사이트를 방문하면 1일 1회 출석 도장을 받을 수 있고, 출석 도장을 여러 개 모아서 할인 쿠폰으로 교환할 수 있다.

	출석 도장의 개수에 따라 교환할 수 있는 할인 쿠폰의 종류가 달라진다.

	출석 도장 5개   → 500원 할인 쿠폰
	출석 도장 10개 → 10% 할인 쿠폰
	출석 도장 15개 → 2,000원 할인 쿠폰
	출석 도장 20개 → 25% 할인 쿠폰
	경태가 모은 출석 도장의 개수와 구매할 물건의 가격이 주어졌을 때, 경태가 지불해야 하는 최소 금액을 구하시오. 단, 할인 쿠폰은 최대 하나만 적용 가능하다. 할인 금액이 물건의 가격보다 더 큰 경우 지불해야 하는 금액은 0원이다.

	input
	12
	50000

	output
	45000

	Solution : 1. 실수를 좀 해서 여러번 틀림..ㅎㅎ
			   2. 마지막에 cost - sale한 값이 음수가 나올 경우가 있기 때문에 0보다 작을 경우는 0으로 리턴하도록 해주어야 한다.
 */

public class BaekJoon_25704 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer stamp = Integer.parseInt(br.readLine());
		Integer cost = Integer.parseInt(br.readLine());

		Integer sale = 0;
		if(stamp >= 5) {
			sale = Math.max(sale, 500);
		}

		if(stamp >= 10) {
			sale = Math.max(sale, cost/10);
		}

		if(stamp >= 15) {
			sale = Math.max(sale, 2000);
		}

		if(stamp >= 20) {
			sale = Math.max(sale, cost/4);
		}

		if(cost - sale < 0) {
			System.out.println(0);
		} else {
			System.out.println(cost - sale);
		}
	}
}