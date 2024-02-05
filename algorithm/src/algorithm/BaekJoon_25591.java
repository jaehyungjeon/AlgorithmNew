package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 푸앙이의 친구 종윤이는 수학, 과학이 굉장히 발전한 곳 중 하나인 인도에 진심이다. 한국에선 구구단을 배우지만 인도에서는 19단까지 배운다고 한다. 어떻게 두 자릿수 곱셈을 빠르게 암산하는 것일까? 푸앙이는 인도 마니아 종윤이한테 인도의 베다수학 곱셈법을 배워보기로 했다.
	인도 베다수학 곱셈법 예시 그림 <인도 베다수학 곱셈법 예시 그림> 
	$97×96$을 계산해보자. 각 수를 $100$에서 빼준 값을 $a$, $b$라고 하면 $$\begin{align}a=100-97=3\\b=100-96=4\end{align}$$ 그리고 $c$, $d$를 다음과 같이 정의하고 구한다.

	$$\begin{align}c&=100-(a+b)=100-7=93\\d&=a×b=3×4=12\end{align}$$ $c$는 곱셈 결괏값의 앞의 두 자릿수, $d$는 뒤의 두 자릿수에 해당한다.
 
	$a$, $b$가 작을 때는 위와 같은 계산으로 끝나지만 그렇지 않은 경우도 존재한다. 만약 $d$가 두 자릿수를 넘어버린다면 다시 여기서 하위 두 자릿수만 취하고, 초과 자릿수들의 값은 $c$에 더해주면 된다. 
	다시 말해서, $d$를 $100$으로 나눈 몫과 나머지를 각각 $q$, $r$이라고 했을 때 $c+q$를 앞의 두 자릿수, $r$을 뒤의 두 자릿수로 결정한다.
	푸앙이도 인도에 흥미가 생겼지만, 수학은 머리가 아프다. 푸앙이를 위해서 두 수가 들어왔을 때 인도의 베다수학 곱셈법을 자동으로 계산해주는 프로그램을 만들어주자.

	input
	97 96

	output
	3 4 93 12 0 12
	93 12

	Solution : 1. 조건에 맞게 계산을 해주면 된다.
 */

public class BaekJoon_25591 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		A = 100 - A;
		B = 100 - B;
		int multiply = A * B;
		int division = multiply/100;
		int remain = multiply%100;
		sb.append(A).append(" ").append(B).append(" ").append(100 - (A+B)).append(" ").append(multiply).append(" ").append(division).append(" ").append(remain).append("\n");
		sb.append(division+(100 - (A+B))).append(" ").append(remain);
		System.out.println(sb.toString());
	}
}