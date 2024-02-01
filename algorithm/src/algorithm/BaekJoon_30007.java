package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : ”꼬불꼬불 꼬불꼬불 맛좋은 라면 라면이 있기에 세상 살맛나 하루에 열개라도 먹을 수 있어 후루룩 짭짭 후루룩 짭짭 맛좋은 라면”

	예찬이는 라면을 매우 좋아한다. 선린 최고의 라면 애호가답게, 예찬이는 한 끼에도 라면 여러 개를 흡입하고는 한다.

	평소 라면을 가장 맛있게 끓일 수 있는 물의 양이 궁금했던 예찬이는 오랜 실험 끝에 마침내 아래와 같은 라면 공식을 만드는 데 성공했다.

	$$W_i=A_i(X_i - 1)+B_i$$ 

	단, $W_i$는 필요한 물의 양, $A_i$는 라면 계수, $B_i$는 기본 물의 양, $X_i$는 끓일 라면 수를 나타낸다.

	예찬이가 라면을 끓이는 횟수 $N$과 $i$ $(1 \leq i \leq N)$번째로 라면을 끓일 때의 라면 계수 $A_i$, 기본 물의 양 $B_i$, 끓일 라면 수 
	$X_i$가 주어질 때, 예찬이를 위해 라면 공식에 따라 필요한 물의 양 $W_i$을 계산해 보자.

	input
	2
	500 550 4
	450 500 7

	output
	2050
	3200

	Solution : 1. 단순한 수학공식 계산
*/

public class BaekJoon_30007 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int Ai = Integer.parseInt(st.nextToken());
			int Bi = Integer.parseInt(st.nextToken());
			int Xi = Integer.parseInt(st.nextToken());

			System.out.println(Ai*(Xi-1) + Bi);
		}
	}
}
