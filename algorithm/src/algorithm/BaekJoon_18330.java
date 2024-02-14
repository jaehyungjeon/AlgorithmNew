package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The government of Neverland has recently announced a new petrol rationing plan with an unexpected price hike.
	According to the new plan, each person receives a quota of 60 liters per month in a fuel card. Each liter of petrol costs 1500 Oshloobs if it is within quota.
	Any extra fueling costs 3000 Oshloobs per liter.

	After recovering from the shock, Mahya is trying to figure out how dark is the future.
	The current month is coming to an end, and Mahya has some quota left in her fuel card, remaining available for the next month.
	A quota of 60 liters will also be added to her fuel card just at the beginning of the next month. She also has a prediction of the amount of petrol that will be used in the next month.
	She now wants to know how much she should pay for petrol in the next month. However, she is too lazy to do that on her own. So, she needs your help to calculate the cost for her. 

	input
	41
	0

	output
	61500

	Solution : 1. 단순 사칙연산
*/

public class BaekJoon_18330 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());
		Integer k = Integer.parseInt(br.readLine());
		Integer x = Math.min(k+60, n);
		System.out.println(x*1500 + (n-x)*3000);
	}
}