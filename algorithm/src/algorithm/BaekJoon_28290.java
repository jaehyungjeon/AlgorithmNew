package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 평소 리듬게임을 즐겨하는 대소고 친구들은 서로 다른 타법을 가지고 있다.

	타법은 안밖, 0밖안, 계단, 역계단이 있다.

	문자열 항목은 각 타법에서 나올 수 있는 문자열을 의미한다.
	타법	설명	문자열
	안밖	검지 손가락에서 새끼손가락 순서대로 키보드를 치는 방법.	"fdsajkl;" 또는 "jkl;fdsa"
	밖안	새끼손가락에서 검지 손가락 순서대로 키보드를 치는 방법.	"asdf;lkj" 또는 ";lkjasdf"
	계단	왼쪽 새끼손가락에서 오른쪽 새끼손가락 순서대로 키보드를 치는 방법.	"asdfjkl;"
	역계단	오른쪽 새끼손가락에서 왼쪽 새끼손가락 순서대로 키보드를 치는 방법.	";lkjfdsa"
	하루는 대소고 친구가 찾아와 컴퓨터를 켠 뒤 메모장에 어떤 문자를 남겨 놓았다.

	asdfjkl;
	평소 리듬게임을 자주 하던 changwook987은 메모장에 문자를 쓴 친구가 계단 타법임을 눈치챘다.

	친구의 타법을 알아보는 것이 재밌어진 changwook987은 다른 친구를 불러 메모장에 자신의 타법대로 입력해 보라고 했다.

	다른 친구가 입력한 문자를 보고 무슨 타법으로 쳤는지 알아보자.

	input
	fdsajkl;

	output
	in-out

	Solution : 1. muiti-case는 안돼서 쪼개서 작성함.
*/

public class BaekJoon_28290 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		switch(str) {
			case "fdsajkl;" :
				System.out.println("in-out");
				break;
			case "jkl;fdsa" :
				System.out.println("in-out");
				break;
			case "asdf;lkj" :
				System.out.println("out-in");
				break;
			case ";lkjasdf" :
				System.out.println("out-in");
				break;
			case "asdfjkl;" :
				System.out.println("stairs");
				break;
			case ";lkjfdsa" :
				System.out.println("reverse");
				break;
			default :
				System.out.println("molu");
				break;
		}
	}
}