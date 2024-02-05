package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 마음씨 착한 곰곰이는 임스에게 치킨 기프티콘을 여러 번 선물했다.
	기프티콘이 있다는 사실을 잊고 있던 임스는 치킨 댄스를 추는 곰곰이를 보고 그 사실이 생각났다.
	치킨 기프티콘을 선물받은 횟수 $N$과 선물의 남은 유효기간이 주어질 때, 임스가 사용할 기프티콘의 개수를 구하시오.
	임스는 기프티콘을 아껴 사용하기 위해 유효기간이 90일 이하로 남은 기프티콘만 사용할 것이다.

	input
	3
	D-86
	D-8
	D-6

	output
	3

	Solution : 1. 여러 방법이 있지만 나는 간단하게 replace로 치환해서 사용하였다.
 */

public class BaekJoon_26068 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		Integer useYn = 0;

		for(int i=0; i<count; i++) {
			Integer Dday = Integer.parseInt(br.readLine().replace("D-", ""));
			if(Dday <= 90) {
				useYn++;
			}
		}

		System.out.println(useYn);
	}
}