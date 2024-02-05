package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : KOI 빵은 프로그래밍을 공부하는 학생들에게 인기를 끌고 있다. 이 빵은 맛있을 뿐 아니라, 안에 프로그래밍에 큰 도움이 되는 여러 가지 힌트가 담겨 있어서 매우 인기가 높다.
	이렇게 인기가 높기 때문에, 사람들은 KOI 빵이 가게에 들어오자마자 바로 모두 사 간다. KOI 빵을 사려면 빵이 오기 전에 가게에 가서 기다리고 있거나, 빵이 오는 순간에 정확히 맞추어 와야 한다.
	N개의 가게가 있고, 현재 위치에서 이 가게까지 가는 데 걸리는 시간, 그리고 KOI 빵이 이 가게에 들어올 때까지 남은 시간이 각각 주어진다. 빵이 가게에 도착하는 순간이나 도착하기 전에 가게에 갈 수 있으면 KOI 빵을 살 수 있고, 빵이 도착한 이후에 가게에 가면 이미 늦어서 빵이 없다.
	가장 빨리 몇 분 뒤에 KOI 빵을 구할 수 있는지 구하는 프로그램을 작성하시오. KOI 빵을 구할 수 있는 방법이 없을 수도 있다.  

	input
	3
	10 20
	15 18
	20 15

	output
	18

	Solution : 1. A >= B 인 것 중, 최소를 뽑는다
*/

public class BaekJoon_25377 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		Integer minValue = Integer.MAX_VALUE;
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer time = Integer.parseInt(st.nextToken());
			Integer bread = Integer.parseInt(st.nextToken());

			if(time <= bread) {
				minValue = Math.min(minValue, bread);
			}
		}

		if(minValue == Integer.MAX_VALUE) minValue = -1;
		System.out.println(minValue);
	}
}