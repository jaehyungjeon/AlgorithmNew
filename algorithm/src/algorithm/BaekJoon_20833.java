package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Nadja klistrar ihop små träkuber med sidlängd 1 till större kompakta kuber. Hon har nu bestämt sig för att hon vill ha en kub av varje sidlängd från 1 till N. Hur många småkuber behöver Nadja?

	input
	4

	output
	100

	Solution : 1. num의 세제곱의 합.
*/

public class BaekJoon_20833 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		Integer sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i*i*i;
		}

		System.out.println(sum);
	}
}