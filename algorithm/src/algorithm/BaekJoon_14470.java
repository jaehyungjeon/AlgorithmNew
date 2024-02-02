package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : JOI 군은 식사 준비를 위해 A℃의 고기를 전자레인지로 B℃까지 데우려고 한다. 고기는 온도가 0℃보다 낮을 때 얼어 있고, 0℃보다 높을 때는 얼어 있지 않다. 온도가 정확히 0℃일 때 고기는 얼어 있을 수도, 얼어 있지 않을 수도 있다.

	JOI 군은 가열할 때 고기가 아래의 규칙을 따라 데워진다고 가정하고, 고기를 데우는 데 걸리는 시간을 어림하기로 했다.

	고기가 얼어 있고 온도가 0℃ 미만일 때 : 온도가 C초에 1℃씩 오른다.
	고기가 얼어 있고 온도가 정확히 0℃일 때 : 얼어 있지 않은 상태로 만드는(해동하는) 데 D초가 걸린다.
	고기가 얼어 있지 않을 때 : 온도가 E초에 1℃씩 오른다.
	이 규칙을 토대로, 고기가 B℃까지 데워지는 데 몇 초가 걸리는지 구하라.

	input
	-10
	20
	5
	10
	3

	output
	120

	Solution : 1. A가 음수면 A의 ABS값 * C를 곱한다.
			   2. 0도인 경우, D값을 더한다.
			   3. 0보다 크면 B값 * E를 곱한다.
			   4. 나머지 값을 다 합산한다.
			   5. B가 0보다 작을 경우 / B가 0이상일 경우를 나누어 계산한다.
*/

public class BaekJoon_14470 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer A = Integer.parseInt(br.readLine());
		Integer B = Integer.parseInt(br.readLine());
		Integer C = Integer.parseInt(br.readLine());
		Integer D = Integer.parseInt(br.readLine());
		Integer E = Integer.parseInt(br.readLine());

		if(B < 0) { // B가 0미만인 경우
			System.out.println(Math.abs(A-B) * C);
		} else { // B가 0이상인 경우
			if(A < 0) {
				System.out.println((Math.abs(A) * C) + (Math.abs(B) * E) + D);
			} else if(A == 0) {
				System.out.println((Math.abs(B - A) * E) + D);
			} else {
				System.out.println((Math.abs(B - A) * E));
			}
			
		}
	}
}