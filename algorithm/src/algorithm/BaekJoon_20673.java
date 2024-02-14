package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The ministry of health in Neverland has recently published a colorcoded chart to help people better understand the level of Covid-19 risk in different cities,
	and take appropriate actions and precautions based on the risk level.

	In this chart, each city is colored either red, yellow, or white, based on some indicators showing the coronavirus risk level at that city.
	After exploring several models, the ministry has reached the following criteria for classifying the cities. For a given city,
	if the average number of new cases per day over the past two weeks is at most 50 per one million population,
	and the average number of new hospitalizations per day over the past two weeks is at most 10 in every one million population, then the city is marked as white,
	meaning that the city is in a low-risk zone. On the other hand, if the average number of new hospitalizations per day in a city over the past two weeks is more than 30 per one million population,
	then the city is categorized as high-risk and is color-coded red. All other cities are colored yellow.

	While the data for new cases and hospitalizations are publicly available, the ministry does not update its colorcoded chart very frequently.
	Hana, a curious student, likes to know the risk level of her city at any point of time, before the ministry publishes its updated chart.
	She can obtain the average number of new cases and new hospitalizations from the Internet, but she needs your help to convert this data to a color code that better demonstrates the risk level at her city.

	input
	50
	7

	output
	White

	Solution : 1. 단순 케이스문
*/

public class BaekJoon_20673 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer p = Integer.parseInt(br.readLine());
		Integer q = Integer.parseInt(br.readLine());
		if(p <= 50 && q <= 10) {
			System.out.println("White");
		} else if(q > 30) {
			System.out.println("Red");
		} else {
			System.out.println("Yellow");
		}
	}
}