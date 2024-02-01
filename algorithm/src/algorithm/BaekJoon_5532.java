package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 상근이는 초등학교에 다닐 때, 방학 숙제를 남들보다 먼저 미리 하고 남은 기간을 놀았다. 방학 숙제는 수학과 국어 문제 풀기이다.
	방학은 총 L일이다. 수학은 총 B페이지, 국어는 총 A페이지를 풀어야 한다. 상근이는 하루에 국어를 최대 C페이지, 수학을 최대 D페이지 풀 수 있다.
	상근이가 겨울 방학동안 숙제를 하지 않고 놀 수 있는 최대 날의 수를 구하는 프로그램을 작성하시오.

	input
	20
	25
	30
	6
	8

	output
	15

	Solution : 1. 나머지가 남지 않는선에서 두 과목의 최댓값을 구하고 방학일수에서 차감한다. 
*/

public class BaekJoon_5532 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer vacation = Integer.parseInt(br.readLine());
		Integer Korean = Integer.parseInt(br.readLine());
		Integer Math = Integer.parseInt(br.readLine());
		Integer KoreanMax = Integer.parseInt(br.readLine());
		Integer MathMax = Integer.parseInt(br.readLine());

		// 국어 독파일
		if(Korean%KoreanMax == 0) { // 나누어 떨어질 경우
			KoreanMax = Korean/KoreanMax;
		} else {
			KoreanMax = Korean/KoreanMax + 1;
		}

		// 수학 독파일
		if(Math%MathMax == 0) { // 나누어 떨어질 경우
			MathMax = Math/MathMax;
		} else {
			MathMax = Math/MathMax + 1;
		}

		System.out.println(vacation - Math.max(KoreanMax, MathMax));
	}
}