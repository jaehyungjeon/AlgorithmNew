package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Anna skickar hemliga krypterade meddelanden till Bert. För att kunna läsa meddelandena måste Bert dekryptera dem med följande algoritm:

	Första bokstaven i indata-strängen tas med i utdata-strängen.
	Varje bokstav som man tar med beskriver var i indatasträngen nästa bokstav finns som ska tas med. Ett 'A' betyder att nästa bokstav finns 1 position fram, ett 'B' innebär 2 positioner fram osv.
	När man kommit till den sista bokstaven i indatat så tar man med den bokstaven och är klar. Indatan är sådan att man alltid kommer till den sista bokstaven.
	Hjälp Bert genom att skriva ett program som avkrypterar Annas meddelanden.

	input
	ABKBFA

	output
	ABBA

	Solution : 1. 인덱스의 위치를 찾아 계속 더해주는 방식인데.. 왜 살짝 헷갈렸는지 모르겠다.
*/

public class BaekJoon_24196 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char[] arr = str.toCharArray();
		sb.append(arr[0]);
		Integer idx = (int)arr[0] - 64;
		while(true) {
			if(idx < arr.length-1) {
				sb.append(str.charAt(idx));
				idx += (int) str.charAt(idx) - 64;
			} else {
				break;
			}
		}
		sb.append(arr[arr.length-1]);

		System.out.println(sb.toString());
	}
}
