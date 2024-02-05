package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Innovations for Humanity, Mobility for Tomorrow
	현대 모비스의 MOBIS는 어떤 뜻을 가지고 있을까?

	MOBIS는 기존에는 Mobile + System의 합성어에서 시작되었지만, 현재는 "Mobility Beyond Integrated Solution" 라는 의미로 재정의 되었다.

	이는 사용자의 경험을 혁신하고, 고객의 요구에 최적화된 통합 솔루션, 그 이상의 가치를 전달하는 모빌리티 플랫폼 프로바이더로 도약하겠다는 뜻을 가지고 있다.
	이 뜻에 매료된 진익이는 스티커 용지에 인쇄되어 있는 문자들 중 'M', 'O', 'B', 'I', 'S' 만을 오리고 적절히 배치하여 노트북에 MOBIS를 붙여놓고자 한다.
	스티커 용지에 인쇄되어 있는 문자열이 주어진다. 이 문자들을 이용해 MOBIS를 만들 수 있을까?

	input
	MOIISB

	output
	YES

	Solution : 1. contains 밖에 생각이 안나네.. 
 */

public class BaekJoon_28074 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(!str.contains("M") || !str.contains("O") || !str.contains("B") || !str.contains("I") || !str.contains("S")) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}