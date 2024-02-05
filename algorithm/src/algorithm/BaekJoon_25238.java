package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 메이플스토리 몬스터는 방어율 수치가 있습니다. 이 방어율 수치의 일정 %를 무시하는 것을 방무라고 합니다. 유저는 아이템을 사거나, 특정한 스킬 레벨을 올려서 방무 수치를 올릴 수 있습니다. 
	그렇게 해서, 유저가 체감하는 몬스터의 방어율 수치를 낮출 수 있습니다. 몬스터의 방어율이 200이고, 유저의 방무가 20이라면, 몬스터의 방어율 200의 20%를 무시하게 되므로, 40만큼 무시하게 됩니다. 즉, 160이 유저가 체감하는 방어율 수치가 됩니다.
	유저가 체감하는 몬스터의 방어율 수치가 100보다 크거나 같으면 몬스터에게 대미지를 줄 수 없습니다. 몬스터의 방어율 수치를 a, 유저의 방무를 b라고 할 때, 유저가 몬스터에게 대미지를 줄 수 있는지 없는지 알려주세요.  

	input
	200 20

	output
	0

	Solution : 1. Double로 받아서 계산 시 소숫점을 받을 수 있도록 하였다.
			   2. 출력은 3항연산자를 사용하였다.
*/

public class BaekJoon_25238 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double shield = Double.parseDouble(st.nextToken());
		Double percent = Double.parseDouble(st.nextToken());

		Double perValue = shield * (100-percent) / 100;
		System.out.println(perValue < 100 ? 1 : 0);
	}
}