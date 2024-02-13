package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Meredith runs a taxi service called Ruber which offers rides to clients in small towns in western Pennsylvania.
	She wants to get every possible dime out of people who use her taxis, so her drivers charge a flat fee not per minute but per second.
	It’s important, therefore, to be able to determine the exact amount of elapsed time between the moment a client enters a cab until the moment they leave.
	Trying to write a program to do this has driven Meredith crazy (pun intended) so she’s come to you for some help.

	input
	10 : 0 : 0
	11 : 0 : 0

	output
	3600

	Solution : 1. 초단위로 계산
			   2. 계산하기 너무 귀찮음...
 */

public class BaekJoon_15080 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().replaceAll(":", ""));
		Integer[] arr = new Integer[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine().replaceAll(":", ""));
		for (int i = 0; i < 3; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			arr[i] = num - arr[i];
		}

		for (int i = 2; i >= 0; i--) {
			if (arr[i] < 0 && i >= 1) {
				arr[i] += 60;
				arr[i - 1] -= 1;
			}

			if(arr[0] < 0) {
				arr[0] += 24;
			}
		}

		System.out.println(arr[0] * 3600 + arr[1] * 60 + arr[2]);
	}
}