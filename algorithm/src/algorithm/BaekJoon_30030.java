package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 스위트콘의 가격은 $A$원이다. 
	$A$는 $100$의 배수이다. 그런데, 스위트콘에 부가가치세 $10\%$를 포함하니 가격이 $B$원이 되었다.

	부가가치세를 포함한 가격 $B$가 주어질 때, 이를 제외한 가격 $A$를 구해보자.

	input
	1100

	output
	1000

	Solution : 1. (A / 11) * 10
*/

public class BaekJoon_30030 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer A = Integer.parseInt(br.readLine());
		System.out.println((A / 11) * 10);
	}
}
