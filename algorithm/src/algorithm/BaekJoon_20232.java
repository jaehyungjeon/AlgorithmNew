package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : The team of problemsetters of Northwestern Russia Regional Contest welcomes you! Our regional contest was founded in 1995 under the name "Collegiate Programming Championship of St Petersburg".
	Here is the list of the contest winners:

	1995: ITMO
	1996: SPbSU
	1997: SPbSU
	1998: ITMO
	1999: ITMO
	2000: SPbSU
	2001: ITMO
	2002: ITMO
	2003: ITMO
	2004: ITMO
	2005: ITMO
	2006: PetrSU, ITMO
	2007: SPbSU
	2008: SPbSU
	2009: ITMO
	2010: ITMO
	2011: ITMO
	2012: ITMO
	2013: SPbSU
	2014: ITMO
	2015: ITMO
	2016: ITMO
	2017: ITMO
	2018: SPbSU
	2019: ITMO
	Help the contest archivist to remember the results of each contest and write a program that will read the year and print contest winners of that year in exactly the same format as above.

	input
	2006

	output
	PetrSU, ITMO

	Solution : 1. 단순 배열값 탐색
 */

public class BaekJoon_20232 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] winner = new String[]{"ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO",
				"SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
				"ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU",
				"ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
				"ITMO", "ITMO", "ITMO", "ITMO", "SPbSU", "ITMO"};
		Integer year = Integer.parseInt(br.readLine()) - 1995;
		System.out.println(winner[year]);
	}
}
