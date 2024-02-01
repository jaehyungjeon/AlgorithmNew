package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.

	input
	baekjoon

	output
	4

	Solution : 1. 제일 간단한 방법은.. charArray를 이용하여 모음을 찾는게 빠르다. 
*/

public class BaekJoon_10987 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] charArr = br.readLine().toCharArray();
		Integer moCount = 0;
		for(char c : charArr) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') moCount++;
		}

		System.out.println(moCount);
	}
}