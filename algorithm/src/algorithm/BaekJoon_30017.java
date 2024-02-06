package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 승현이가 일하는 햄버거 가게에는 요리 재료로 사용할 햄버거 패티가 A개, 슬라이스 치즈가 B개 있다. 
	치즈버거를 만들기 위해서는 패티와 치즈를 각각 한 개 이상 고른 후 햄버거 빵 사이에 패티와 치즈를 번갈아 쌓아야 한다. 단, 패티의 개수는 치즈의 개수보다 정확히 한 개 더 많이 골라야 한다.
	승현이는 가게에 있는 요리 재료를 가지고 최대한 큰 치즈버거를 하나 만들려고 한다. 치즈버거의 크기는 패티와 치즈의 개수를 더한 것과 같다. 승현이가 만들 수 있는 치즈버거의 최대 크기를 구해보자.

	input
	2 1

	output
	3

	Solution : 1. 최초는 무조건 3개(패티 2 / 치즈 1)
			   2. 최솟값을 구한 후 2*val를 더해주면 된다.
*/

public class BaekJoon_30017 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer count = 3;
		Integer meat = Integer.parseInt(st.nextToken()) - 2;
		Integer cheese = Integer.parseInt(st.nextToken()) - 1;

		Integer value = Math.min(meat, cheese);
		System.out.println(count + (2*value));
	}
}