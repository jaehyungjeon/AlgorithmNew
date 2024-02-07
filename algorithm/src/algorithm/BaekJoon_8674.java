package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Mama przyniosła Piotrusiowi i Pawełkowi tabliczkę czekolady o wymiarach a i b. Chłopcy chcą podzielić tabliczkę za pomocą jednego prostego łamania, wzdłuż kostek pionowych lub poziomych. 
	Chłopcy chcą podzielić tabliczkę jak najbardziej sprawiedliwie, czyli tak, aby różnica pomiędzy kawałkami, które przypadną na każdego z nich, była jak najmniejsza.

	input
	5 3

	output
	3

	Solution : 1. 둘다 짝수이면 균일하게 나눌 수 있으므로 0으로 리턴한다.
			   2. 홀수이면 둘 중 최솟값을 반환해주면 된다.
			   3. 입력사항 중 2^32 까지이므로 정수형으로는 안된다. -> Long으로 파싱
*/

public class BaekJoon_8674 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long a = Long.parseLong(st.nextToken());
		Long b = Long.parseLong(st.nextToken());

		if(a%2 == 0 || b%2 == 0) System.out.println(0);
		else {
			System.out.println(Math.min(a, b));
		}
	}
}