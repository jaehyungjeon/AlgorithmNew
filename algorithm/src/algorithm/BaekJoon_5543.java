package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 상근날드에서 가장 잘 팔리는 메뉴는 세트 메뉴이다. 주문할 때, 자신이 원하는 햄버거와 음료를 하나씩 골라, 세트로 구매하면, 가격의 합계에서 50원을 뺀 가격이 세트 메뉴의 가격이 된다.
	햄버거는 총 3종류 상덕버거, 중덕버거, 하덕버거가 있고, 음료는 콜라와 사이다 두 종류가 있다.
	햄버거와 음료의 가격이 주어졌을 때, 가장 싼 세트 메뉴의 가격을 출력하는 프로그램을 작성하시오.

	input
	800
	700
	900
	198
	330

	output
	848

	Solution : 1. 1~3라인의 Min값 / 4~5라인의 Min값을 더한 후 50을 뺀다.  
*/

public class BaekJoon_5543 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer high = Integer.parseInt(br.readLine());
		Integer medi = Integer.parseInt(br.readLine());
		Integer low = Integer.parseInt(br.readLine());
		Integer cola = Integer.parseInt(br.readLine());
		Integer cider = Integer.parseInt(br.readLine());

		medi = Math.min(high, medi);
		low = Math.min(medi, low);
		cola = Math.min(cola, cider);

		System.out.println(low + cola - 50);
	}
}