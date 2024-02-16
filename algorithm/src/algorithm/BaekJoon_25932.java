package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/*
	Question : Dr. Orooji’s twins (Mack and Zack) play soccer. We will assume Mack wears jersey number 18 and Zack wears 17. So, Dr. O has to look for these two numbers when trying to find the twins.

	Given a list of 10 numbers, determine if the twins are there.

	input
	4
	11 99 88 17 19 20 12 13 33 44
	11 12 13 14 15 16 66 88 19 20
	20 18 55 66 77 88 17 33 44 11
	12 23 34 45 56 67 78 89 91 18

	output
	11 99 88 17 19 20 12 13 33 44
	zack

	11 12 13 14 15 16 66 88 19 20
	none

	20 18 55 66 77 88 17 33 44 11
	both

	12 23 34 45 56 67 78 89 91 18
	mack

	Solution : 1. List로 변환하여 contains를 활용하였다.
 */

public class BaekJoon_25932 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String str = br.readLine();
			List<String> arrayList = Arrays.asList(str.split(" "));

			System.out.println(str);
			if(arrayList.contains("17") && arrayList.contains("18")) {
				System.out.println("both");
			} else if(arrayList.contains("17")) {
				System.out.println("zack");
			} else if(arrayList.contains("18")) {
				System.out.println("mack");
			} else {
				System.out.println("none");
			}

			System.out.println();
		}
	}
}