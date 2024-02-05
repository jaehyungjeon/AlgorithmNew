package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/*
	Question : UCPC 초등학교의 체육대회 날이 다가오고 있다. UCPC 초등학교 1학년 1반의 학생들은 담임 선생님 종서의 지시에 맞춰 특정한 방향을 바라보는 연습을 하고 있다.
	학생들은 초기에 북쪽을 바라보고 있으며, 종서는 다음과 같은 형태의 지시를 총 열 번 내린다:

	우향우: 각 학생은 현재 상태에서 오른쪽으로 $90$도 돈다.
	뒤로 돌아: 각 학생은 현재 상태에서 오른쪽으로 $180$도 돈다.
	좌향좌: 각 학생은 현재 상태에서 왼쪽으로 $90$도 돈다.
	종서는 초등학생들이 지시를 정확하게 이행하는 것이 어렵다는 것을 인지하고, 학생들이 자신의 지시를 성공적으로 따른다면 사탕을 나누어 주기로 했다. 학생들을 도와 담임 선생님 종서의 지시대로 바라보는 방향을 바꾸었을 때, 최종적으로 바라보는 방향을 구해보자.

	input
	1
	2
	3
	1
	2
	3
	1
	2
	3
	1

	output
	W

	Solution : 1. 현재의 인덱스 위치에서 변화되는 지점을 찾아주면 된다. (나머지로)
			   2. 파이썬이 편한데 자바는 귀찮다...
*/

public class BaekJoon_28295 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = Arrays.asList("N", "E", "S", "W");
		String str = "N";
		for(int i=0; i<10; i++) {
			Integer key = Integer.parseInt(br.readLine());
			if(key == 1) str = list.get(((list.indexOf(str)+1) % 4));  
			else if(key == 2) str = list.get(((list.indexOf(str)+2) % 4));
			else if(key == 3) str = list.get(((list.indexOf(str)+3) % 4));
		}

		System.out.println(str);
	}
}