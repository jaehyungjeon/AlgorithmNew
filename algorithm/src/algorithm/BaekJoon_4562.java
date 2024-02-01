package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Zombies love to eat brains. Yum.

	input
	3
	4 5
	3 3
	4 3

	output
	NO BRAINS
	MMM BRAINS
	MMM BRAINS

	Solution : 1. 너무 간단한 CASE 문제 
*/

public class BaekJoon_4562 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer A = Integer.parseInt(st.nextToken());
			Integer B = Integer.parseInt(st.nextToken());

			if(A >= B) {
				System.out.println("MMM BRAINS");
			} else {
				System.out.println("NO BRAINS");
			}
		}
	}
}
