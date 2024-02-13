package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : You record all of the scoring activity at a basketball game. Points are scored by a 3-point shot, a 2-point field goal, or a 1-point free throw.
	You know the number of each of these types of scoring for the two teams: the Apples and the Bananas. Your job is to determine which team won, or if the game ended in a tie.

	input
	10
	3
	7
	8
	9
	6

	output
	B

	Solution : 1. 단순 케이스문
*/

public class BaekJoon_17009 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer teamApples = 0;
		Integer teamBananas = 0;
		for(int i=0; i<3; i++) {
			Integer value = Integer.parseInt(br.readLine());
			switch(i) {
			case 0 : 
				teamApples += (value * 3);
				break;
			case 1 :
				teamApples += (value * 2);
				break;
			case 2 :
				teamApples += value;
				break;
			}
		}

		for(int i=0; i<3; i++) {
			Integer value = Integer.parseInt(br.readLine());
			switch(i) {
			case 0 : 
				teamBananas += (value * 3);
				break;
			case 1 :
				teamBananas += (value * 2);
				break;
			case 2 :
				teamBananas += value;
				break;
			}
		}

		if(teamApples.equals(teamBananas)) {
			System.out.println("T");
		} else if(teamApples > teamBananas) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
	}
}