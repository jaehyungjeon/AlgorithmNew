package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : O novo prédio da Sociedade Brasileira de Computação (SBC) possui 3 andares. Em determinadas épocas do ano, os funcionários da SBC bebem muito café.
	Por conta disso, a presidência da SBC decidiu presentear os funcionários com uma nova máquina de expresso.
	Esta máquina deve ser instalada em um dos 3 andares, mas a instalação deve ser feita de forma que as pessoas não percam muito tempo subindo e descendo escadas.

	Cada funcionário da SBC bebe 1 café expresso por dia. Ele precisa ir do andar onde trabalha até o andar onde está a máquina e voltar para seu posto de trabalho.
	Todo funcionário leva 1 minuto para subir ou descer um andar. Como a SBC se importa muito com a eficiência, ela quer posicionar a máquina de forma a minimizar o tempo total gasto subindo e descendo escadas.

	Sua tarefa é ajudar a diretoria a posicionar a máquina de forma a minimizar o tempo total gasto pelos funcionários subindo e descendo escadas.

	input
	10
	20
	30

	output
	80

	Solution : 1. 층별로의 절댓값을 구한 후 각 층의 cost * 2를 합산해준 값의 최소를 구한다.
 */

public class BaekJoon_15051 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer answer = Integer.MAX_VALUE;
		Integer[] arr = new Integer[3];
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<3; i++) {
			Integer sum = 0;
			for(int j=0; j<3; j++) 
				sum += Math.abs(i - j) * arr[j] * 2;
			answer = Math.min(answer, sum);
		}
		System.out.println(answer);
	}
}