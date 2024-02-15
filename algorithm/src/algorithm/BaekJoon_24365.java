package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : На три цветя, подредени в редица на разстояние през 1 метър, са кацнали пчели.
	На лявото цвете пчелите не са повече от тези на средното, а на средното не са повече от пчелите, кацнали на дясното цвете.

	Ръководител на всички е пчеличката Мая. Тя пресметнала, че ако определи някои от пчелите да се преместят, то на трите цветя ще има по равен брой пчели.
	За съжаление, работливите пчели трябва да пестят силите си. Затова Мая иска първо да изчисли минималния брой метри, които може да се прелетят и след това вече ще определи коя пчела на кое цвете да се премести.

	За да помогнете на пчеличката Мая, напишете програма bee, която извежда този минимален брой метри.

	input
	3 6 9

	output
	6

	Solution : 1. 평균을 제외하고 나머지를 왼쪽으로 옮긴다.
*/

public class BaekJoon_24365 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());
		Integer C = Integer.parseInt(st.nextToken());

		Integer Average = (A+B+C) / 3;
		Integer res = 0;

		res += (C - Average);
		B += (C - Average);

		res += (B - Average);

		System.out.println(res);
	}
}
