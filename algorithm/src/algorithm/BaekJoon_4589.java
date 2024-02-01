package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : In the book All Creatures of Mythology, gnomes are kind, bearded creatures, while goblins tend to be bossy and simple-minded. 
	The goblins like to harass the gnomes by making them line up in groups of three, ordered by the length of their beards. 
	The gnomes, being of different physical heights, vary their arrangements to confuse the goblins. 
	Therefore, the goblins must actually measure the beards in centimeters to see if everyone is lined up in order.

	Your task is to write a program to assist the goblins in determining whether or not the gnomes are lined up properly, 
	either from shortest to longest beard or from longest to shortest.

	input
	3
	40 62 77
	88 62 77
	91 33 18

	output
	Gnomes:
	Ordered
	Unordered
	Ordered

	Solution : 1. 오름차순 / 내림차순에 관한 정렬이 올바른지를 탐색하는 문제.
*/

public class BaekJoon_4589 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("Gnomes:").append("\n");
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer A = Integer.parseInt(st.nextToken());
			Integer B = Integer.parseInt(st.nextToken());
			Integer C = Integer.parseInt(st.nextToken());
			
			if((A < B && B < C && A < C) || (A > B && B > C && A > C)) {
				sb.append("Ordered");
			} else {
				sb.append("Unordered");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}
