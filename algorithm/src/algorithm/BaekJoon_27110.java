package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 설날을 맞아 부대원들을 위해 특식으로 치킨을 주문했다. 후라이드 치킨, 간장치킨, 양념치킨을 각각 
	$N$마리씩 주문했고, $1$인당 치킨을 한 마리씩 배부하고자 한다.

	최대한 많은 부대원에게 본인이 선호하는 종류의 치킨을 배부해주기 위해 으뜸병사는 부대원들의 치킨 종류 선호도를 조사했고, 세 가지 치킨 중 후라이드 치킨, 간장치킨, 양념치킨을 가장 선호하는 인원의 수는 각각 
	$A$명, $B$명, $C$명이라는 것을 알아냈다. 이때, 모든 부대원은 각자 한 종류의 치킨만 골라 답했다.

	본인이 가장 선호하는 종류의 치킨을 받을 수 있는 인원수의 최댓값을 구하여라.

	input
	5
	1 7 6

	output
	11

	Solution : 1. 
 */

public class BaekJoon_27110 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer maxValue = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = 0;
		for(int i=0; i<3; i++){
			Integer want = Integer.parseInt(st.nextToken());
			if(want > maxValue) {
				want = maxValue;
			}
			sum += want;
		}

		System.out.println(sum);
	}
}