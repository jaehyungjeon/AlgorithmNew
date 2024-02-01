package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : D2는 For Developers, By Developers의 약자로, 개발자들을 위해 개발자들이 직접 만들어 가고 있는 네이버 개발자 지원 프로그램입니다. 
	네이버가 축적한 기술과 지식을 공유하고, 외부 개발자들을 지원해 대한민국 개발자 역량 강화를 이끌고, 이를 통해 업계 전체와 네이버가 함께 성장하는 선순환 구조를 만들고자 합니다.

	사실 네이버의 개발자 지원은 오랜 기간 꾸준히 이어져 왔습니다. 
	개발자 컨퍼런스 DEVIEW를 비롯, 오픈 소스와 개발 도구 공개, 학회 및 커뮤니티 지원 등 여러 지원 프로그램이 있었습니다. 
	이런 다양한 프로그램을 하나로 통합한 것이 바로 Naver D2입니다.

	D2 CAMPUS 프로그램은 다른 학생 개발자에게 개발 지식을 공유할 수 있도록 실력 있는 SW 동아리, 소모임, 학회, 세미나, 컨퍼런스를 지원합니다.

	숭고한 알고리즘 대회를 운영하게 된 성서는 참가자들에게 상금을 주기 위해 여러 기업에 후원 요청을 보냈고, D2 CAMPUS를 통해 대회 상금을 지원받게 되었다.

	상금을 사비로 부담하지 않아도 돼서 감사한 성서는 검색창에 N 또는 n이 입력되면 Naver D2가 자동 완성되도록 설정하고 싶다. 
	알파벳 하나를 입력받아서 그 알파벳이 N 또는 n이면 Naver D2를 출력하고, 아니라면 Naver Whale을 출력하는 프로그램을 작성해보자.

	input
	N

	output
	Naver D2

	Solution : 1. String 붙여주기만 하면 됨.
*/

public class BaekJoon_15963 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String compareString = br.readLine();
		StringBuilder sb = new StringBuilder("Naver ");
		if(compareString.toUpperCase().equals("N")) {
			sb.append("D2");
		} else {
			sb.append("Whale");
		}

		System.out.println(sb.toString());
	}
}
