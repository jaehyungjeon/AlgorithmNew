package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Niech n będzie nieujemną liczbą całkowitą. Liczbę n! (czytaj n-silnia) definiuje się następująco. Jeśli n ≤ 1, to n! = 1. Dla n > 1, n! 
	jest równe iloczynowi wszystkich liczb od 1 do n, czyli n! = 1 * 2 * ... * n. Na przykład 4! = 1 * 2 * 3 * 4 = 24.

	Napisz program, który

	wczyta ze standardowego wejścia nieujemną liczbę całkowitą n,
	policzy cyfrę jedności w zapisie dziesiętnym liczby n!,
	wypisze wynik na standardowe wyjście.

	input
	4

	output
	4

	Solution : 1. 팩토리얼 함수로 구하면 stackOverflow 에러가 난다.
			   2. 1의 자리를 구하는 문제이므로 나머지 값들로 계산해주면 된다.
*/

public class BaekJoon_8558 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());

		Integer value = 1;
		for(int i=2; i<=num; i++) {
			value *= i;
			value %= 10;
		}

		System.out.println(value);
	}
}