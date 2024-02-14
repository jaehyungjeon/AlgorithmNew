package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Pokemon Go just released the Buddy update. It lets you select a Pokemon to appear alongside your trainer’s avatar on your profile screen.
	As you walk with your buddy, it will find candy that can be used to evolve the Pokemon.
	The Buddy system divides the Pokemons into 3 groups. Each group gives one candy upon walking for 1, 3, and 5 kilometers respectively
	In this problem you will be given the Pokemon group G, the number of candies C you initially have, and the number of candies E required to evolve the Pokemon.
	You should calculate the number of Kilometers required to walk in order to evolve the Pokemon.

	input
	2
	1 15 51
	1 18 21

	output
	36
	3

	Solution : 1. 이거는 가지고 있는 사탕이 진화조건 사탕보다 많을 경우에 0으로 치환하는 과정이 핵심 포인트라고 생각함.
*/

public class BaekJoon_18691 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer G = Integer.parseInt(st.nextToken());
			Integer C = Integer.parseInt(st.nextToken());
			Integer E = Integer.parseInt(st.nextToken());
			if(E - C > 0) {
				E -= C;
			} else {
				E = 0;
			}

			switch(G) {
				case 1 : 
					sb.append(E);
					break;
				case 2 :
					sb.append(E*3);
					break;
				case 3 :
					sb.append(E*5);
					break;
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}
