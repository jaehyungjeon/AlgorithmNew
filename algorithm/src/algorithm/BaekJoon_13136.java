package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : ACM-ICPC 대회의 대회장은 R행 C열의 직사각형 형태로 좌석이 배치되어 있다. 대회가 시작하기 전에는 참가자들이 아무것도 만지면 안 되기 때문에 진행자는 'Do not touch ANYTHING!!!'을 연신 외친다.
	하지만, 진행자가 성대결절에 걸리면서 'Do not touch ANYTHING!!!'을 외칠 수 없는 처지가 되었다. 따라서 주최측은 CCTV를 설치하여 참가자들을 감시하려고 한다. 이때, 각 CCTV는 N행 N열의 직사각형 영역의 좌석을 촬영할 수 있다.
	모든 좌석을 전부 촬영하도록 CCTV를 배치할 때, 최소 몇 개의 CCTV가 필요할까?

	input
	7 9 3

	output
	9

	Solution : 1. 정수 타입이 굉장히 중요했던 문제
 */

public class BaekJoon_13136 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double R = Double.parseDouble(st.nextToken());
		Double C = Double.parseDouble(st.nextToken());
		Double N = Double.parseDouble(st.nextToken());

		Long RCCTV = (long) Math.ceil(R/N); 
		Long LCCTV = (long) Math.ceil(C/N);

		System.out.println(RCCTV * LCCTV);
	}
}