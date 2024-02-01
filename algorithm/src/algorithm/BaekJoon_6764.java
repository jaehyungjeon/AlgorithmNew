package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : A fish-finder is a device used by anglers to find fish in a lake. If the fish-finder finds a fish, it will sound an alarm. 
	It uses depth readings to determine whether to sound an alarm. For our purposes, the fish-finder will decide that a fish is swimming past if:

	there are four consecutive depth readings which form a strictly increasing sequence (such as 3 4 7 9) (which we will call “Fish Rising”), or
	there are four consecutive depth readings which form a strictly decreasing sequence (such as 9 6 5 2) (which we will call “Fish Diving”), or
	there are four consecutive depth readings which are identical (which we will call “Constant Depth”).
	All other readings will be considered random noise or debris, which we will call “No Fish.”

	Your task is to read a sequence of depth readings and determine if the alarm will sound.

	input
	1
	10
	12
	13

	output
	Fish Rising

	Solution : 1. case를 잘 나눠주면 된다.
*/

public class BaekJoon_6764 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr = new Integer[4];
		for(int i=0; i<4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		if(arr[0] > arr[1] && arr[1] > arr[2] && arr[2] > arr[3]) {
			System.out.println("Fish Diving");
		} else if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3]) {
			System.out.println("Fish Rising");
		} else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
			System.out.println("Fish At Constant Depth");
		} else {
			System.out.println("No Fish");
		}
	}
}