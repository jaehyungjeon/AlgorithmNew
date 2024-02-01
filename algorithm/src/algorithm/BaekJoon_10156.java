package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 동수는 제과점에 과자를 사러 가는데 현재 가진 돈이 모자랄 경우 부모님께 모자란 돈을 받으려고 한다. 
	과자 한 개의 가격이 K, 사려고 하는 과자의 개수가 N이고, 현재 가진 돈의 액수를 M이라 할 때 여러분은 동수가 부모님께 받아야 하는 모자란 돈을 계산하려고 한다. 

	예를 들어, 과자 한 개의 가격이 30원, 사려고 하는 과자의 개수가 4개, 현재 동수가 가진 돈이 100원이라 할 때, 동수가 부모님께 받아야 하는 돈은 20원이다. 
	과자 한 개의 가격이 250원, 사려고 하는 과자의 개수가 2개, 현재 동수가 가진 돈이 140원이라 할 때, 동수가 부모님께 받아야 하는 돈은 360원이다. 
	과자 한 개의 가격이 20원, 사려고 하는 과자의 개수가 6개, 현재 동수가 가진 돈이 120원이라 할 때 동수가 부모님께 받아야 하는 돈은 0원이다. 
	과자 한 개의 가격이 20원, 사려고 하는 과자의 개수가 10개, 현재 동수가 가진 돈이 320원이라 할 때 동수가 부모님께 받아야 하는 돈은 역시 0원이다. 

	과자 한 개의 가격, 사려고 하는 과자의 개수와 동수가 현재 가진 돈의 액수가 주어질 때 동수가 부모님께 받아야 하는 돈의 액수를 출력하는 프로그램을 작성하시오. 

	input
	300 4 1000

	output
	200

	Solution : 1. 가격 계산 후, 가진 돈이 더 많으면 0으로 도출
			   2. 그렇지 않다면, 계산한 값의 차를 구한 후 절대값을 먹인다. -> 둘 중 뭐가 더 큰지 비교하기 귀찮기 때문
*/

public class BaekJoon_10156 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Integer price = Integer.parseInt(st.nextToken());
		Integer piece = Integer.parseInt(st.nextToken());
		Integer money = Integer.parseInt(st.nextToken());

		price = price * piece;
		if(money >= price) {
			System.out.println("0");
		} else {
			System.out.println(Math.abs(price - money));
		}
	}
}