package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Redundancy in this world is pointless. Let’s get rid of all redundancy. For example AAABB is redundant. 
	Why not just use AB? Given a string, remove all consecutive letters that are the same.

	input
	3
	ABBBBAACC
	AAAAA
	ABC

	output
	ABAC
	A
	ABC

	Solution : 1. 알파벳이 바뀌는 시점에 StringBuilder에 넣어준다.
			   2. StringBuilder는 for문이 돌때마다 새롭게 초기화 시킨다.
*/

public class BaekJoon_5357 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		for(int i=0; i<count; i++) {
			String str = br.readLine();
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(0));
			for(int j=1; j<str.length(); j++) {
				if(str.charAt(j-1) != str.charAt(j)) {
					sb.append(str.charAt(j));
				}
			}

			System.out.println(sb.toString());
		}
	}
}
