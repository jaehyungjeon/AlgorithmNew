package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 세 양의 정수 
	$a$, $b$, $c$가 주어질 때, 다음 조건을 만족하는 정수 쌍 
	$(x, y, z)$의 개수를 구하시오.

	$1 \le x \le a$ 
	$1 \le y \le b$ 
	$1 \le z \le c$ 

	$(x\,\bmod\,y) = (y\,\bmod\,z) = (z\,\bmod\,x)$ 
	$(A\,\bmod\,B)$는 A$를 B$로 나눈 나머지를 의미한다.

	input
	2
	1 2 3
	3 2 4

	output
	1
	2

	Solution : 1. 최솟값을 찾으면 해결되는 문제였다.
 */

public class BaekJoon_25494 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			int k = Math.min(a,b);
			result = Math.min(k,c);
			System.out.println(result);
		}
	}
}