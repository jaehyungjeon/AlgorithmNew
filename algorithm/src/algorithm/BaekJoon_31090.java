package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 백준 온라인 저지의 송년대회 Good Bye, BOJ 2023!의 개최일은 2023년 12월 31일이다. 키파는 대회가 개최된다는 사실이 기뻐 2023과 2024를 뚫어져라 보다가 무언가 특별하다는 사실을 깨달았다.
	그렇다. 내년의 연도인 2024가 올해 연도의 끝 두 자리인 23으로 나누어 떨어진다! 다음에도 이런 연도가 오려면 6년 뒤인 2029/2030년이 되어야 한다.
	양의 정수 $N$이 주어진다. $N$년과 $N+1$년이 이러한 조건을 만족하는 관계인지 판별하는 프로그램을 작성하라.

	input
	3
	2023
	2024
	2029

	output
	Good
	Bye
	Good

	Solution : 1. substring을 이용하면 된다.
*/

public class BaekJoon_31090 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		for(int i=0; i<count; i++) {
			String str = br.readLine();
			Integer year = Integer.parseInt(str);
			Integer year2 = Integer.parseInt(str.substring(2, 4));
			if((year+1) % year2 == 0) {
				System.out.println("Good");
			} else {
				System.out.println("Bye");
			}
		}
	}
}