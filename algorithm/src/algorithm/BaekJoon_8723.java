package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : Bajtuś znalazł w lesie 3 patyki. Teraz chciałby wiedzieć, czy może z nich zbudować trójkąt prostokątny lub równoboczny. Bajtuś nie może łamać patyków, może je wykorzystać tylko w całości.

	input
	3 4 5

	output
	1

	Solution : 1. 이거 왜 많이 틀렸는지 모르겠네ㅋㅋㅋㅋ
 */

public class BaekJoon_8723 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		if(arr[0]==arr[2]) System.out.println(2);
		else if(arr[2]*arr[2]==arr[0]*arr[0]+arr[1]*arr[1])System.out.println(1);
		else System.out.println(0);
	}
}