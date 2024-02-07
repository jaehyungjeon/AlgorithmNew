package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Given the coordinates (x,y) of some points in 2-dimensional plane, find out which quadrant(Q1-Q4) the points are located. If a point is located on X-axis or Y-axis, print out AXIS instead.

	input
	1 2
	-1 -0.12
	4 0
	-10.4 200
	0 0

	output
	Q1
	Q3
	AXIS
	Q2
	AXIS

	Solution : 1. break 위치가 a == 0 || b == 0 보다 아래에 있으면 계속 돌기 때문에 에러가 발생한다.
 */

public class BaekJoon_9772 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Double a = Double.parseDouble(st.nextToken());
			Double b = Double.parseDouble(st.nextToken());

			if(a > 0 && b > 0) {
				System.out.println("Q1");
			} else if(a < 0 && b > 0) {
				System.out.println("Q2");
			} else if(a < 0 && b < 0) {
				System.out.println("Q3");
			} else if(a > 0 && b < 0) {
				System.out.println("Q4");
			} else if(a==0 && b==0) {
				System.out.println("AXIS");
				break;
			} else if(a == 0 || b == 0) {
				System.out.println("AXIS");
			} 
		}
	}
}