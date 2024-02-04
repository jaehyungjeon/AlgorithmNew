package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : 4명의 친구가 탁구를 하고 있다. 각각은 정수형으로 표현된 스킬 레벨을 가지고 있고, 숫자가 높을수록 더 좋은 플레이어다.
	4명의 친구는 각각 두 명씩 구성된 두 팀을 구성하려고 한다. 게임이 더 흥미롭게 하기 위해서 팀의 스킬 레벨을 최대한 가깝게 유지하기를 원한다. 팀의 스킬 레벨은 팀원의 스킬 레벨의 합계이다.
	그들은 탁구 선수로는 탁월하지만, 수학이나 컴퓨터와 같은 다른 것들에 능숙하지 않다. 팀의 스킬 레벨이 가능한 작은 차이를 갖도록 도와주자.

	input
	4 7 10 20

	output
	7

	Solution : 1. (최솟값 + 최댓값) - 나머지 2개의 값의 합
*/

public class BaekJoon_13866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer arr[] = new Integer[4];
		for(int i=0; i<4; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 오름차순으로 정렬한다.
		Arrays.sort(arr);
		System.out.println(Math.abs((arr[0]+arr[3])-(arr[1]+arr[2])));
	}
}