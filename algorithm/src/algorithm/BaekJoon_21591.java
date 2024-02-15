package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Your school has provided you with a laptop computer! However, they insist on putting a laptop sticker with their logo on your new computer.
	That sticker might be very large, and it can’t be rotated! Will it fit, with one centimeter to spare on all sides?

	input
	30 30 27 27

	output
	1

	Solution : 1. 단순 계산 문제
*/

public class BaekJoon_21591 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer wc = Integer.parseInt(st.nextToken());
		Integer hc = Integer.parseInt(st.nextToken());
		Integer ws = Integer.parseInt(st.nextToken());
		Integer hs = Integer.parseInt(st.nextToken());

		if((wc - ws) >= 2 && (hc - hs) >= 2) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}