package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Миша уже научился хорошо фотографировать и недавно увлекся программированием. Первая программа, которую он написал, позволяет формировать негатив бинарного черно-белого изображения.
	Бинарное черно-белое изображение – это прямоугольник, состоящий из пикселей, каждый из которых может быть либо черным, либо белым.
	Негатив такого изображения получается путем замены каждого черного пикселя на белый, а каждого белого пикселя – на черный.
	Миша, как начинающий программист, написал свою программу с ошибкой, поэтому в результате ее исполнения мог получаться некорректный негатив.
	Для того чтобы оценить уровень несоответствия получаемого негатива изображению, Миша начал тестировать свою программу. 
	В качестве входных данных он использовал исходные изображения. Сформированные программой негативы он начал тщательно анализировать, каждый раз определяя число пикселей негатива, которые получены с ошибкой. 
	Требуется написать программу, которая в качестве входных данных использует исходное бинарное черно-белое изображение и полученный Мишиной программой негатив, и на основе этого определяет количество пикселей,
	в которых допущена ошибка.

	input
	3 4
	WBBW
	BBBB
	WBBW

	BWWW
	WWWB
	BWWB

	output
	2

	Solution : 1. 두 배열의 비교
*/

public class BaekJoon_21665 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer row = Integer.parseInt(st.nextToken());
		Integer col = Integer.parseInt(st.nextToken());
		Integer count = 0;
		char[][] arr1 = new char[row][col];

		for(int i=0; i<row; i++) {
			String str = br.readLine();
			for(int j=0; j<col; j++) {
				if(str.charAt(j) == 'W') arr1[i][j] = 'B';
				else arr1[i][j] = 'W';
			}
		}

		br.readLine();

		for(int i=0; i<row; i++) {
			String str = br.readLine();
			for(int j=0; j<col; j++) {
				if(str.charAt(j) != arr1[i][j]) count++;
			}
		}

		System.out.println(count);
	}
}