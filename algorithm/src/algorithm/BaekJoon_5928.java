package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Bessie the cow is getting bored of the milk production industry, and wants to switch to an exciting new career in computing. 
	To improve her coding skills, she decides to compete in the on-line USACO competitions. 
	Since she notes that the contest starts on November 11, 2011 (11/11/11), she decides for fun to download the problems and begin coding at exactly 11:11 AM on 11/11/11.

	Unfortunately, Bessie's time management ability is quite poor, so she wants to write a quick program to help her make sure she does not take longer than the 3 hour (180 minute) time limit for the contest. 
	Given the date and time she stops working, please help Bessie compute the total number of minutes she will have spent on the contest.

	input
	12 13 14

	output
	1563

	Solution : 1. -1을 도출하는 조건을 잘 넣어야 오류가 나지 않는다.
*/

public class BaekJoon_5928 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer Day = Integer.parseInt(st.nextToken());
		Integer Hour = Integer.parseInt(st.nextToken());
		Integer Minute = Integer.parseInt(st.nextToken());

		if(Day < 11 || (Day<=11 && Hour < 11) || (Day<=11 && Hour <=11 && Minute < 11)) {
			System.out.println("-1");
		} else {
			if(Minute - 11 < 0) {
				Minute = (Minute + 60) - 11;
				Hour -= 1;
			} else {
				Minute -= 11;
			}

			if(Hour - 11 < 0) {
				Hour = (Hour + 24) - 11;
				Day -= 1;
			} else {
				Hour -= 11;
			}

			Day -= 11;

			System.out.println((Day * 1440) + (Hour * 60) + Minute);
		}
	}
}