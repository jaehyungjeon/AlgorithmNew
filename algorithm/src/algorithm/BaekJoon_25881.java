package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : To encourage customers to conserve energy (and protect the environment), the electric companies typically have a lower rate for the first 1000 kilowatt-hour (KWH) of electric usage 
	and a higher rate for the additional usage (KWH is a derived unit of energy equal to 3.6 megajoules).

	Given the rate (per KWH) for the first 1000 KWH usage, the rate (per KWH) for the additional usage, and a customer’s energy consumption, you are to determine the charges (bill) for the customer.

	input
	6 10
	4
	1000
	1001
	700
	4800

	output
	1000 6000
	1001 6010
	700 4200
	4800 44000

	Solution : 1. 대상의 합계를 구하는 문제
 */

public class BaekJoon_25881 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long num1 = Long.parseLong(st.nextToken());
		Long num2 = Long.parseLong(st.nextToken());

		Integer n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			Long kwh = Long.parseLong(br.readLine());
			if(kwh <= 1000) {
				System.out.println(kwh + " " + kwh * num1);
			} else {
				System.out.println(kwh + " " + ((1000*num1) + (kwh - 1000) * num2));
			}
		}
	}
}