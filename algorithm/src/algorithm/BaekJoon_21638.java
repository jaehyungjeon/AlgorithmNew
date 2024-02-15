package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : You work for MCHS (Russian Ministry of Emergency Situations). You have just received a report from Hydro-meteorological Center containing an information about today's weather and the forecast for tomorrow.
	According to this report, the air temperature is $t_1$ degrees today, and the wind speed is $v_1$ meters per second.
	Tomorrow the air temperature will be $t_2$ degrees, and the wind speed will be $v_2$ meters per second.

	You are given a task to notify citizens about the weather for tomorrow via SMS.
	The most important goal is to warn citizens in case the storm is possible.
	If, according to the forecast, the temperature tomorrow will be negative, and the wind speed will be at least 10 meters per second, you should send a message with following text:

	A storm warning for tomorrow! Be careful and stay home if possible!
	Otherwise, you may just notify citizens about bad weather changes.
	If the temperature tomorrow will be lower than today, then you should send a message with a warning about a cold snap. It should have the following text:
	MCHS warns! Low temperature is expected tomorrow.
	
	Otherwise, if wind speed tomorrow will be higher than today, then you should send a message with a warning about strong wind. It should have the following text:
	MCHS warns! Strong wind is expected tomorrow.

	If none of the above conditions is satisfied, the you don't have to send a message at all.
	Given the report from Hydro-meteorological Center, determine, what message has to be sent.

	input
	15 2
	5 3

	output
	MCHS warns! Low temperature
	is expected tomorrow.

	Solution : 1. 조건에 맞추어 조건문을 구성하는 문제
*/

public class BaekJoon_21638 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer t1 = Integer.parseInt(st.nextToken());
		Integer v1 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Integer t2 = Integer.parseInt(st.nextToken());
		Integer v2 = Integer.parseInt(st.nextToken());

		if(t2 < 0 && v2 >= 10) {
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		} else {
			if(t1 > t2) {
				System.out.println("MCHS warns! Low temperature is expected tomorrow.");
			} else if(v1 < v2) {
				System.out.println("MCHS warns! Strong wind is expected tomorrow.");
			} else {
				System.out.println("No message");
			}
		}
	}
}