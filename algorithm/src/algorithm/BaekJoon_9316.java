package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 당신은 N개의 테스트케이스들에게 반드시 인사를 해야 이 문제를 풀 수 있다.
	N개의 줄에 걸쳐
	"Hello World, Judge i!"
	를 출력하는 프로그램을 만들라. 여기서 i는 줄의 번호이다.

	input
	3

	output
	Hello World, Judge 1!
	Hello World, Judge 2!
	Hello World, Judge 3!

	Solution : 1. 단순 출력문제
 */

public class BaekJoon_9316 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		for(int i=1; i<=count; i++) {
			System.out.println("Hello World, Judge " + i + "!");
		}
	}
}