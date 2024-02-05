package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 준영이는 선린인터넷고등학교에서 1학기를 마치고 성적표를 받았다. 아직 성적처리가 완벽하게 끝나지 않아서 등수만 나오고 등급은 나오지 않은 상태이다. 계산하는 것이 너무나 귀찮은 준영이를 위해 그의 등급을 계산해주자.

	선린인터넷고등학교에는 $N$명의 학생과 $K$개의 과목이 있으며, 모든 학생은 $K$개의 과목을 전부 수강한다. 준영이의 등급은 백분율을 기준으로 부여되며, 백분율은 해당 과목에서 준영이가 받은 등수에 $100$을 곱한 뒤 학생 수로 나눈 몫과 같다. 
	어떠한 과목에서의 백분율이 $P$라 할 때, 준영이가 특정 등급을 받기 위한 조건은 다음과 같다.

	등급	조건
	1등급	 $0 \leq P \leq 4$ 
	2등급	 $4 < P \leq 11$ 
	3등급	 $11 < P \leq 23$ 
	4등급	 $23 < P \leq 40$ 
	5등급	 $40 < P \leq 60$ 
	6등급	 $60 < P \leq 77$ 
	7등급	 $77 < P \leq 89$ 
	8등급	 $89 < P \leq 96$ 
	9등급	 $96 < P \leq 100$ 
 
	$i$ ($1 \le i \le K$)번째 과목에서 준영이는 $G_{i}$등이었다. 
	$G_1$, $G_2$, $\cdots$, $G_K$가 주어질 때, 준영이를 위해 각 과목에서 받은 등급 $D_1$, $D_2$, $\cdots$, $D_K$ ($1 \leq D_i \leq 9$)를 구해주자.

	input
	255 5
	30 37 50 7 35

	output
	2 3 3 1 3

	Solution : 1. 케이스로 잘 쪼개주면 된다.
*/

public class BaekJoon_30008 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer N = Integer.parseInt(st.nextToken());
		Integer K = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<K; i++) {
			Integer score = Integer.parseInt(st.nextToken());
			sb.append(grade((score*100)/N)).append(" ");
		}

		System.out.println(sb.toString());
	}

	private static String grade(Integer per) throws Exception {
		if(per > 96) {
			return "9";
		} else if(per > 89) {
			return "8";
		} else if(per > 77) {
			return "7";
		} else if(per > 60) {
			return "6";
		} else if(per > 40) {
			return "5";
		} else if(per > 23) {
			return "4";
		} else if(per > 11) {
			return "3";
		} else if(per > 4) {
			return "2";
		} else {
			return "1";
		}
	}
}