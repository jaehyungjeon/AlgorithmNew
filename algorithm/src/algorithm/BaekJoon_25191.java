package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 치킨 댄스를 추고 있는 곰곰이를 본 임스는 치킨을 먹고 싶어졌다. 임스는 치킨 
	$1$마리를 먹을 때 반드시 집에 있는 콜라 
	$2$개나 맥주 
	$1$개와 같이 먹어야 한다.

	또한, 치킨집에 있는 치킨의 개수보다 치킨을 많이 시켜먹을 수는 없다.

	치킨집에 있는 치킨의 개수와 임스의 집에 있는 콜라, 맥주의 개수가 주어졌을 때, 임스가 시켜먹을 수 있는 치킨의 총 개수를 출력하시오.

	input
	5
	4 2

	output
	4

	Solution : 1. 콜라 / 2 + 맥주의 합과 치킨의 값의 최솟값을 구한다.  
*/

public class BaekJoon_25191 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer chicken = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer cola = Integer.parseInt(st.nextToken()) / 2;
		Integer beer = Integer.parseInt(st.nextToken());

		System.out.println(Math.min(chicken, cola + beer));
	}
}