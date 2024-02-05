package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : 나는 7번의 수능 끝에 한양대학교 23학번으로 입학하게 된 김한양이다. 한양대학교 추가합격 전화를 받고 기뻐서 친구들과 술을 마시며 길을 걷다가 언덕 아래로 굴러 떨어지고 말았다. 깨어나보니 2주가 흘러 있었고, 수강신청까지는 15분밖에 남지 않았다.
	수강신청 홈페이지에 들어갔지만 부상의 후유증으로 학번이 기억나지 않았다. 한양대학교 공지사항을 확인해보니 학번을 생성하는 방법에 대한 안내문이 있었다.

	한양대학교는 Engine of Korea라고 불리는 만큼 학번을 만들 때 특수한 공식을 사용한다. 기본적으로 한양대학교 학번을 알아내기 위해서는 정확한 수능 점수(표준 점수)를 알고 있어야 한다.

	국어 점수가 영어 점수보다 높다면, 두 점수의 차에 인문관의 건물 번호 $508$을 곱해준다. 아니라면, 두 점수의 차에 국제관의 건물 번호 $108$을 곱해준다.
	수학 점수가 탐구 점수보다 높다면, 두 점수의 차에 제1공학관의 건물 번호 $212$를 곱해준다. 아니라면, 두 점수의 차에 ITBT관의 건물 번호 $305$을 곱해준다.
	제2외국어를 응시했다면 제2외국어 점수에 행원파크 건물 번호인 $707$을 곱해준다.
	위에서 계산한 세 값을 더한 뒤, 한양대학교의 우편번호 $04763 (= 4763)$을 곱하면 학번이 나온다.
	위의 계산을 하려던 김한양은 머리를 다쳐서 암산이 안 된다는 것을 깨닫고 당신에게 학번을 계산해주는 프로그램을 만들어 달라고 부탁하였다. 김한양의 학번을 계산해줄 프로그램을 만들어라! 
	단, 앞의 과목을 응시하지 않으면 뒤의 과목을 응시할 수 없는 구조이며, 응시하지 않은 과목의 표준점수는 $0$점이라고 가정하자.

	input
	5
	88 92 90 90 35

	output
	120908755

	Solution : 1. 계산해주면 되는 문제.. Arrays.fill을 이용해서 빈 과목에 0점 처리를 해주었다.
*/

public class BaekJoon_29807 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer stare = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[5];
		Integer sum = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		Arrays.fill(arr, 0);
		for(int i=0; i<stare; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		if(arr[0] > arr[2]) {
			sum += Math.abs(arr[0] - arr[2]) * 508;
		} else {
			sum += Math.abs(arr[0] - arr[2]) * 108;
		}

		if(arr[1] > arr[3]) {
			sum += Math.abs(arr[1] - arr[3]) * 212;
		} else {
			sum += Math.abs(arr[1] - arr[3]) * 305;
		}

		if(arr[4] > 0) sum += arr[4] * 707;

		System.out.println(sum * 4763);
	}
}