package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Adam has just started learning how to walk (with some help from his brother Omar), and he falls down a lot.
	In order to balance himself, he raises his hands up in the air (that’s a true story), and once he puts his hands down, he falls.

	You are given a string, each character represents a step he walks, if that character is ‘U’ that means his hands are up in this step,
	if this character is ‘D’ that means his hands are down and he fell down in this step. Your task is to count how many steps he will walk before falling down for the first time.

	input
	3
	UUUDU
	DDD
	UU

	output
	3
	0
	2

	Solution : 1. D가 나오면 break;
*/

public class BaekJoon_18698 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			String str = br.readLine();
			Integer increase = 0;
			for (char c : str.toCharArray()) {
				if (c == 'U') {
					increase++;
				} else if (c == 'D') {
					break;
				}
			}
			sb.append(increase).append("\n");
		}

		System.out.println(sb.toString());
	}
}
