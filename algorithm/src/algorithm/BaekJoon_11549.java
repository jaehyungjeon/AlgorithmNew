package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Blind tea tasting is the skill of identifying a tea by using only your senses of smell and taste.
	As part of the Ideal Challenge of Pure-Tea Consumers (ICPC), a local TV show is organized.
	During the show, a full teapot is prepared and five contestants are handed a cup of tea each.
	The participants must smell, taste and assess the sample so as to identify the tea type, which can be: (1) white tea; (2) green tea; (3) black tea; or (4) herbal tea.
	At the end, the answers are checked to determine the number of correct guesses.
	Given the actual tea type and the answers provided, determine the number of contestants who got the correct answer.

	input
	1
	1 2 3 2 1

	output
	2

	Solution : 1. 같을 경우 +1
 */

public class BaekJoon_11549 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		Integer sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<5; i++) {
			if(count.equals(Integer.parseInt(st.nextToken()))) {
				sum++;
			}
		}

		System.out.println(sum);
	}
}