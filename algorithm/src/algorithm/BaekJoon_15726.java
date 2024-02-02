package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 다음과 같이 세 수가 연속해서 주어졌을 때 한 번의 곱셈 기호와 한 번의 나눗셈 기호를 이용하여 만든 식 중 가장 큰 값을 출력하는 프로그램을 작성하시오. (세 수의 순서는 변하지 않는다.)

	input
	32 16 8

	output
	64

	Solution : 1. 곱 나누기 / 나누기 곱의 값을 구한다.
			   2. 받는 인자는 double로 하여 큰 값을 입력받을 수 있도록 한다.
*/

public class BaekJoon_15726 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());

		if(((A * B) / C) > ((A / B) * C)) {
			System.out.println((int) ((A * B) / C));
		} else {
			System.out.println((int) ((A / B) * C));
		}
	}
}