package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 히스토그램은 데이터를 시각적으로 표현한 것이다. 막대로 구성되며 각 막대의 길이는 데이터 양의 크기를 나타낸다. 일부 데이터가 주어지면 히스토그램을 생성하시오.

	input
	5
	1
	3
	4
	6
	2

	output
	=
	===
	====
	======
	==

	Solution : 1. 숫자만큼 = 출력
*/

public class BaekJoon_13752 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			Integer num = Integer.parseInt(br.readLine());
			for(int j=0; j<num; j++) {
				sb.append("=");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}