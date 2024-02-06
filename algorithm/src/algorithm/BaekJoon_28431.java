package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
	Question : 양말 5개가 주어집니다. 각 양말에는 숫자가 하나씩 쓰여있습니다. 같은 숫자가 쓰인 양말 두 개를 모으면 양말 한 쌍이 됩니다.
	쌍을 만들 수 있는 양말을 두 개씩 두 쌍 빼면 남는 양말에 쓰인 숫자는 무엇인가요?

	input
	6
	8
	6
	3
	8

	output
	3

	Solution : 1. 더 간단한 방법이 있을지도 모르지만... Map에서 %2한 값이 1인걸 추출하면 될 것이라 판단하였다.
*/

public class BaekJoon_28431 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<5; i++) {
			Integer val = Integer.parseInt(br.readLine());
			map.put(val, map.getOrDefault(val, 0)+1);
		}

		for(Integer a : map.keySet()) {
			if(map.get(a)%2 == 1) System.out.println(a);
		}
	}
}