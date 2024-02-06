package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 대한민국 지폐는 천 원권, 오천 원권, 만 원권, 오만 원권으로 총 네 종류가 있다. 각 지폐의 세로 길이는 $68\text{mm}$로 모두 같지만, 가로 길이는 모두 다르다. 
	천 원권의 가로 길이는 $136\text{mm}$, 오천 원권의 가로 길이는 $142\text{mm}$, 만 원권의 가로 길이는 $148\text{mm}$, 오만 원권의 가로 길이는 $154\text{mm}$이다. 따라서 가로의 길이를 통해서 지폐의 종류를 구분할 수 있다.

	수민이는 대한민국 지폐 $N$장을 가지고 있다. 수민이는 종이의 크기를 재는 기계를 이용하여 각 지폐의 가로, 세로 길이를 알아냈다. 수민이가 가진 지폐의 총액을 구해보자.

	input
	1
	136 68

	output
	1000

	Solution : 1. 세로는 볼 필요가 없고 가로만 비교해서 비용을 합산한다.
*/

public class BaekJoon_30031 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		Integer sumPrice = 0;
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer width = Integer.parseInt(st.nextToken());
			Integer height = Integer.parseInt(st.nextToken());
			if(width == 136) {
				sumPrice += 1000;
			} else if(width == 142) {
				sumPrice += 5000;
			} else if(width == 148) {
				sumPrice += 10000;
			} else if(width == 154) {
				sumPrice += 50000;
			}
		}
		System.out.println(sumPrice);
	}
}