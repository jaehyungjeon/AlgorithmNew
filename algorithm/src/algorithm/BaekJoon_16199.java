package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 한국에서 나이는 총 3가지 종류가 있다.

	만 나이: 국제적인 표준 방법이다. 한국에서도 법에서는 만 나이만을 사용한다.
	세는 나이: 한국에서 보통 나이를 물어보면 세는 나이를 의미한다.
	연 나이: 법률에서 일괄적으로 사람을 구분하기 위해서 사용하는 나이이다.
	만 나이는 생일을 기준으로 계산한다. 어떤 사람이 태어났을 때, 그 사람의 나이는 0세이고, 생일이 지날 때마다 1세가 증가한다. 예를 들어, 생일이 2003년 3월 5일인 사람은 2004년 3월 4일까지 0세이고, 2004년 3월 5일부터 2005년 3월 4일까지 1세이다.

	세는 나이는 생년을 기준으로 계산한다. 어떤 사람이 태어났을 때, 그 사람의 나이는 1세이고, 연도가 바뀔 때마다 1세가 증가한다. 예를 들어, 생일이 2003년 3월 5일인 사람은 2003년 12월 31일까지 1세이고, 2004년 1월 1일부터 2004년 12월 31일까지 2세이다.
	연 나이는 생년을 기준으로 계산하고, 현재 연도에서 생년을 뺀 값이다. 예를 들어, 생일이 2003년 3월 5일인 사람은 2003년 12월 31일까지 0세이고, 2004년 1월 1일부터 2004년 12월 31일까지 1세이다.
	어떤 사람의 생년월일과 기준 날짜가 주어졌을 때, 기준 날짜를 기준으로 그 사람의 만 나이, 세는 나이, 연 나이를 모두 구하는 프로그램을 작성하시오.

	input
	2003 3 5
	2003 4 5

	output
	0
	1
	0

	Solution : 1. 만나이 / 일반나이 / 연나이를 차례대로 구한다.
			   2. 구할때 연도만 차감해주면 된다.
 */

public class BaekJoon_16199 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstYear = Integer.parseInt(st.nextToken());
		int firstMonth = Integer.parseInt(st.nextToken());
		int firstDay = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int secondYear = Integer.parseInt(st.nextToken());
		int secondMonth = Integer.parseInt(st.nextToken());
		int secondDay = Integer.parseInt(st.nextToken());

		int yearAge = secondYear - firstYear;

		int diffYear = 0;
		if(firstDay > secondDay) {
			secondMonth -= 1;
		}

		if(firstMonth > secondMonth) {
			secondYear -= 1;
		}

		diffYear = secondYear - firstYear;

		System.out.println(diffYear);
		System.out.println(yearAge+1);
		System.out.println(yearAge);
	}
}