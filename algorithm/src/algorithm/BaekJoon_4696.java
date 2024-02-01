package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Robert the chapman (a medieval traveling merchant) made regular trips between his home village and 
	St. Ives to peddle his cloth, ribbons, and needles. On one such trip he encountered a curious procession:

	As I was traveling to St. Ives
	I met a man with seven wives.
	Every wife had seven sacks.
	Every sack had seven cats.
	Every cat had seven kits.
	Kits, cats, sacks, wives -
	How many were traveling to St. Ives?
	
	The answer to this classic ancient riddle is ’one’. Robert was traveling to St. Ives. 
	The others were all traveling away from St. Ives. However, if we prefer to ask the question of how many were traveling from St. Ives,
	we can add up:
	
	1 man
	7 wives
	7*7 sacks
	7*7*7 cats
	7*7*7*7 kittens
	for a total of 2801.
	
	On his next trip to St. Ives, Robert met the same man, this time accompanied by 3 wives, each
	with 3 sacks, and so on. Becoming curious about what seemed to be a bizarre village ritual of some kind, 
	Robert kept track of how many traveled with the man each time he encountered him during the subsequent year.
	
	On average, what was the size of the processions that Robert encounter on his trips to St. Ives?

	input
	7
	1
	2.5
	0

	output
	2801.00
	5.00
	64.44

	Solution : 1. pow를 이용하여 합산값을 구하고 소숫점 둘째자리까지 반올림 처리.
			   2. String.format을 이용하면 자동 round 처리
*/

public class BaekJoon_4696 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while(true) {
			double sum = 0;
			String str = br.readLine();
			if(str.equals("0")) break;
			else {
				Double num = Double.parseDouble(str);
				for(int i=1; i<=4; i++) {
					sum += Math.pow(num, i);
				}
				sum += 1;
			}
			sb.append(String.format("%.2f", sum)).append("\n");
		}

		System.out.println(sb.toString());
	}
}
