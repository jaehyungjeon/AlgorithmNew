package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 월간 향유회에서는 민주주의적 다수결 투표 방식으로 문제의 출제 여부를 정한다. 즉, 
	$N$개의 문제 후보마다 $M$명의 출제위원이 찬반 의견을 내고, 과반수의 찬성을 얻은 문제가 출제된다. 
	이때 $M$은 항상 홀수이다.
	문제 후보에 대한 출제위원의 찬반 의견이 주어졌을 때, 출제될 문제의 수를 구하여라.

	input
	2 3
	OOX
	OXX

	output
	1

	Solution : 1. O의 갯수를 구한 뒤 전체에서 O가 과반수를 차지하면 카운트를 증가시킨다. 
*/

public class BaekJoon_30999 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer N = Integer.parseInt(st.nextToken());
		Integer M = Integer.parseInt(st.nextToken());
		Integer count = 0;
		for(int i=0; i<N; i++) {
			Integer ok = 0;
			String quiz = br.readLine();
			for(char c : quiz.toCharArray()) {
				if(c == 'O') {
					ok++;
				}
			}
			if(ok > M-ok) {
				count++;
			}
		}

		System.out.println(count);
	}
}
