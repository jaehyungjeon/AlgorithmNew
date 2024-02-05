package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 학교의 로고인 DKSH는 Dankook University Software High School의 약자이다.

	D, K, S, H로만 이루어진 문자열이 주어진다. 이 문자열에서 DKSH가 몇 번 나타나는지 구해보자.

	input
	HDKSHDDKS

	output
	1

	Solution : 1. 4개씩 substring 하여 일치하면 카운트 증가
*/

public class BaekJoon_29766 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer count = 0;
		for(int i=0; i<str.length()-3; i++) {
			String contents = str.substring(i, i+4);
			if(contents.equals("DKSH")) count++;
		}

		System.out.println(count);
	}
}