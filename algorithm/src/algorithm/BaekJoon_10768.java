package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 2월 18일은 올해 CCC에 있어서 특별한 날이다.

	사용자로부터 정수인 월과 일을 입력받아 날짜가 2월 18일인지 전인지 후인지를 출력하는 프로그램이다.

	만약 날짜가 2월 18일 전이면, "Before"을 출력한다. 만약 날짜가 2월 18일 후면, "After"을 출력한다. 만약 2월 18일이라면 "Special" 을 출력한다.

	input
	1
	7

	output
	Before

	Solution : 1. 2월보다 적을 때, 2월일때, 2월을 초과했을 때의 케이스로 나눠준다.
*/

public class BaekJoon_10768 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer month = Integer.parseInt(br.readLine());
		Integer day = Integer.parseInt(br.readLine());

		if(month < 2) {
			System.out.println("Before");
		} else if(month == 2) {
			if(day > 18) {
				System.out.println("After");
			} else if(day == 18) {
				System.out.println("Special");
			} else {
				System.out.println("Before");
			}
		} else {
			System.out.println("After");
		}
	}
}