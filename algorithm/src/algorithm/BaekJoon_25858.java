package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : The UCF Programming Team coaches schedule practices regularly in fall and spring (by the way, all UCF students are welcome to the practices).
	During summer, the majority of the team members are gone but the coaches know how to make sure the students don’t get “rusty”.
	The coaches usually give prize money and reward the team members based on how many problems they solve during summer.
	For example, let’s assume the coaches have $1,000 in prize money and there are three students.
	Let’s also assume the three students solve, respectively, 5, 8 and 7 problems, i.e., a total of 20 problems.
	So, the reward for one problem will be $50 ($1000/20) and the three team members will receive, respectively, $250, $400 and $350.

	Given the total prize money and the number of problems each team member has solved, compute the reward for each student.

	input
	3 1000
	5
	8
	7

	output
	250
	400
	350

	Solution : 1. 단순한 계산문제
 */

public class BaekJoon_25858 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer n = Integer.parseInt(st.nextToken());
		Integer d = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n];

		Integer sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		d /= sum;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i] * d);
		}
	}
}