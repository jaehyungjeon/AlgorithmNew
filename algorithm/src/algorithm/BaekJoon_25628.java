package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 햄버거 가게에서 일하는 종현이는 햄버거를 만드는 일을 하고 있다. 가게에는 햄버거 빵이 
	$A$개, 햄버거 패티가 $B$개 있는데, 이 빵과 패티를 가지고 최대한 햄버거를 많이 만드려고 한다. 햄버거를 만드는 과정은 아주 간단한 세 단계로 이루어져 있다.

	그릇 위에 빵을 놓는다.
	빵 위에 패티를 올린다.
	패티 위에 다시 빵을 올려서 햄버거를 완성시킨다.
	햄버거 빵 $A$개와 햄버거 패티 $B$개로 만들 수 있는 햄버거의 최대 개수는 얼마일까? 단, 햄버거 빵은 위에 놓는 빵과 아래에 놓는 빵의 구분이 없으며, 남는 빵이나 패티가 있어도 된다.

	input
	6 3

	output
	3

	Solution : 1. 빵/2 값과 패티의 최소값을 구한다.
 */

public class BaekJoon_25628 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bread = Integer.parseInt(st.nextToken()) / 2;
		int meat = Integer.parseInt(st.nextToken());

		System.out.println(Math.min(bread, meat));
	}
}