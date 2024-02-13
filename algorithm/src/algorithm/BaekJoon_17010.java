package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : You and your friend have come up with a way to send messages back and forth.
	Your friend can encode a message to you by writing down a positive integer N and a symbol. You can decode that message by writing out that symbol N times in a row on one line.
	Given a message that your friend has encoded, decode it.

	input
	4
	9 +
	3 -
	12 A
	2 X

	output
	+++++++++
	---
	AAAAAAAAAAAA
	XX	

	Solution : 1. 단순 반복문
*/

public class BaekJoon_17010 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer count = Integer.parseInt(st.nextToken());
			String sign = st.nextToken();
			for (int j = 0; j < count; j++) {
				sb.append(sign);
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}