package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Dr. Orooji has a daily calendar (365 pages) on his desk. Every morning, he tears off one page and, as he is reading the notes on the next page, he folds (out of habit) the sheet in his hand.
	Dr. O noticed that he always folds the sheet (a rectangular paper) along the longer side, e.g., if one side is 80 and the other side is 60, he would fold along 80; this will make the paper of size 40 and 60;
	if he folds it again, he would fold along 60 since that’s the longer side now.

	Given a rectangular piece of paper and how many times Dr. O folds it, you are to determine the final sizes.
	When folding a side with an odd length, the fraction is ignored after folding, e.g., if a side is 7, it will become 3 after folding.

	input
	3
	60 51 4
	3 2 50
	3 2 1

	output
	Data set: 60 51 4
	15 12

	Data set: 3 2 50
	0 0

	Data set: 3 2 1
	2 1

	Solution : 1. 계산식 활용
*/

public class BaekJoon_26340 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());
			Integer c = Integer.parseInt(st.nextToken());
			sb.append("Data set: ").append(str).append("\n");
			for (int j = 1; j <= c; j++) {
				if (a >= b) {
					a = a / 2;
				} else if (a < b) {
					b = b / 2;
				}
			}

			if (a > b) {
				sb.append(a).append(" ").append(b);
			} else {
				sb.append(b).append(" ").append(a);
			}
			sb.append("\n").append("\n");
		}

		System.out.println(sb.toString());
	}
}