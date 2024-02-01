package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다. 
	민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오. 단, 서로 동점일 때는 민국이의 총점 S를 출력한다.

	input
	100 80 70 60
	80 70 80 90

	output
	320

	Solution : 1. 인원별 총합계를 구한 후, Math 함수를 이용하여 max값을 도출한다.
*/

public class BaekJoon_5596 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer minSum = 0;
		Integer manSum = 0;
		for(int i=0; i<4; i++) {
			minSum += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			manSum += Integer.parseInt(st.nextToken());
		}

		System.out.println(Math.max(minSum, manSum));
	}
}