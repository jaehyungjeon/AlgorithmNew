package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Tri-du é um jogo de cartas derivado do popular jogo de Truco. O jogo utiliza um baralho normal de 52 cartas, com treze cartas de cada naipe, mas os naipes são ignorados.
	Apenas o valor das cartas,considerados como inteiros de 1 a 13, são utilizados.

	No jogo, cada jogador recebe três cartas. As regras são simples:

	Um trio (três cartas de mesmo valor) ganha de uma dupla (duas cartas de mesmo valor).
	Um trio formado por cartas de maior valor ganha de um trio formado por cartas de menor valor.
	Uma dupla formada por cartas de maior valor ganha de uma dupla formada por cartas de menor valor.
	Note que o jogo pode não ter ganhador em muitas situações; nesses casos, as cartas distribuídas são devolvidas ao baralho, que é embaralhado e uma nova partida é iniciada

	Um jogador já recebeu duas das cartas que deve receber, e conhece seus valores. Sua tarefa é escrever um programa para determinar qual o valor da terceira carta que maximiza a probabilidade
	de esse jogador ganhar o jogo.

	input
	10 7

	output
	10

	Solution : 1. 3개의 카드가 전부 같으면 최대, 그렇지 않을 경우 두 수 중에서 최댓값을 뽑아주면 됨.
 */

public class BaekJoon_13597 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());

		Integer maxValue = Math.max(A, B);
		Integer minValue = Math.min(A, B);
		if(maxValue.equals(minValue)) System.out.println(maxValue);
		else {
			System.out.println(maxValue);
		}
	}
}