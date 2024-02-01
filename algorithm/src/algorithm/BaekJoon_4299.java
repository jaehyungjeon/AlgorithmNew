package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 텍스트에서 줄을 입력받은 뒤, 줄 번호를 출력하는 프로그램을 작성하시오.

	input
	5
	Lionel Cosgrove
	Alice
	Columbus and Tallahassee
	Shaun and Ed
	Fido

	output
	1. Lionel Cosgrove
	2. Alice
	3. Columbus and Tallahassee
	4. Shaun and Ed
	5. Fido

	Solution : 1. StringBuilder가 빨라서 썼다.
*/

public class BaekJoon_4299 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			sb.append(i+1).append(". ").append(br.readLine()).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
