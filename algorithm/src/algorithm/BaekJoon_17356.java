package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 오늘은 운명의 라이벌 권욱과 권제가 숙명의 대결을 펼치는 날이다. 대결 종목은 바로 2019년 천하제일 코딩대회 본선 문제 중 하나인 "욱 제"를 더 빨리 푸는 것이다.
	욱과 제는 "욱 제"를 빨리 푸는 능력, 일명 "욱제력"을 가지고 있다. 이 욱제력은 하나의 정수로 수치화할 수 있다. 욱의 욱제력이 A, 제의 욱제력이 B일 때, M을 
	$\frac{B-A}{400}$이라고 하자. 이때 욱이 제를 이길 확률은 
	$\frac{1}{1+10^M}$이다. 이 값은 얼마일까?

	input
	2000 1800

	output
	0.7597469266479578

	Solution : 1. Double로 구현하여 소숫점 자리까지 계산할 수 있도록 구현.
 */

public class BaekJoon_17356 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());

		Double M = (B-A) / 400;
		System.out.println(1/(1+Math.pow(10, M)));
	}
}