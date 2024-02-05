package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 브실이는 이제 막 체스에 입문한 체스 초보이다. 브실이는 아직 초보이기 때문에 체스판의 기물 점수 계산을 잘하지 못한다.

	체스판의 기물 점수는 백의 기물 점수 합에서 흑의 기물 점수 합을 뺀 값이고, 기물에 해당하는 킹, 폰, 나이트, 비숍, 룩, 퀸의 기물 점수는 각각 
	$0$, $1$, $3$, $3$, $5$, $9$점이다.

	체스 초보 브실이를 위해 체스판의 기물 점수 계산을 도와주자!

	input
	rnbqkbnk
	pppppppp
	........
	........
	........
	........
	PPPPPPPP
	RNBQKBNK

	output
	0

	Solution : 1. 케이스를 나눔.
*/

public class BaekJoon_29725 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer sum = 0;
		for(int i=0; i<8; i++) {
			String row = br.readLine();
			for(String s : row.split("")) {
				sum += chessPoint(s);
			}
		}

		System.out.println(sum);
	}

	private static Integer chessPoint(String chess) throws Exception {
		switch(chess) {
			case "." :
				return 0;
			case "k" :
				return 0;
			case "K" :
				return 0;
			case "P" :
				return 1;
			case "p" :
				return -1;
			case "N" :
				return 3;
			case "n" :
				return -3;
			case "B" :
				return 3;
			case "b" :
				return -3;
			case "R" :
				return 5;
			case "r" :
				return -5;
			case "Q" :
				return 9;
			case "q" :
				return -9;
			default :
				return 0;
		}
	}
}