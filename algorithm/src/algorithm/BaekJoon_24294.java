package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Цветин живее на поле, разделено на квадратни клетки с размер 1x1. Той много обича цветята, затова често прави нови лехи за тях.
	Цветните лехи имат специална форма: те са два правоъгълника, поставени един до друг, така че левите им страни образуват една права линия (фигурата вдясно).

	За да украси новата леха, Цветин решил да постави по целия ѝ периметър плочки, със същия размер като клетката на полето, в което живее

	Напишете програма garden, която намира броя плочки, които са необходими на Цветин.

	input
	2
	2
	4
	2

	output
	20

	Solution : 1. 가로는 가장 긴쪽의 + 2로, 세로는 두개의 합산의 +2로 둘레를 구한 뒤 4를 더해준다.
*/

public class BaekJoon_24294 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer w1 = Integer.parseInt(br.readLine());
		Integer h1 = Integer.parseInt(br.readLine());
		Integer w2 = Integer.parseInt(br.readLine());
		Integer h2 = Integer.parseInt(br.readLine());

		w2 = Math.max(w1, w2);
		h2 = h1+h2;

		System.out.println((2*w2) + (2*h2) + 4);
	}
}
