package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Captain Jack decides to to take over a rival’s ship. 
	He needs to send his henchmen over on rowboats that can hold 6 pirates each. 
	You will help him count out pirates in groups of 6. The last rowboat may have fewer than 6 pirates. 
	To make your task easier each pirate has been assigned a number from 1 to N.

	input
	10

	output
	1 2 3 4 5 6 Go! 7 8 9 10 Go!

	Solution : 1. 6으로 나눈 나머지가 0일 경우에 Go!를 붙이면 됨. 
*/

public class BaekJoon_5300 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer value = Integer.parseInt(br.readLine());
		
		for(int i=0;i<value;i++){
			System.out.print((i+1)+" ");
			if((i+1)%6 == 0 || i == value-1){
				System.out.print("Go! ");
			}
		}
	}
}
