package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 브실이의 친구들이 다 GOSU가 되자 자신과 실력이 비슷한 새로운 친구들을 사귀려고 한다. 주변을 아무리 둘러봐도 전부 GOSU뿐인 이곳에서 브실이는 겨우겨우 자신과 실력이 비슷한 사람들을 모았다. 
	놀랍게도 이 사람들이 푼 문제 수는 전부 다르며, 푼 문제 수가 적은 순서대로 배열했을 시 각각 $A, A+1, \cdots, B$ 문제를 풀었다고 한다.

	새로운 친구를 사귈 생각에 들떠 있던 브실이는 이내 차가운 현실과 마주쳤다. 이들 중 몇 명은 브실이와 푼 문제 차이가 너무 많이 났기 때문이다. 그래서 브실이는 본인과 푼 문제 수 차이가 
	$X$보다 작거나 같은 사람만 친구의 자격을 갖추었다고 생각한다. 브실이가 푼 문제 수가 $K$개일 때, 브실이의 친구가 될 수 있는 사람의 수를 구해보자!

	input
	10 100
	50 10

	output
	21

	Solution : 1. 풀이 문제의 갯수가 범위안에 드는지 확인 후 일치하면 count를 증가시켜주면 되는 문제.
*/

public class BaekJoon_29736 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Integer K = Integer.parseInt(st.nextToken());
		Integer X = Integer.parseInt(st.nextToken());

		Integer count =0 ;
		for(int i=A; i<=B; i++) {
			if(i >= K-X && i <= K+X) {
				count++;
			}
		}

		System.out.println(count == 0 ? "IMPOSSIBLE" : count);
	}
}