package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 3년만에 열리는 대면 SNUPC를 위해서, 민준이는 제2공학관으로 가고자 한다!
	제2공학관에 가는 버스는 여러 가지가 있다. 관악02, 5511, 5513, 5516... 어떤 버스를 타더라도 단점이 있는데, 그것은 바로 돈이 든다는 점이다! 돈을 한 푼이라도 아끼고자, 민준이는 셔틀버스를 타고 서울대입구역에서 제2공학관으로 가고 싶어한다.
	현재 서울대입구역과 제2공학관 사이에는 셔틀버스가 정확히 한 대 운행되고 있다. 이 셔틀버스의 운행 수칙은 다음과 같다.

	버스가 서울대입구역에서 제2공학관으로 이동하는 데에, 혹은 제2공학관에서 서울대입구역으로 이동하는 데에는 정확히 x분의 시간이 걸린다.
	버스는 쉬지 않고 운행한다. 즉 서울대입구역 혹은 제2공학관에 도착하자마자 다시 제2공학관 혹은 서울대입구역을 향해 이동하기 시작한다. 이때 타고 내리는 데에 걸리는 시간은 무시하자.
	현재 민준이는 서울대입구역에 있으며, 버스는 y분 후에 제2공학관으로 도착할 예정이다. 민준이가 버스에 최소 몇 분 뒤에 탑승할 수 있는지 계산해 보자.

	input
	10 3

	output
	13

	Solution : 1. 단순한 계산문제
 */

public class BaekJoon_25625 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		if(first < second) {
			System.out.println(second - first);
		} else {
			System.out.println(second + first);
		}
	}
}