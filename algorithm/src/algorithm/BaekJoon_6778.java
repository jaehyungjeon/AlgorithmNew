package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Canada Cosmos Control has received a report of another incident. They believe that an alien has illegally entered our space. 
	A person who witnessed the appearance of the alien has come forward to describe the alien’s appearance. It is your role within the CCC to determine which alien has arrived. 
	There are only 3 alien species that we are aware of, described below:

	TroyMartian, who has at least 3 antenna and at most 4 eyes;
	VladSaturnian, who has at most 6 antenna and at least 2 eyes;
	GraemeMercurian, who has at most 2 antenna and at most 3 eyes.

	input
	4
	5

	output
	VladSaturnian

	Solution : 1. 쉬운 케이스 문제
*/

public class BaekJoon_6778 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer antenna = Integer.parseInt(br.readLine());
		Integer eyes = Integer.parseInt(br.readLine());

		if(antenna >=3 && eyes <= 4) {
			System.out.println("TroyMartian");
		}

		if(antenna <=6 && eyes >= 2) {
			System.out.println("VladSaturnian");
		}

		if(antenna <=2 && eyes <= 3) {
			System.out.println("GraemeMercurian");
		}
	}
}