package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 드높은 남산 위에 우뚝 선
	송백은 흰 눈빛에 푸르고
	옛부터 흘러가는 한가람
	장 할 손 우리 학원 이룩한
	굳세고 다함 없는 거룩한 뜻이
	백이십년 빛난 역사 자랑이로세
	비바람 몰아쳐도 나가자
	공들여 쌓은 탑은 빛난다
	울려라 삼천리에 힘차게
	세워라 반석 위에
	선린의터를
	선린인터넷고등학교 학생들은 이미 잘 알고 있겠지만, 학교 교가를 부를 때는 마지막 5글자인 "선린의터를" 부분만 크고 우렁차게 불러야 한다.
	정휘는 여기에 영감을 받아, 문자열이 주어지면 마지막 5글자만 우렁차게 읽으려고 한다. 공백이 없는 문자열이 주어지면 마지막 5글자만 출력하는 프로그램을 작성해보자.

	input
	12
	Sunrin,Hair.

	output
	Hair.

	Solution : 1. 단순한 substring 문제
*/

public class BaekJoon_21964 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxCnt = Integer.parseInt(br.readLine());
		System.out.println(br.readLine().substring(maxCnt-5, maxCnt));
	}
}