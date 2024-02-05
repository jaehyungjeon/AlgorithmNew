package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 아무래도 우리 팀 다리우스가 고수인 것 같다. 그의 
	$K/D/A$를 보고 그가 「진짜」인지 판별해 보자. $K+A < D$이거나, $D = 0$이면 그는 「가짜」이고, 그렇지 않으면 「진짜」이다.

	input
	0/5/3

	output
	hasu

	Solution : 1. 단순한 케이스문
*/

public class BaekJoon_20499 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split("/");
		if(Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) < Integer.parseInt(arr[1]) || Integer.parseInt(arr[1]) == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}
	}
}