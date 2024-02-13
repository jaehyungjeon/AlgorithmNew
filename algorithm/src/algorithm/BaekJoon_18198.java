package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Alice and Barbara played some friendly games of one-on-one basketball after work, and you agreed to help them keep score. The rules of the game were simple:

	Each successful shot by a player earns them either one or two points;
	The first player to eleven points wins, with one exception;
	If the score is tied 10–10, the previous rule is replaced by a “win by 2” rule: the first player to lead the other by at least two points wins.
	So for example, 11–7, 9–11, and 14–12 are possible final scores (but not 14–13).

	Whenever Alice or Barbara scored points, you jotted down an A or B (indicating a score by Alice or by Barbara) followed by a 1 or 2 (the number of points scored).
	You have some records of the games Alice and Barbara played in this format, but do not remember who won each game. Can you reconstruct the winner from the game record?

	input
	A2B1A2B2A1A2A2A2

	output
	A

	Solution : 1. 규칙에 따른 계산
 */

public class BaekJoon_18198 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer Ateam = 0;
		Integer Bteam = 0;
		for (int i = 0; i < str.length(); i += 2) {
			char team = str.charAt(i);
			if (team == 'A') {
				Ateam += Integer.parseInt(String.valueOf(str.charAt(i + 1)));
			} else if (team == 'B') {
				Bteam += Integer.parseInt(String.valueOf(str.charAt(i + 1)));
			}
			// 점수 비교
			if (Ateam > 10 || Bteam > 10) {
				if (Ateam - 1 != Bteam && Bteam - 1 != Ateam) {
					if (Ateam < Bteam) {
						System.out.println("B");
						break;
					} else if (Ateam > Bteam) {
						System.out.println("A");
						break;
					}
				}
			}
		}
	}
}