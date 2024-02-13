package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : The Iranian ChamPions Cup (ICPC), the most prestigious football league in Iran, is reaching its end, and people are eagerly waiting for the finals,
	which happened to be between the two most popular Iranian teams, Persepolis and Esteghlal.

	The ICPC finals consist of two matches, with each team competing as the home team in one match.
	The winning team is determined by aggregate score, the sum of the scores of the two matches. For example, if the scores of the two matches are Persepolis 6–0 Esteghlal in the first match,
	and Esteghlal 3–1 Persepolis in the second match, then the aggregate score will be Persepolis 7–3 Esteghlal, meaning that Persepolis is the winner.
	If aggregates are equal, the away goals rule is used to determine the winner, in which case the winner is the team that scored the most goals in the match it played away from home.
	If the result is still equal, a penalty shootout is required.

	Hana, an avid football fan, is trying to figure out various scenarios in which her favorite team wins the finals.
	To this end, she aims to write a program that gets as input the number of goals in the two matches, and decides which team is the winner if it can be derived from the aggregate scores and the away goals rule,
	otherwise declares that the match goes to penalty kicks. You are going to help Hana write such a program.

	input
	3 0
	2 1

	output
	Persepolis

	Solution : 1. 케이스만 잘 분리해주면 됨.
*/

public class BaekJoon_16727 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int homePersepolis = Integer.parseInt(st.nextToken());
		int awayEsteghlal = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int homeEsteghlal = Integer.parseInt(st.nextToken());
		int awayPersepolis = Integer.parseInt(st.nextToken());

		// 점수가 같으면 원정 다득점을 체크
		if(homePersepolis + awayPersepolis == homeEsteghlal + awayEsteghlal) {
			if(awayPersepolis > awayEsteghlal) {
				System.out.println("Persepolis");
			} else if(awayPersepolis < awayEsteghlal) {
				System.out.println("Esteghlal");
			} else {
				System.out.println("Penalty");
			}
		} else {
			if(homePersepolis + awayPersepolis > homeEsteghlal + awayEsteghlal) {
				System.out.println("Persepolis");
			} else if(homePersepolis + awayPersepolis < homeEsteghlal + awayEsteghlal) {
				System.out.println("Esteghlal");
			}
		}
	}
}