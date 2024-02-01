package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 상현이가 가르치는 아이폰 앱 개발 수업의 수강생은 원섭, 세희, 상근, 숭, 강수이다.

	어제 이 수업의 기말고사가 있었고, 상현이는 지금 학생들의 기말고사 시험지를 채점하고 있다. 기말고사 점수가 40점 이상인 학생들은 그 점수 그대로 자신의 성적이 된다. 
	하지만, 40점 미만인 학생들은 보충학습을 듣는 조건을 수락하면 40점을 받게 된다. 보충학습은 거부할 수 없기 때문에, 40점 미만인 학생들은 항상 40점을 받게 된다.

	학생 5명의 점수가 주어졌을 때, 평균 점수를 구하는 프로그램을 작성하시오.

	input
	10
	65
	100
	30
	95

	output
	68

	Solution : 1. 점수가 40점 미만이면 40으로 고정해서 더해준다. -> 나머지 5해준다!
*/

public class BaekJoon_10039 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer sum = 0;
		for(int i=0; i<5; i++) {
			Integer score = Integer.parseInt(br.readLine());
			if(score < 40) {
				score = 40;
			}
			sum += score;
		}

		System.out.println(sum / 5);
	}
}