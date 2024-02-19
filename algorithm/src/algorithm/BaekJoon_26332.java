package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : To encourage customers to shop more, some stores charge lower prices if you buy multiples of an item. For example, if you buy one, it may cost you $5 but if you buy two, it will cost you $8 instead of $10.

	Let’s assume a store provides discounts as follows:

	No discount if you buy only one.
	$2 discount for each additional item if you buy more than one.
	Given the number of items a customer has purchased and the price for one item, you are to compute the total cost for the customer.

	input
	2
	1 5
	3 10

	output
	1 5
	5
	3 10
	26

	Solution : 1. 단순 출력을 위한 분기
*/

public class BaekJoon_26332 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.parseInt(br.readLine());

		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer c = Integer.parseInt(st.nextToken());
			Integer p = Integer.parseInt(st.nextToken());

			System.out.println(c + " " + p);
			if(c.equals(1)) {
				System.out.println(c*p);
			} else {
				System.out.println((c*p - 2*(c-1)));
			}
		}
	}
}