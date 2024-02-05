package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 영국에는 스티븐 제라드라는 전설의 야바위꾼이 있다. 영국으로 여행을 떠난 윤성이는 스티븐 제라드를 만나게 되었다.

	이 전설의 야바위꾼이 진행하는 야바위는 널리 알려진 방식과 동일하다. 
	\(3\)개의 컵과 하나의 공을 사용해 임의의 한 컵에 공을 넣고 무작위로 컵들의 위치를 바꾼다. 야바위꾼이 정한 특정 순간에 위치 변경을 멈추게 되는데 그 순간 관객이 공의 위치를 찾으면 돈을 받을 수 있다. 스티븐 제라드가 공의 위치를 찾았을 때 베팅한 돈의 
	\(10\)배를 주겠다 제안하자 윤성이는 솔깃해져 게임에 참여하게 되었다.

	전설의 야바위꾼의 빠른 손놀림에 윤성이는 단 한번도 공의 위치를 찾지 못했고, 결국 윤성이는 배팅을 계속하다 지쳐 자리를 뜨게 되었다. 윤성이가 자리를 뜨기 전까지 잃은 돈을 계산하는 프로그램을 작성하자.

	input
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10
	-1

	output
	55

	Solution : 1. 단순한 합계 문제이며, 정수의 범위가 Integer 안으로 해결되기 때문에 쉽게 구할 수 있다.
*/

public class BaekJoon_23795 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		while(true) {
			Integer value = Integer.parseInt(br.readLine());
			if(value == -1) break;
			else {
				sum += value;
			}
		}

		System.out.println(sum);
	}
}