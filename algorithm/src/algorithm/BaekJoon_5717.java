package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 상근이의 남자 친구의 수와 여자 친구의 수가 주어졌을 때, 친구는 총 몇 명인지 구하는 프로그램을 작성하시오.

	input
	2 2
	2 3
	5 5
	1 1
	0 0

	output
	4
	5
	10
	2

	Solution : 1. man, woman이 모두 0일 경우 break처리한다.
*/

public class BaekJoon_5717 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer man = Integer.parseInt(st.nextToken());
			Integer woman = Integer.parseInt(st.nextToken());

			if(man == 0 && woman == 0) break;
			else {
				System.out.println(man + woman);
			}
		}
	}
}