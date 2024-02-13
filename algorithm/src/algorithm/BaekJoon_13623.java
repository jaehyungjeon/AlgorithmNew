package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Everyone probably knows the game Zero or One (in some regions in Brazil also known as Two or One), used to determine a winner among three or more players.
	For those unfamiliar, the game works as follows. Each player chooses a value between zero or one; prompted by a command (usually one of the contestants announces “Zero or... One!”),
	all participants show the value chosen using a hand: if the value chosen is one, the contestant shows a hand with an extended index finger;
	if the value chosen is zero, the contestant shows a hand with all fingers closed. The winner is the one who has chosen a value different from all others.
	If there is no player with a value different from all others (e.g. all players choose zero, or some players choose zero and some players choose one), there is no winner.

	Alice, Bob and Clara are great friends and play Zerinho all the time: to determine who will buy popcorn during the movie session, who will enter the swimming pool first, etc..
	They play so much that they decided make a plugin to play Zerinho on Facebook. But since the don’t know how to program computers, they divided the tasks among friends who do know, including you.

	Given the three values chosen by Alice, Bob and Clara, each value zero or one, write a program that determines if there is a winner, and in that case determines who is the winner.

	input
	1 1 0

	output
	C

	Solution : 1. 셋 중 다른값이 있을 경우 다른 값을 가진사람이 승리
			   2. 모두 같으면 * 표시
			   3. 단순한 비교조건 알고리즘
 */

public class BaekJoon_13623 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer a = Integer.parseInt(st.nextToken());
		Integer b = Integer.parseInt(st.nextToken());
		Integer c = Integer.parseInt(st.nextToken());
		if ((a.equals(1) && b.equals(c) && b.equals(0)) 
		|| (a.equals(0) && b.equals(c) && b.equals(1))) {
			System.out.println("A");
		} else if ((b.equals(1) && a.equals(c) && a.equals(0)) 
				|| (b.equals(0) && a.equals(c) && a.equals(1))) {
			System.out.println("B");
		} else if ((c.equals(1) && a.equals(b) && a.equals(0)) 
				|| (c.equals(0) && a.equals(b) && a.equals(1))) {
			System.out.println("C");
		} else {
			System.out.println("*");
		}
	}
}