package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 농부 존은 소들을 위해 새로운 헛간을 지었다. 소들의 리더인 암소 베시는 새로운 헛간에 입주할 소들을 추첨으로 정하기로 했다. 소들은 그동안 모아 왔던 건초 더미를 담보로 추첨에 응모했다.
	이번 추첨에는 총 $N$마리의 소가 응모했다. 헛간은 $W \times H$ 크기의 직사각형이다. 베시는 소 한 마리당 $L \times L$ 크기의 공간을 배정할 계획이다.
	베시는 헛간을 최대한 효율적으로 나누어 최대한 많은 소를 입주 시키려고 한다. 헛간에는 최대 몇 마리의 소들이 입주할 수 있는지 출력하라. 소들이 입주하는 공간의 각 변은 직사각형의 각 변에 대해 수평 혹은 수직이여야 한다.

	input
	7 17 11 5

	output
	6

	Solution : 1. 소들이 차지하는 면적은 넓이이기 때문에 가로와 세로만큼 나눠주고 두 값을 곱한 값이 최대로 들어갈 수 있는 소들의 값이다.
			   2. 전제조건으로 최대 N마리까지 입장 가능하므로 두 값의 min값을 구해주면 된다.
*/

public class BaekJoon_19698 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		W /= L;
		H /= L;
		System.out.println(Math.min(N, (W*H)));
	}
}