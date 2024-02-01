package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 양의 정수 $W$, $H$가 주어진다. 
	밑변의 길이가 $W$이고, 높이가 $H$인 삼각형의 넓이를 구하시오.

	input
	1 1

	output
	0.5

	Solution : 1. 밑 * 높 / 2
			   2. double을 String format으로 치환.
*/

public class BaekJoon_29751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		double width = Integer.parseInt(st.nextToken());
		double height = Integer.parseInt(st.nextToken());

		System.out.println(String.format("%.1f", (width * height) / 2));
	}
}
