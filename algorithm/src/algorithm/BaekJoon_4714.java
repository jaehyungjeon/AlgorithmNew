package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : After several months struggling with a diet, Jack has become obsessed with the idea of weighing less. 
	In an odd way, he finds it very comforting to think that, if he had simply had the luck to be born on a different planet, 
	his weight could be considerably less.

	Of course, the planets are far out of reach, but even the Earth’s moon would yield a dramatic weight loss. 
	Objects on the moon weight only 0.167 of their weight on Earth.

	input
	100.0
	12.0
	0.12
	120000.0
	-1.0

	output
	Objects weighing 100.00 on Earth will weigh 16.70 on the moon.
	Objects weighing 12.00 on Earth will weigh 2.00 on the moon.
	Objects weighing 0.12 on Earth will weigh 0.02 on the moon.
	Objects weighing 120000.00 on Earth will weigh 20040.00 on the moon.

	Solution : 1. double로 받고 음수이면 -1로 리턴.. 아닐경우 값 * 0.167 후 소숫점 둘째자리까지 round
			   2. 문장을 만들어주는 메소드를 하나 더 구현하여 반영.
*/

public class BaekJoon_4714 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Double value = Double.parseDouble(br.readLine());
			if(value < 0) break;
			System.out.println(makeToSentence(value));
		}
	}

	private static String makeToSentence(Double value) throws Exception {
		return "Objects weighing ".concat(String.format("%.2f", value)).concat(" on Earth will weigh ").concat(String.format("%.2f", value * 0.167)).concat(" on the moon.");
	}
}
