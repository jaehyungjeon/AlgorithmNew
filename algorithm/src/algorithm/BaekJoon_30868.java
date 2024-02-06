package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 투표가 끝난 뒤에는 개표를 해야 한다. 일반적으로 개표는 칠판을 사용하며, 한 표가 나올 때마다 한 획을 추가로 긋는 방식을 사용한다.
	이 문제에서는 다음과 같은 방식으로 개표를 진행한다.

	모든 후보자는 $0$표, 즉 아무것도 그려져 있지 않는 상태로 시작한다. 어떤 후보자가 한 표를 받을 때마다, |를 맨 뒤에 그린다.
	단, 그 후보자가 $5$표를 받을 때마다, |를 그리는 대신 이미 있던 $4$개의 |에 가로줄을 그어 ++++를 만든다. 이후 $1$칸의 공백을 뒤에 추가한다.
	예를 들면, $12$표를 받은 후보의 경우 칠판에는 ++++ ++++ ||가 적히게 된다.

	input
	3
	12
	1
	5

	output
	++++ ++++ ||
	|
	++++

	Solution : 1. 몫과 나머지를 이용하여 StringBuilder에 append 해준다.
*/

public class BaekJoon_30868 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());
		for(int i=0; i<count; i++) {
			Integer ticket = Integer.parseInt(br.readLine());
			Integer o = ticket / 5;
			Integer r = ticket % 5;
			for(int j=0; j<o; j++) {
				sb.append("++++ ");
			}
			for(int k=0; k<r; k++) {
				sb.append("|");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}