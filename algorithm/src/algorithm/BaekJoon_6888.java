package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : In CS City, a mathematical place to live, the mayor is elected every 4 years, the treasurer is appointed every 2 years, 
	the chief programmer is elected every 3 years and the dog-catcher is replaced every 5 years.

	This year, Year $X$, the newly elected mayor announced the appointment of the new treasurer, a new dog-catcher and congratulated the chief programmer for winning the recent election. 
	That is, all positions were changed over. This is highly unusual. You will quantify how unusual this really is.

	Write a program that inputs the year $X$ and the future year $Y$ and lists all years between $X$ and $Y$ inclusive when all positions change.

	input
	2004
	2100

	output
	All positions change in year 2004
	All positions change in year 2064

	Solution : 1. 반복문이었다..
*/

public class BaekJoon_6888 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer year = Integer.parseInt(br.readLine());
		Integer nextYear = Integer.parseInt(br.readLine());
		for(int i=year; i<=nextYear; i+=60) {
			System.out.println("All positions change in year " + i);
		}
	}
}