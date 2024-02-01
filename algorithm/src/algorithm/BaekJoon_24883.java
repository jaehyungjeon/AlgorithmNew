package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 카시오 계산기는 만능 계산기이다. 
	시험을 한 번이라도 쳐본 일곽인이라면, 이 카시오의 소중함에 대해서 뼈저리게 느껴보았을 것이다. 
	하지만, 이런 카시오에도 함정이 있다. 바로, 카시오 계산기는 배터리를 통해 돌아간다는 것이다.

	송찬이는 시험을 치다가 갑자기 계산기의 배터리가 나가버렸다. 
	그래서 선생님께 배터리를 달라고 요구했는데, 요구하고 보니 카시오 계산기의 배터리가 어떤 종류인지 말을 안 해버렸다! 과연 선생님은 송찬이가 필요한 배터리 종류를 들고 왔을까?

	input
	1 1

	output
	1

	Solution : 1. 뭐 그냥.. easy
*/

public class BaekJoon_15963 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str1 = st.nextToken();
		String str2 = st.nextToken();

		if(str1.equals(str2)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
