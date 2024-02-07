package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Kozik pragnie zostać koszykarzem. Po rozmowie z trenerem okazało się, że jest za niski. Kozik jest jednak tak zdeterminowany, że chce spełnić wymagania trenera,
	nawet jeśli okazałoby się to oszustwem. Wpadł więc na genialny pomysł robienia sobie guzów na głowie, aż osiągnie wymagany wzrost. Zauważył, że przy każdym uderzeniu guz się powiększa o m cm. 
	Kozik zastanawia się ile minimalnie razy będzie musiał się uderzyć.

	input
	180 202 10

	output
	3

	Solution : 1. 두 값의 차를 10으로 나누었을 때, 나머지가 남으면 최소 개수는 +1을 더해주어야 한다.
*/

public class BaekJoon_8710 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long k = Long.parseLong(st.nextToken());
		Long w = Long.parseLong(st.nextToken());
		Long m = Long.parseLong(st.nextToken());

		w -= k;
		if(w % m == 0) System.out.println(w/m);
		else System.out.println(w/m + 1);
	}
}