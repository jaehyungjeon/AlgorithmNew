package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Bath’s annual Christmas market runs from the 23rd of November 2017 until the 10th of December 2017. During this time, the market will occupy the entire square courtyard of Bath Abbey.
	To brighten things up at night, a single long strand of cheerful festive lights will be run along all four equally long edges of the courtyard.
	You will be in charge of buying the electrical wiring to which the lights will be affixed. How much will you need to use to outline the whole Christmas market with festive lights?

	input
	64

	output
	1234

	Solution : 1. 소숫점 밑자리는 반올림이나 처리 없이 그대로 내보내면 되는 문제였네?
*/

public class BaekJoon_15610 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Math.sqrt(Long.parseLong(br.readLine())) * 4);
	}
}