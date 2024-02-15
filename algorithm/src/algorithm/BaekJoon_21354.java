package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Axel vill tävla med Petra om vem som sålt flest äpplen respektive päron, men Petra tycker inte att man kan "jämföra äpplen och päron".
	De kommer överens om att de istället ska jämföra hur mycket de tjänat. De ber dig skapa ett program som skriver ut vem som tjänat mest. Äpplen kostar 7 kronor styck och päron 13 kronor styck.

	input
	13 7

	output
	lika

	Solution : 1. 단순 비교 문제
*/

public class BaekJoon_21354 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken()) * 7;
		Integer P = Integer.parseInt(st.nextToken()) * 13;

		if(A > P) {
			System.out.println("Axel");
		} else if(A.equals(P)) {
			System.out.println("lika");
		} else {
			System.out.println("Petra");
		}
	}
}