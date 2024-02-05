package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : $N$일 뒤는 동원이의 생일이다. 축하해 주자!
	준원이는 동원이에게 생일 선물로 양말을 $2X$개 선물하려 한다. 양말은 시장에서 살 것이다. 연속한 이틀에 걸쳐서, 준원이는 매일 시장에서 양말을 $X$개씩 사서 트럭에 담아올 것이다.

	시장에서 양말의 가격은 날마다 다를 수 있다. 오늘부터 $i$번째 날에, 양말은 하나에 $A_i$원이다.

	동원이의 생일까지 $N$일 남았다! 남은 $N$일 가운데 연속한 이틀에 걸쳐 양말 $2X$개를 사는 데 드는 최소 비용은?

	input
	5 10
	9 2 5 7 6

	output
	70

	Solution : 1. N >= 2 이므로, 무조건 2개씩 나눠서 minValue값을 구한 뒤 값을 곱해주기만 하면 될듯?
 */

public class BaekJoon_28281 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer N = Integer.parseInt(st.nextToken());
		Integer X = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[N];

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Integer minValue = Integer.MAX_VALUE;
		for(int i=1; i<arr.length; i++) {
			minValue = Math.min(minValue, arr[i-1] + arr[i]);
		}

		System.out.println(minValue * X);
	}
}