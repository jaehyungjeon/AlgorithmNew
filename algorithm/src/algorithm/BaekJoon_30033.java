package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 취준생에서 직장인이 된 임스는 Rust 프로그래밍 언어를 공부하고자 책을 구매했다.
	임스는 퇴근 후에 책을 정해진 페이지 수 이상으로 공부하기로 계획하였다.
	임스가 공부하고자 한 일수와 공부하고자 계획한 페이지 수, 실제 공부한 페이지 수가 주어졌을 때 임스가 계획을 성실히 지킨 횟수를 구해 보자.

	input
	5
	5 6 7 8 9
	5 5 5 10 10

	output
	3

	Solution : 1. 배열을 활용하였다.
*/

public class BaekJoon_30033 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer N = Integer.parseInt(br.readLine());
		Integer sum = 0;
		Integer[] arr = new Integer[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			if(arr[i] <= Integer.parseInt(st.nextToken())) {
				sum++;
			}
		}

		System.out.println(sum);
	}
}