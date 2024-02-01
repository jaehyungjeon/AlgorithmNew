package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : JOI회사에서는 방에 들어가기 위해 입실 기록을 입력할 때 알파벳으로 이름을 입력한다. 그런데, 컴퓨터에 오류가 나서 대문자 소문자가 섞여버려 입실 기록이 읽기 힘들어졌다.
	JOI회사의 입실 기록을 읽기 쉽게 하기 위해서 기록된 이름을 모두 소문자로 변환하는 프로그램을 작성하라. 단, 입실 기록에는 같은 이름의 사람이 생기기도 한다.

	input
	3
	WatanabE
	ITO
	YamaMoto

	output
	watanabe
	ito
	yamamoto

	Solution : 1. 
*/

public class BaekJoon_5524 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			System.out.println(br.readLine().toLowerCase());
		}
	}
}