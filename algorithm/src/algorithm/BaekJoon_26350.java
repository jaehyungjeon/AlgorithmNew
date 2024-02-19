package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Different countries use different coin denominations. For example, the USA uses 1, 5, 10, and 25.
	A desirable property of coin denominations is to have each coin at least twice the amount of its previous coin in sorted order.
	For example, the USA denominations have this property, but the coin denominations {1, 5, 6} do not (6 is not at least twice 5).

	Given the coin denominations, you are to determine if the set has the above property.

	input
	2
	4 1 5 10 25
	3 1 5 6

	output
	Denominations: 1 5 10 25
	Good coin denominations!

	Denominations: 1 5 6
	Bad coin denominations!

	Solution : 1. 순서대로 풀이해주면 된다.
*/

public class BaekJoon_26350 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			Integer a = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[a];
			sb.append("Denominations: ");
			for(int k = 0; k < a; k++) {
				arr[k] = Integer.parseInt(st.nextToken());
				sb.append(arr[k]).append(" ");
			}
			sb.append("\n");

			boolean check = true;
			for (int j = 1; j < arr.length; j++) {
				if(arr[j] < arr[j-1] * 2) {
					check = false;
					break;
				}
			}
			
			if(check) {
				sb.append("Good coin denominations!");
			} else {
				sb.append("Bad coin denominations!");
			}

			if(i != n-1) sb.append("\n").append("\n");
		}

		System.out.println(sb.toString());
	}
}