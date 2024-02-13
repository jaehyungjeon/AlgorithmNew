package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : Imagine que você tenha uma máquina do tempo que pode ser usada no máximo três vezes, e a cada uso da máquina você pode escolher voltar para o passado ou ir para o futuro.
	A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos, e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro.
	Você pode fazer uma, duas ou três viagens, e cada um desses três créditos pode ser usado uma vez apenas.
	Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado.
	Dessa forma, você terminaria quatro anos no passado, em 2012. Também poderia fazer três viagens, todas indo para o futuro, usando os créditos em qualquer ordem, terminando em 2042.

	Neste problema, dados os valores dos três créditos da máquina, seu programa deve dizer se é ou não possível viajar no tempo e voltar para o presente, fazendo pelo menos uma viagem e,
	no máximo, três viagens; sempre usando cada um dos três créditos no máximo uma vez.

	input
	22 5 22

	output
	S

	Solution : 1. 동일한 두개의 숫자가 있거나, 두 수의 합이 하나의 합과 같은 경우는 S, 아니면 N
			   2. Integer로 선언해서 사용하니 ==로 비교가 잘 안되었다.. equals를 사용하여 비교하였더니 성공하였다.
 */

public class BaekJoon_13580 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer arr[] = new Integer[3];
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);
		if(arr[0].equals(arr[1]) || arr[0].equals(arr[2]) || arr[1].equals(arr[2])) {
			System.out.println("S");
		} else if(arr[2].equals(arr[0] + arr[1])) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}
}