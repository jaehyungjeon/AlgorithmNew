package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Група ученици излезли на разходка след училище. При тръгване електронният часовник на Тони показвал t1 часа и m1 минути. Те обикаляли около езеро.
	Когато се прибрали, Тони погледнал часовника и видял, че е t2 часа и m2 минути. Разходката продължила по-малко от едно денонощие и наймалко може да е била 0 минути.
	Пълна обиколка на езерото се прави точно за половин час.

	и точно за половин час. Напишете програма chas, която въвежда началния и крайния час на разходката, и отпечатва времето m в минути, което е изминало и броя n на пълните обиколки,
	които са направили учениците за това време.

	input
	23 45 12 34

	output
	769 25

	Solution : 1. 24시간을 분으로 환산하면 1440
			   2. 값이 음수이면 1440을 더해주기만 하면 된다.
*/

public class BaekJoon_24356 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer t1 = Integer.parseInt(st.nextToken());
		Integer m1 = Integer.parseInt(st.nextToken());
		Integer t2 = Integer.parseInt(st.nextToken());
		Integer m2 = Integer.parseInt(st.nextToken());

		Integer time = (t2 - t1) * 60 + (m2 - m1);
		if(time < 0) {
			time += 1440;
		}

		System.out.println(time + " " + time/30);
	}
}
