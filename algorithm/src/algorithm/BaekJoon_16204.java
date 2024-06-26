package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 앞 면에 O와 X가 적혀있는 카드 N개가 있다. N개의 카드 중 M개의 카드의 앞면에는 O가 한 개 적혀있고, 나머지 N-M개의 카드의 앞면에는 X가 한 개 적혀있다. 카드의 뒷 면은 두 종류의 카드 모두 같은 모양이라 구분할 수 없다.
	카드의 뒷 면에 O나 X를 하나씩 적으려고 한다. 이 때, O는 K개, X는 N-K개 적으려고 한다.
	앞 면과 뒷 면에 같은 모양이 적혀있는 카드의 최대 개수를 구하는 프로그램을 작성하시오.

	input
	4 3 2

	output
	3

	Solution : 1. O와 X의 최솟값에서 전체 개수에서 차감한 값 중 최소값을 더한다.
 */

public class BaekJoon_16204 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cnt = Integer.parseInt(st.nextToken());
		int O = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		System.out.println(Math.min(O, X) + Math.min(cnt-O, cnt-X));
	}
}