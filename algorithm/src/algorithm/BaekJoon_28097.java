package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 모두가 알다시피, 포닉스는 포스텍을 대표하는 모범생이다! 포닉스는 최고의 모범생답게 남들과는 다른 공부 계획표를 가지고 있다.
	포닉스는 총 $N$개의 공부 계획을 가지고 있다. $i$번째 공부 계획을 실행하는 데에는 $T_i$시간이 소모된다. 포닉스는 각 계획을 순서대로 시행하며, 각 계획 사이에는 $8$시간만큼의 휴식을 취한다.
	$N$개의 공부 계획을 모두 마친 포닉스는 지금의 시간이 첫 번째 공부 계획을 시작한 시간으로부터 얼마나 지났는지 궁금해졌다. 포닉스가 마지막 공부를 마칠 때까지 걸린 총 시간이 며칠 몇 시간인지 구해 보자.
	$1$일은 $24$시간이다.

	input
	2
	12 12

	output
	1 8

	Solution : 1. 단순 계산문제 
 */

public class BaekJoon_28097 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = (N-1) * 8;
		for(int i=0; i<N; i++) {
			Integer T = Integer.parseInt(st.nextToken());
			sum += T;
		}

		System.out.println(sum/24 + " " + sum%24);
	}
}