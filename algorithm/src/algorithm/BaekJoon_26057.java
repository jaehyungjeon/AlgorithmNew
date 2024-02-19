package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : В финал соревнования по удою <<Большой удой>> прошли Архип и Бронислав. В течение раунда каждый надоил ведро молока (возможно, неполное), после чего результаты были записаны на листочек, а вёдра с молоком были одновременно опрокинуты в большой чан. Отметка в чане показала, что суммарно было надоено 
	$L$ литров молока. Но только участники отвлеклись на вручение призов, как листочек с результатами съела коза.

	Баба Надя, недавно приобрёвшая слуховой аппарат, заявила что может восстановить результаты на слух. По вековому опыту она знает, что молоко из ведра льется со скоростью 1 литр в секунду. А на слух она определила, что во время финала молоко лилось в течение 
	$T$ секунд. Помогите ответить на вопрос --- на сколько литров победитель обогнал проигравшего?

	input
	3
	2

	output
	1

	Solution : 1. 2*T - L
*/

public class BaekJoon_26057 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer L = Integer.parseInt(br.readLine());
		Integer T = Integer.parseInt(br.readLine());
		System.out.println(2*T - L);
	}
}