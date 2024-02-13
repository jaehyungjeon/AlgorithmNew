package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : You are grading an arithmetic quiz. The quiz asks a student for the sum of the numbers. Determine if the student taking the quiz got the question correct.

	input
	1 + 2 = 3

	output
	YES

	Solution : 1. 덧셈의 결과만 맞으면 되니까 숫자로 된 값들의 합을 마지막 숫자와 비교하여 리턴한다.
 */

public class BaekJoon_13985 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		st.nextToken();
		Integer B = Integer.parseInt(st.nextToken());
		st.nextToken();
		Integer C = Integer.parseInt(st.nextToken());
		if(C.equals(A+B)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}