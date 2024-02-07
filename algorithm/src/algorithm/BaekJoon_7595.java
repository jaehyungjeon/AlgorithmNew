package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : It is not hard to draw a triangle of stars of any given size. For example, a size 5 triangle would look like this (5 stars high and 5 stars wide):

	*
	**
	***
	****
	*****
	Your task is to draw triangles in a number of sizes. 

	input
	5
	3
	2
	7
	0

	output
	*
	**
	***
	****
	*****
	*
	**
	***
	*
	**
	*
	**
	***
	****
	*****
	******
	*******

	Solution : 1. 단순 별찍기
*/

public class BaekJoon_7595 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			Integer num = Integer.parseInt(br.readLine());
			if(num.equals(0)) break;
			else {
				for(int i=0; i<num; i++) {
					for(int j=0; j<i+1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}