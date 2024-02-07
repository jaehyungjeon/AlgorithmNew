package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Gigi likes to play with squares. She has a collection of equal-sized square tiles. Gigi wants to arrange some or all of her tiles on a table to form a solid square. 
	What is the side length of the largest possible square that Gigi can build?
	For example, when Gigi has 9 tiles she can use them all to build a square whose side length is 3. But when she has only 8 tiles, the largest square that she can build has side length 2.
	Write a program that inputs the number of tiles and then prints out the maximum side length. You may assume that the number of tiles is less than ten thousand.

	input
	9

	output
	The largest square has side length 3.

	Solution : 1. 제곱근 이용했으면 쉽게 풀림.
*/

public class BaekJoon_6887 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());
		System.out.println("The largest square has side length " + (int) Math.sqrt(num) + ".");
	}
}