package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 경북대학교의 마스코트이자 따봉 요정인 호반우는 오늘도 수업을 듣기 위해 경북대학교 정문을 지나치던 도중 정체불명의 차원문에 휘말려 이세계로 오게 되었다.
	이세계의 신인 당신이 호반우가 마왕을 물리치고 지구로 돌아가 학교에 지각하지 않도록 도와주자!
	호반우의 현재 스탯인 힘($STR$), 민첩($DEX$), 지능($INT$), 운($LUK$)에 해당하는 $4$가지 수가 주어진다.
 
	$4$가지 스탯 중 하나의 수치를 $1$씩 올릴 수 있는 축복을 여러 번 사용해 호반우의 평균 스탯 수치를 $N$ 이상으로 만들려고 할 때 최소 몇 번의 축복을 사용해야 하는지 구해보자.

	input
	4 5 1 2 4

	output
	4

	Solution : 1. N * 4 값을 sum에서 차감해준다.
*/

public class BaekJoon_30468 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = 0;
		for(int i=0; i<4; i++) {
			sum += Integer.parseInt(st.nextToken());
		}

		Integer N = Integer.parseInt(st.nextToken()) * 4;
		if(N > sum) {
			System.out.println(N - sum);
		} else {
			System.out.println(0);
		}
	}
}