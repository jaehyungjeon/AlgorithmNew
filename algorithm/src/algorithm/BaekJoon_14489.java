package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 슬프게도, 2017 선린 봄맞이 교내대회의 상품 비용은 욱제의 통장에서 충당된다. 욱제의 마음을 아는지 모르는지, 참가자들이 1등 상품으로 치킨을 무려 두 마리(...)나 달라고 조르고 있다.
	욱제에게는 두 개의 통장이 있다. 두 통장의 잔고와 치킨 한 마리의 가격이 주어질 때, 욱제가 치킨 두 마리(...)를 살 수 있는지 알아보자.

	input
	87 31
	20000

	output
	118

	Solution : 1. 이건 너무 쉬운 문제.. 
*/

public class BaekJoon_14489 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstNum = Integer.parseInt(st.nextToken());
		int secondNum = Integer.parseInt(st.nextToken());

		int chickenPrice = Integer.parseInt(br.readLine()) * 2;
		int totalPrice = firstNum + secondNum;
		if(totalPrice < chickenPrice) {
			System.out.println(totalPrice);
		} else {
			System.out.println(totalPrice - chickenPrice);
		}
	}
}