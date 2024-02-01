package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : JOI 상사는 직원의 근무시간을 타임 카드로 관리하고있다. 직원들은 전용 장비를 사용하여 타임 카드에 출근 시간을 기록한다. 근무를 마치고 퇴근할 때도 타임 카드에 퇴근 시간을 기록한다. 타임카드에서 사용하는 시간단위는 24 시간제를 사용한다.
	보안상의 이유로 직원들의 출근 시간은 7시 이후이다. 또한, 모든 직원은 23시 이전에 퇴근한다. 직원의 퇴근 시간은 항상 출근 시간보다 늦다.
	입력으로 JOI 상사의 3 명의 직원 A 씨, B 씨, C 씨의 출근 시간과 퇴근 시간이 주어 졌을 때 각 직원의 근무시간을 계산하는 프로그램을 작성하라.

	input
	9 0 0 18 0 0
	9 0 1 18 0 0
	12 14 52 12 15 30

	output
	9 0 0
	8 59 59
	0 0 38

	Solution : 1. 퇴근시간 > 출근시간
			   2. 초부터 빼서 값을 구해주어야 한다.
*/

public class BaekJoon_5575 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer beforeHour = Integer.parseInt(st.nextToken());
			Integer beforeMinute = Integer.parseInt(st.nextToken());
			Integer beforeSecond = Integer.parseInt(st.nextToken());

			Integer afterHour = Integer.parseInt(st.nextToken());
			Integer afterMinute = Integer.parseInt(st.nextToken());
			Integer afterSecond = Integer.parseInt(st.nextToken());

			Integer totalHour = 0;
			Integer totalMinute = 0;
			Integer totalSecond = 0;

			// 초를 빼준다.
			if(beforeSecond > afterSecond) {
				totalSecond = (afterSecond + 60) - beforeSecond;
				afterMinute -= 1;
			} else {
				totalSecond = afterSecond - beforeSecond;
			}

			// 분을 빼준다.
			if(beforeMinute > afterMinute) {
				totalMinute = (afterMinute + 60) - beforeMinute;
				afterHour -= 1;
			} else {
				totalMinute = afterMinute - beforeMinute;
			}

			totalHour = afterHour - beforeHour;
			System.out.println(totalHour + " " + totalMinute + " " + totalSecond);
		}
	}
}