package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : “The Merchant of Venice” has perhaps one of the most interesting “villains” in Shylock, a Jewish moneylender who has been hurt many times and in different ways by Christians in general,
	and Antonio, the titular merchant, in particular. When Antonio’s friend Bassanio urgently needs to borrow 3000 ducats to woo the lady he loves, Antonio’s money is tied up in his trading fleet;
	instead, he signs a loan contract with Shylock promising him a pound of his own flesh in case the 3000 ducats are not repaid by the due date.
	When his fleet is lost in a storm, the plot thickens and the story turns more ominous.

	We will ignore here the risk analysis that Antonio should probably have carried out, asking how likely each of his ships would return,
	and what the probability was that he would not be able to repay the money by the due date. Instead, we will focus on the question of how much money Antonio could repay Shylock by a given date,
	depending on where his ships are located at the start of the contract.

	Specifically, you will be given the number of days until the due date and the speed at which ships travel.
	You will also be given, for each ship, its distance from Venice and the value of its load in ducats. You are to output the number of ducats Antonio can repay by the due date.

	input
	2
	3 20 31
	42 70
	1000 2000
	512 121
	3 10 3
	29 1
	30 2
	31 4

	output
	Data Set 1:
	191

	Data Set 2:
	3

	Solution : 1. 단순한 계산문제. 출력을 유의해서 작성해주어야 한다.
 */

public class BaekJoon_13496 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer t = Integer.parseInt(br.readLine());

		for(int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer n = Integer.parseInt(st.nextToken());
			Integer s = Integer.parseInt(st.nextToken());
			Integer v = Integer.parseInt(st.nextToken());
			Integer ans = 0;

			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				Integer a = Integer.parseInt(st.nextToken());
				Integer b = Integer.parseInt(st.nextToken());

				if(s * v >= a) {
					ans += b;
				}
			}
			sb.append("Data Set " + (i+1) + ":").append("\n");
			sb.append(ans);
			if(i+1 < t) {
				sb.append("\n").append("\n");
			}
		}

		System.out.println(sb.toString());
	}
}