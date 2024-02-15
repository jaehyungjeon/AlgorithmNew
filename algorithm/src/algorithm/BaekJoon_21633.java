package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Tanya has an account in "Redgotts" bank. The bank has the commission to transfer money to "Bluegotts" bank that her friend Vanya has the account in.
	Tanya has read her bank rules and learned the following:
	The commission for the bank transfer is $25$ tugriks plus $1\%$ of the sum transferred. However, the commission is never smaller than $100$ tugriks, and cannot exceed $2000$ tugriks.
	Tanya is planning to transfer $k$ tugriks to Vanya. Help her find out what the commission would be.

	input
	20210

	output
	227.10

	Solution : 1. 100 이하이거나 2000 이상일 경우에 최대 수수료로 처리해주는 부분을 확인해준다.
*/

public class BaekJoon_21633 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double num = Double.parseDouble(br.readLine());
		Double cost = 25 + (num * 0.01);
		if(cost >= 2000) {
			System.out.println("2000.00");
		} else if(cost <= 100) {
			System.out.println("100.00");
		} else {
			System.out.println(String.format("%.2f", cost));
		}
	}
}