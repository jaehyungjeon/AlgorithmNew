package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : JOI는 물리, 화학, 생물, 지구과학, 역사, 지리 총 6 과목의 시험을 봤다. 각 시험의 만점은 100점이다.
	JOI는 물리, 화학, 생물, 지구과학 4과목 중에서 3 과목을 선택하고 역사, 지리 2 과목 중에서 한 과목을 선택한다.
	시험 점수의 합이 가장 높게 나오도록 과목을 선택할 때, JOI가 선택한 과목의 시험 점수의 합을 구하시오.

	input
	100
	34
	76
	42
	10
	0

	output
	228

	Solution : 1. 합산을 계속하면서 최솟값을 갱신해준 뒤, 합산에서 차감한다.
			   2. 1~4 / 5~6 분리하여 동일하게 반복한 후에 합산했던 두 값을 재합산한다.
*/

public class BaekJoon_11948 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int EMinValue = Integer.MAX_VALUE;
		int ESum = 0;
		int SMinValue = Integer.MAX_VALUE;
		int SSum= 0;
		for(int i=0; i<4; i++) {
			int value = Integer.parseInt(br.readLine());
			ESum += value;
			EMinValue = Math.min(EMinValue, value);
		}

		for(int i=0; i<2; i++) {
			int value = Integer.parseInt(br.readLine());
			SSum += value;
			SMinValue = Math.min(SMinValue, value);
		}

		System.out.println((ESum - EMinValue) + (SSum - SMinValue));
	}
}