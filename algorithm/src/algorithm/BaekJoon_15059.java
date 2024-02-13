package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : In long flights, airlines offer hot meals. Usually the flight attendants push carts containing the meals down along the aisles of the plane.
	When a cart reaches your row, you are asked right away: “Chicken, beef, or pasta?” You know your choices,
	but you have only a few seconds to choose and you don’t know how your choice will look like because your neighbor hasn’t opened his wrap yet. . .

	The flight attendant in this flight decided to change the procedure.
	First she will ask all passengers what choice of meal they would prefer, and then she will check if the number of meals available in this flight for each choice are enough.

	As an example, consider that the available number of meals for chicken, beef and pasta are respectively (80, 20, 40), while the number of passenger’s choices for chicken,
	beef and pasta are respectively (45, 23, 48). In this case, eleven people will surely not receive their selection for a meal,
	since three passengers who wanted beef and eight passengers who wanted pasta cannot be pleased.

	Given the quantity of meals available for each choice and the number of meals requested for each choice,
	could you please help the flight attendant to determine how many passengers will surely not receive their selection for a meal?

	input
	80 20 40
	45 23 48

	output
	11

	Solution : 1. 간단한 계산
 */

public class BaekJoon_15059 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = 0;
		Integer[] arr1 = new Integer[3];
		for(int i=0; i<3; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<3; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			if(arr1[i] < num) {
				sum += (num - arr1[i]);
			}
		}

		System.out.println(sum);
	}
}