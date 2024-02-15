package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : A volcano has recently erupted in Geldingadalur, Iceland. Fortunately this eruption is relatively small,
	and---unlike the infamous Eyjafjallajökull eruption---is not expected to cause delayed international flights or global outrage.

	There is some concern about the magmatic gas that has been released as part of the eruption, as it could pose danger to human populations in the surrounding area.
	Scientists have estimated the total amount of gas emitted, which, due to lack of wind, has spread out uniformly across a circular area around the centre of the volcano.
	The authorities have evacuated the area, and would now like to close it off by surrounding the perimeter with barrier tape.

	input
	50

	output
	25.066282746

	Solution : 1. 20352와 동일한 문제
*/

public class BaekJoon_21335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double num = Double.parseDouble(br.readLine());
		System.out.println(Math.pow(num * Math.PI, 0.5) * 2);
	}
}