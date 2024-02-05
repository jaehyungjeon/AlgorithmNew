package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 이 문제는 $x_0$와 $N$의 제한을 제외하고 특별한 큰 분수와 같은 문제이다.
	NLCS에는 분수가 많다.

	분수에서 나오는 물의 높이는 특정한 규칙에 따라 변화하는데, 어떤 정수 시각 $t$에서의 분수의 높이가 정수 $x_t$일 때, $x_{t+1}$는 $x_t$가 짝수라면 
	$\lfloor \frac{x_t}{2} \rfloor \oplus 6$, $x_t$가 홀수라면 $(2 \cdot x_t) \oplus 6$과 같다.
 
	$0$초에서의 분수의 높이가 주어졌을 때, $N$초에서의 분수의 높이를 구하는 프로그램을 작성하시오.

	input
	512 2

	output
	133

	Solution : 1. XOR 연산은 ^로 구성해주면 된다.
 */

public class BaekJoon_27890 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer X = Integer.parseInt(st.nextToken());
		Integer N = Integer.parseInt(st.nextToken());

		for(int i=0; i<N; i++) {
			if(X%2 == 0) {
				X = (X/2) ^ 6;
			} else {
				X = (2*X) ^ 6;
			}
		}

		System.out.println(X);
	}
}