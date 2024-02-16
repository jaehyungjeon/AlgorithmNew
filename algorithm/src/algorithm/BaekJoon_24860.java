package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Immunoglobulins also known as antibodies are protein molecules.
	Antibodies play one of the key roles in the immune reaction --- they detect harmful foreign agents --- bacteria or viruses --- and help to eliminate them.
	Every foreign molecule binds with unique type of antibody. There are plenty of potential harmful agents, so, there should be a tremendous number of immunoglobulin types to neutralize all threats.
	Huge required amount of immunoglobulin types make it impossible to encode each type in DNA. Luckily, there is a solution.

	Immunoglobulins are produced by immune cells: B-lymphocytes based on DNA information --- genes. Immunoglobulin genes are combined from DNA fragments like constructor.
	Each fragment exists in several variants and is responsible for variable region of immunoglobulin molecule. This process is called somatic recombination. 

	Immunoglobulin molecule consists of two identical heavy chains and two identical light chains. There are two types of light chains with similar structure --- $\kappa$ and $\lambda$.
	Both of two light chain types have two variable regions --- $V$ and $J$. To form a variable region one gene fragment is selected from multiple variants: 
	$V_\kappa$ and $J_\kappa$ variants for $V$ and $J$ regions respectively in $\kappa$-light chain, or $V_\lambda$ and $J_\lambda$ variants for $V$ and $J$ regions respectively in $\lambda$-light chain.

	There is only one heavy chain type with three variable regions --- $V$, $D$ and $J$. To form each of them one gene fragment from $V_h$, $D_h$ and $J_h$ variants respectively is selected.

	You need to count how many possible immunoglobulin molecules can be produced for given values of $V_\kappa$, $J_\kappa$, $V_\lambda$, $J_\lambda$, $V_h$, $D_h$ and $J_h$.

	input
	40 5
	41 6
	50 30 6

	output
	4014000

	Solution : 1. 문제는 어려운데 계산식은 단순..
*/

public class BaekJoon_24860 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long vk = Long.parseLong(st.nextToken());
		Long jk = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Long va = Long.parseLong(st.nextToken());
		Long ja = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Long vh = Long.parseLong(st.nextToken());
		Long dh = Long.parseLong(st.nextToken());
		Long jh = Long.parseLong(st.nextToken());

		Long heavy = vh * dh * jh;
		Long k = vk * jk;
		Long l = va * ja;
		Long total = heavy * (k + l);

		System.out.println(total);
	}
}
