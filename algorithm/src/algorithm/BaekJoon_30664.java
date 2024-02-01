package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
	Question : Muita gente sonha em ganhar dinheiro fácil. Algumas pessoas tentam fazer isso através da loteria. 
	Compram jogos como as “raspadinhas” e bilhetes de loteria aguardando sorteios multimilionários.

	Gilmar, um rapaz muito malandro, decidiu usar seus conhecimentos matemáticos para tentar aumentar suas chances nestes jogos de sorte. 
	Ele comprou vários bilhetes de um mesmo tipo de raspadinha e analisou as cartelas, até que percebeu uma propriedade muito curiosa: 
	cada raspadinha tinha impresso um número identificador do cartão que permitia a ele ter noção das chances de ser premiado.

	De cada 10 cartões que comprou na banca, aproximadamente 1 ou 2 vinham premiados de alguma forma: 
	no mínimo uma outra raspadinha grátis ele ganhava, ou um prêmio simbólico em dinheiro. 
	Quando aplicou seu método para escolher que cartões comprar, percebeu que de cada 10 cartões, em média 8 continham algum prêmio!

	Como a tarefa é muito cansativa para ser feita manualmente, ele pensou que você, amigo de longa data, 
	poderia ajudá-lo com um programa que, dado o número identificador do cartão, 
	diz se ele faz parte do conjunto de cartões com maior chance de prêmio. O truque é procurar os cartões cujo número identificador 
	seja múltiplo de 42. Você está apto a ajudar seu colega nesta empreitada?

	input
	42
	17283940536172938433
	17283940536172938432
	10000000000000000000
	0

	output
	PREMIADO
	TENTE NOVAMENTE
	PREMIADO
	TENTE NOVAMENTE

	Solution : 1. EOF문을 이용한 break처리가 핵심!
*/

public class BaekJoon_30664 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = br.readLine();
			BigInteger num = new BigInteger(str);

			if(num.equals(new BigInteger("0"))) break;

			if(num.remainder(new BigInteger("42")).equals(new BigInteger("0"))) {
				System.out.println("PREMIADO");
			} else {
				System.out.println("TENTE NOVAMENTE");
			}
		}
	}
}
