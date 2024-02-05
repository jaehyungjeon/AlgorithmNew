package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 당신은 SASA 연못에서 알파벳 S 모양의 블록 
	$N$개와 알파벳 A 모양의 블록 
	$M$개를 건졌다. 태영이는 연못에서 건진 블록을 이용해 학교에 전시할 SASA 모형을 최대한 많이 만들려고 한다.

	SASA 모형 
	$1$개를 만들기 위해서는, 알파벳 S 모양의 블록 
	$2$개와 알파벳 A 모양의 블록 
	$2$개가 필요하다. 태영이가 만들 수 있는 SASA 모형 개수의 최댓값을 구하라.

	input
	4 5

	output
	2

	Solution : 1. 각각의 값을 2로 나눈 것의 최솟값을 구한다. 
*/

public class BaekJoon_23825 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken()) / 2;
		int A = Integer.parseInt(st.nextToken()) / 2;

		System.out.println(Math.min(S, A));
	}
}