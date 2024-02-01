package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
	Question : 한국정보기술진흥원에서는 다양한 세미나가 열린다.

	전문가를 위한 알고리즘, 데이터분석, 인공지능, 사이버보안, 네트워크 세미나뿐만 아니라 예비 창업가를 위한 창업 세미나, 그리고 청소년들을 위한 입시 세미나가 열린다.

	오늘은 위 $7$개 주제의 세미나가 모두 열리는 날이다. 진흥이는 이 중 $N$ ($1 \le N \le 7$) 개의 세미나를 신청했다. 아래의 표를 보고 어느 교실에서 열리는지 알아보자.

	input
	4
	Algorithm
	Network
	CyberSecurity
	Startup

	output
	204
	303
	B101
	501

	Solution : 1. switch-case로 풀어도 되고.. Map으로 풀어도 될듯?
*/

public class BaekJoon_30087 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		HashMap<String, String> classMap = new HashMap<>();
		classMap.put("Algorithm", "204");
		classMap.put("DataAnalysis", "207");
		classMap.put("ArtificialIntelligence", "302");
		classMap.put("CyberSecurity", "B101");
		classMap.put("Network", "303");
		classMap.put("Startup", "501");
		classMap.put("TestStrategy", "105");

		for(int i=0; i<count; i++) {
			System.out.println(classMap.get(br.readLine()));
		}
	}
}