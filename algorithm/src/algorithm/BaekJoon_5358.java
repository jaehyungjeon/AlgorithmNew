package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The PLU football coach must submit to the NCAA officials the names of all players that will be competing in NCAA Division II championship game. 
	Unfortunately his computer keyboard malfunctioned and interchanged the letters ‘i’ and ‘e’. 
	Your job is to write a program that will read all the names and print the names with the correct spelling.

	input
	Alan Pagi
	John Hiesman
	Justen Forsitt
	Phel Semms
	Tem Tibow
	Marshawn Lynch
	Lion Washengton

	output
	Alan Page
	John Heisman
	Justin Forsett
	Phil Simms
	Tim Tebow
	Marshawn Lynch
	Leon Washington

	Solution : 1. EOF를 이용하여 NullPointError를 방지하는 것에 유의!
*/

public class BaekJoon_5358 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null && !str.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			char[] arr = str.toCharArray();

			for(char c : arr) {
				if(c == 'i') {
					sb.append("e");
				} else if(c == 'e') {
					sb.append("i");
				} else if(c == 'I') {
					sb.append("E");
				} else if(c == 'E') {
					sb.append("I");
				} else {
					sb.append(String.valueOf(c));
				}
			}

			System.out.println(sb.toString());
		}
	}
}