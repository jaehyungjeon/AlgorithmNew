package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : he atrium of a traditional Roman dormus, much like the atria of today, is a perfectly square room designed for residents and guests to congregate in and to enjoy the sunlight streaming in from above.
	Or, in the case of Britannia, the rain streaming in from above.
	A major problem with traditional Roman architecture, particularly in modern times, is the absence of any kind of effective walls between rooms.
	You have arrived in Italy and now you are going to helpfully rebuild the walls on behalf of the authorities, starting with the atrium of a particularly derelict building you found.
	What length of prefabricated wall section must you bring with you to fully enclose the atrium of the building?

	input
	64

	output
	1234

	Solution : 1. 15610과 동일한 문제
*/

public class BaekJoon_20353 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(Math.sqrt(Long.parseLong(br.readLine())) * 4);
	}
}