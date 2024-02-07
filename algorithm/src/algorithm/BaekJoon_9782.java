package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : ค่ามัธยฐาน หรือ Median คือค่ากึ่งกลางของกลุ่มข้อมูลที่เรียงลําดับ นั่นคือจํานวนข้อมูลที่น้อยกว่าและมากกว่าค่ามัธย ฐานจะมีจํานวนเท่ากัน
	ให้ d1, d2, d3,... , dn คือข้อมูลทั้งหมด
	หาก n เลขคี่ค่ามัธยฐานคือข้อมูลตําแหนงที่(n+1)/2 นั่นคือ Median = d(n+1)/2
	แต่ถ้า n เป็นเลขคู่ ค่ามัธยฐาน คือค่าเฉลี่ยของข้อมูลตําแหนงที่(n/2) และ(n/2)+1 นั่นคือ Median = (d(n/2) + d(n/2)+1) / 2

	input
	5 1 2 3 4 5
	7 100 102 308 305 751 999 1005
	8 48 59 59 60 61 61 61 62
	14 2 3 5 7 11 13 17 19 23 29 31 37 41 43
	0

	output
	Case 1: 3.0
	Case 2: 305.0
	Case 3: 60.5
	Case 4: 18.0

	Solution : 1. 중위수에 대한 계산 
 */

public class BaekJoon_9782 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer idx = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer count = Integer.parseInt(st.nextToken());
			if(count == 0) break;

			Double[] arr = new Double[count];
			for(int i=0; i<count; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}

			// 홀수인 경우
			if(count % 2 == 1) {
				System.out.println("Case " + idx + ": " + arr[count / 2]);  
			} else {
				System.out.println("Case " + idx + ": " + (arr[count / 2] + arr[count / 2 - 1]) / 2);
			}
			idx++;
		}
	}
}