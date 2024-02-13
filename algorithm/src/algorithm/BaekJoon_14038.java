package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Each player in a tournament plays six games. There are no ties. The tournament director places the players in groups based on the results of games as follows:

	if a player wins 5 or 6 games, they are placed in Group 1;
	if a player wins 3 or 4 games, they are placed in Group 2;
	if a player wins 1 or 2 games, they are placed in Group 3;
	if a player does not win any games, they are eliminated from the tournament.
	Write a program to determine which group a player is placed in

	input
	W
	L
	W
	W
	L
	W

	output
	2

	Solution : 1. 그룹을 잘못 지정해서 오류가 났었다. 단순한 케이스 문제
 */

public class BaekJoon_14038 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer sum = 0;
		for(int i=0; i<6; i++) {
			String str = br.readLine();
			if(str.equals("W")) sum++;
		}

		if(sum > 4) {
			System.out.println("1");
		} else if(sum > 2) {
			System.out.println("2");
		} else if(sum > 0) {
			System.out.println("3");
		} else {
			System.out.println("-1");
		}
	}
}