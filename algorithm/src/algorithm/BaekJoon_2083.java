package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 올 골드 럭비 클럽의 회원들은 성인부 또는 청소년부로 분류된다.

	나이가 17세보다 많거나, 몸무게가 80kg 이상이면 성인부이다. 그 밖에는 모두 청소년부이다. 클럽 회원들을 올바르게 분류하라.

	input
	Joe 16 34
	Bill 18 65
	Billy 17 65
	Sam 17 85
	# 0 0

	output
	Joe Junior
	Bill Senior
	Billy Junior
	Sam Senior

	Solution : 1. 
*/

public class BaekJoon_2083 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			Integer age = Integer.parseInt(st.nextToken());
			Integer weight = Integer.parseInt(st.nextToken());

			if(name.equals("#")) break;
			else sb.append(name).append(" ");

			if(age > 17 || weight >= 80) {
				sb.append("Senior");
			} else {
				sb.append("Junior");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}
