package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
	Question : Жюри Russian Code Cup приготовило большое количество различных интересных задач. Но все они не нравятся председателю жюри. Он говорит, что все они слишком сложные.
	А для того, чтобы больше участников решило хотя бы одну задачу, нужна простая задача.

	Председатель жюри называет задачу простой, если у нее существует решение, использующее не более одного оператора ветвления и не более двух операторов цикла, либо решение,
	использующее не более двух операторов ветвления и не более одного оператора цикла. Члены жюри подготовили n различных задач с решениями и представили их на рассмотрение председателю жюри.
	Он подсчитал количество операторов ветвления и операторов циклов в решении каждой задачи и теперь хочет понять, какие из преложенных ему задач являются простыми.

	Вам дано n описаний задач, каждое описание представляет собой два числа: количество операторов ветвления и количество операторов цикла, использующихся в решении задачи.

	Необходимо для каждой задачи выяснить, является ли она простой.

	input
	2
	2 1
	2 2

	output
	Yes
	No

	Solution : 1. 단순한 조건 문제
*/

public class BaekJoon_22155 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Integer jo = Integer.parseInt(st.nextToken());
			Integer re = Integer.parseInt(st.nextToken());
			if((jo <= 1 && re <= 2) || (jo <= 2 && re <=1)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}