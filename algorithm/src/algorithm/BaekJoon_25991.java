package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : You work at a warehouse that sells chemical products, where somebody just placed an order for all the Boron Acetate Phosphoric Carbonate (BAPC) that you have in store.
	This liquid is stored in many separate lots, in cube-shaped containers, but your client requires the order to be delivered in a single cube-shaped container that fits all the BAPC liquid perfectly.
	What should be the size of this container?

	input
	3
	22.10 2022 1337

	output
	2200.6131345362505

	Solution : 1. 결국 담는 정육면체의 부피를 구하는 문제이다.
 */

public class BaekJoon_25991 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		Double sum = 0d;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < count; i++) {
			Double number = Double.parseDouble(st.nextToken());
			sum += Math.pow(number, 3);
		}

		System.out.println(Math.cbrt(sum));
	}
}