package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : There’s a pizza store which serves pizza in two sizes: either a pizza slice, with area A1 and price P1, or a circular pizza, with radius R1 and price P2.
	You want to maximize the amount of pizza you get per dollar. Should you pick the pizza slice or the whole pizza?

	input
	8 4
	7 9

	output
	Whole pizza

	Solution : 1. 원의 넓이 = nr^2
*/

public class BaekJoon_16693 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double a1 = Double.parseDouble(st.nextToken());
		Double p1 = Double.parseDouble(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Double r1 = Double.parseDouble(st.nextToken());
		Double p2 = Double.parseDouble(st.nextToken());

		if(p1/a1 > (p2 / (Math.pow(r1, 2)*Math.PI))) {
			System.out.println("Whole pizza");
		} else {
			System.out.println("Slice of pizza");
		}
	}
}