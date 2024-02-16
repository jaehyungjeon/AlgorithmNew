package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 트라이애슬론(Triathlon)이란 라틴어에서 $3$가지라는 의미를 가진 tri와 경기를 뜻하는 athlon의 합성어이다. 우리나라에서는 트라이애슬론 대신 철인 3종 경기로 알려져 있다.
	트라이애슬론은 여러 종류가 있으며 대표적으로 올림픽에서의 트라이애슬론은 각각 주어진 구간만큼 수영하고, 사이클을 타며, 마지막으로 마라톤을 하게 된다.
	알고리즘에서도 트라이애슬론이 존재하는데, 처음 알고리즘 트라이애슬론을 고안한 폰 예스이만이 적은 문서에는 다음과 같은 경기 규칙이 적혀있다.

	대회는 17시간 동안 진행하며 문제의 수는 최소 30문제이다.
	각 문제의 유형은 애드혹, 다이나믹 프로그래밍, 그리디 알고리즘 중에서 최소 하나의 유형이 들어가야 한다.
	점수 계산은 자유롭게 정해도 되지만, 애드혹 문제 해결의 비중을 높게 잡아야 한다.
	2157년 폰 예스이만을 기념하는 의미로 알고리즘 트라이애슬론이 처음 개최되었다. 점수 계산 방식은 다음과 같다.

	$a$, $d$, $g$는 각각 애드혹, 다이나믹 프로그래밍, 그리디 알고리즘 문제 해결을 통해 얻은 점수이다.
	점수 계산은 $a \times (d + g)$로 진행한다.

	$a = (d+g)$의 경우에는 원래 얻을 점수의 두 배로 계산한다.
	이제 대회가 끝나고 시상식을 할 차례이다. 우승자를 가리기 위해 참가자들이 받은 점수 중에서 가장 높은 점수를 구해보자.

	input
	5
	1 0 1
	5 2 3
	5 5 4
	0 1 4
	3 7 2

	output
	50

	Solution : 1. for문 돌려서 합계의 케이스를 구하는 문제
*/

public class BaekJoon_25600 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		Integer maxValue = 0;

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer a = Integer.parseInt(st.nextToken());
			Integer d = Integer.parseInt(st.nextToken());
			Integer g = Integer.parseInt(st.nextToken());

			Integer sum = a * (d + g);
			if (a.equals(d + g)) {
				sum *= 2;
			}
			maxValue = Math.max(maxValue, sum);
		}

		System.out.println(maxValue);
	}
}
