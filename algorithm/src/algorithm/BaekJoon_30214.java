package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Travis was recently saddled with writing the easy problem for a competitive programming contest aimed at high school students. 
	Writing an easy problem is a bit of a challenge for Travis; 
	a problem labeled as “Medium Difficulty Level” by Travis typically ends up being the hardest problem of the set!

	But this time things were different. When the contest was over, Travis was happy that everyone solved his problem. 
	However, some of the other judges informed Travis a problem is easy only if at least half of the contestants 
	solve the problem in the first half of the contest.

	Travis has some data on his problem, and now he wants to determine: was his problem truly easy?

	In programming competitions, the term “solves” is used to refer to the number of correct submissions for a problem, i.e., 
	that many contestants solved the problem.

	Given the number of solves for Travis’s problem at the end of the first half and at the end of the contest, 
	determine whether at least half the people solved the problem in the first half. 
	Note that solves at the end of the contest includes solves of the first half as well.

	input
	10 20

	output
	E

	Solution : 1. 소숫점이 걸리긴 하겠지만.. 그냥 올림으로 처리해주면 된다. 그러면 이상인 경우는 없으니..
*/

public class BaekJoon_30214 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double S1 = Integer.parseInt(st.nextToken());
		double S2 = Integer.parseInt(st.nextToken());

		if(S1 >= Math.ceil(S2/2)) {
			System.out.println("E");
		} else {
			System.out.println("H");
		}

	}
}
