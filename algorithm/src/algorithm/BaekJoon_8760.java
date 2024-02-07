package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Kiedy Hektor zajmował się realizacją projektu HektorJudge, jego kolega Wiktor uznał, że życie nie powinno składać się wyłącznie z siedzenia przy komputerze i wybrał się na wycieczkę w góry. 
	Kiedy wieczorem dotarł do schroniska ze zdziwieniem odkrył, że nie tylko on wpadł na pomysł spędzenia weekendu w górach - schronisko było pełne turystów!

	W tej kryzysowej sytuacji kierownik schroniska był zmuszony zorganizować turystom nocleg na podłodze w głównej sali schroniska. 
	Sala ma postać prostokąta złożonego z W*K kwadratowych pól ułożonych w prostokąt o wymiarach W wierszy na K kolumn.
	Każdy turysta zajmuje dokładnie dwa sąsiednie (albo w pionie albo w poziomie) pola.
	Ile turystów można maksymalnie ułożyć w sali o zadanych wymiarach tak, aby każde pole było zajęte maksymalnie przez jednego turystę?
	Wiktor, jako matematyk-informatyk natychmiast obliczył prawidłowy wynik.

	input
	3
	1 1
	2 2
	2 3

	output
	0
	2
	3

	Solution : 1. 단순 계산문제
 */

public class BaekJoon_8760 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer a = Integer.parseInt(st.nextToken());
			Integer b = Integer.parseInt(st.nextToken());

			System.out.println((a*b) / 2);
		}
	}
}