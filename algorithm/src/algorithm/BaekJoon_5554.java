package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 승균이는 매일 학교, PC방, 학원에 다닌다. 반복되는 일상에 익숙해진 승균이는 이동시간을 단축해서 PC방에 더 오래 머물고 싶었다. 그래서 스톱워치를 들고 이동할 때마다 기록을 잰 후 집에 가서 분석해보기로 했다.
	집에 도착한 승균이는 측정한 결과를 보는 데, 전부 초 단위로 기록되어있다! 맨날 놀기만 해서 총 이동 시간이 몇 분 몇 초인지 계산을 못 하는 승균이를 도와주자.
	하루 동안 측정한 결과가 주어지면, 이날의 총 이동 시간이 몇 분 몇 초인지 출력하는 프로그램을 작성하시오.

	input
	31
	34
	7
	151

	output
	3
	43

	Solution : 1. 값을 다 더한 후 60으로 나눈 몫 = 분 / 나머지 = 초  
*/

public class BaekJoon_5554 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer sum = 0;
		for(int i=0; i<4; i++) {
			sum += Integer.parseInt(br.readLine());
		}

		System.out.println(sum/60);
		System.out.println(sum%60);
	}
}