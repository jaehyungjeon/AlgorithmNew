package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : After a long time at home during the quarantine, in November you decided to go to work by bicycle! Since you do not have your own bicycle, you have to rent one.
	The bike rental allows you to choose one of two monthly options:

	The monthly fee is $a$ roubles. Every day, the first $30$ minutes are free, and every minute above that costs $x$ roubles.
	The monthly fee is $b$ roubles. Every day, the first $45$ minutes are free, and every minute above that costs $y$ roubles.
	There are $21$ working days in November, and you spend $T$ minutes commuting to work and back home in total every day.
	Calculate how many roubles you would spend if you use either one of two monthly options.

	input
	10
	1
	20
	5
	50

	output
	430 545

	Solution : 1. 단순 계산 문제
 */

public class BaekJoon_20233 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer a = Integer.parseInt(br.readLine());
		Integer x = Integer.parseInt(br.readLine());
		Integer b = Integer.parseInt(br.readLine());
		Integer y = Integer.parseInt(br.readLine());
		Integer T = Integer.parseInt(br.readLine());

		Integer aMinutes = T - 30;
		Integer bMintues = T - 45;
		if(aMinutes < 0) aMinutes = 0;
		if(bMintues < 0) bMintues = 0;

		aMinutes *= x;
		bMintues *= y;
		System.out.println((aMinutes * 21 + a) + " " + (bMintues * 21 + b));
	}
}
