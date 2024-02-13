package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : At the Van Abbemuseum of modern and contemporary art in Eindhoven, we always look to present our muses in the most interesting way possible. Sometimes we have our work cut out for us.
	Today we are exploring whether we can modify one of our perfectly-square picture frames (such as the one shown in Figure C.1) to include an electrical filament.
	The purpose of this filament is so that the image can set itself alight at some opportune and hilarious moment—for example, in the middle of a sale by auction.
	You will be responsible for buying the filament to run around the entire perimeter of the artwork. How many centimetres will you need to obtain?

	input
	64

	output
	1234

	Solution : 1. 15610과 동일한 문제
*/

public class BaekJoon_16660 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Math.sqrt(Long.parseLong(br.readLine())) * 4);
	}
}