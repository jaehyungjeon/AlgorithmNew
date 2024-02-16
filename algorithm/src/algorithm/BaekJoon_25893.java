package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : The movie “Magnificent 7” has become a western classic.
	Well, this year we have 10 coaches training the UCF programming teams and once you meet them, you’ll realize why they are called the “Majestic 10”! The number 10 is actually special in many different ways.
	For example, in basketball, they keep track of various statistics (points scored, rebounds, etc.) and if a player has 10+ (10 or more) in a particular stat, they call it a double.

	Given three stats for a basketball player, you are to determine how many doubles the player has, i.e., how many of the stats are greater than or equal to 10.

	input
	4
	5 0 8
	30 10 50
	20 5 20
	5 100 6

	output
	5 0 8
	zilch

	30 10 50
	triple-double

	20 5 20
	double-double

	5 100 6
	double

	Solution : 1. 단순한게 최고!
 */

public class BaekJoon_25893 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());
			Integer c = Integer.parseInt(st.nextToken());
			System.out.println(a + " " + b + " " + c);
			if (a < 10 && b < 10 && c < 10) {
				System.out.println("zilch");
			} else if (a >= 10 && b >= 10 && c >= 10) {
				System.out.println("triple-double");
			} else if ((a >= 10 && b < 10 && c < 10) || (b >= 10 && a < 10 && c < 10)
					|| (c >= 10 && a < 10 && b < 10)) {
				System.out.println("double");
			} else if ((a >= 10 && b >= 10 && c < 10) || (a >= 10 && b < 10 && c >= 10)
					|| (a < 10 && b >= 10 && c >= 10)) {
				System.out.println("double-double");
			}
			System.out.println();
		}
	}
}