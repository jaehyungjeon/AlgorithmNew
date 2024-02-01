package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 스타는 안에 별이 담긴 기계장치를 보았다. 기계장치 내부를 볼 수 없어 별을 구경할 순 없었지만, 기계장치에는 별빛의 파장을 알려주는 계기판이 있었다. 
	계기판에 표시된 파장의 값을 토대로 스타는 별의 색을 알아낼 수 있었다. 스타가 알아낸 별의 색은 무엇이었을까?

	색상별 파장의 범위는 다음과 같다.
	
	빨간색: 620nm 이상 780nm 이하
	주황색: 590nm 이상 620nm 미만
	노란색: 570nm 이상 590nm 미만
	초록색: 495nm 이상 570nm 미만
	파란색: 450nm 이상 495nm 미만
	남색: 425nm 이상 450nm 미만
	보라색: 380nm 이상 425nm 미만

	input
	627

	output
	Red

	Solution : 1. 단순한 if문..
*/

public class BaekJoon_30676 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		if(num >= 620) {
			System.out.println("Red");
		} else if(num >= 590) {
			System.out.println("Orange");
		} else if(num >= 570) {
			System.out.println("Yellow");
		} else if(num >= 495) {
			System.out.println("Green");
		} else if(num >= 450) {
			System.out.println("Blue");
		} else if(num >= 425) {
			System.out.println("Indigo");
		} else if(num >= 380) {
			System.out.println("Violet");
		}
	}
}
