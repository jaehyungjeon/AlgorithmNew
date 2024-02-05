package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 진호는 요즘 유행하는 심리 검사인 MBTI에 관심이 많다. MBTI는 아래와 같이 네 가지 척도로 사람들의 성격을 구분해서, 총 $16$가지의 유형중에서 자신의 유형을 찾을 수 있는 심리 검사이다.

	내향(I) / 외향(E)
	직관(N) / 감각(S)
	감정(F) / 사고(T)
	인식(P) / 판단(J)
	모든 유형의 목록은 다음과 같다.

	INFP, ENFP, ISFP, ESFP, INTP, ENTP, ISTP, ESTP, INFJ, ENFJ, ISFJ, ESFJ, INTJ, ENTJ, ISTJ, ESTJ
	진호는 $N$명의 친구들에게 MBTI 유형을 물어 봤다. 이 중에서 진호와 MBTI 유형이 같은 사람의 수는 얼마일까?

	input
	ESTJ
	5
	ISTP
	ESTJ
	INTP
	ESTJ
	ENTJ

	output
	2

	Solution : 1. 같은 MBTI를 탐색한다.
 */

public class BaekJoon_25640 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String mbti = br.readLine();
		int cnt = Integer.parseInt(br.readLine());
		int total = 0;

		for(int i=0; i<cnt; i++) {
			if(mbti.equals(br.readLine())) {
				total++;
			}
		}

		System.out.println(total);
	}
}