package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Сегодня Диппер обнаружил в лесу таинственный конвейер. Конечно же, в дневнике нашлась страница, 
	на которой содержится некоторая информация об этом объекте. 
	Например, он заметил последовательность чисел, каждое из которых равно 
	$-1$, $0$ или $1$.

	Рядом с конвейером он обнаружил пульт управления с тремя кнопками, на которых написаны те же числа. 
	Он уже проверил, что происходит при нажатии на них. Выяснилось, что при нажатии на <<-1>> конвейер сдвигается на один дюйм влево,
	при нажатии на <<1>>, конвейер сдвигается на один дюйм вправо, а при нажатии на <<0>>, 
	не происходит видимых изменений (хотя, кто знает, может быть при этом, где-то отрывается портал в параллельный мир).

	Диппер уже настроился на то, чтобы нажать последовательность чисел из дневника, 
	но перед этим решил все таки предостеречься и выяснить хотя бы, в какую сторону в итоге сдвинется конвейер от текущего положения.

	input
	5
	1 0 1 -1 0

	output
	Right

	Solution : 1. 받는 값들을 합산하여 양수이면 Right / 음수이면 Left / 0이면 Stay 도출 
*/

public class BaekJoon_28938 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;
		for(int i=0; i<count; i++) {
			sum += Integer.parseInt(st.nextToken());
		}

		if(sum > 0) {
			System.out.println("Right");
		} else if(sum < 0) {
			System.out.println("Left");
		} else {
			System.out.println("Stay");
		}
	}
}
