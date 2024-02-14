package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Pelle är programmeringslärare på Pelles Optimeringsskola (PO-skolan). Han håller nu på att sätta betyg på sina elever i kursen Optimering $1$.

	Betygsättning går till på följande vis. Totalt finns det $x$ A-kriterier, $y$ C-kriterier och $z$ E-kriterier som används.
	För att få betyget E måste man uppfylla samtliga E-kriterier. För att få betyget C måste man uppfylla samtliga C- och E-kriterier. För att få betyget A måste man uppfylla samtliga A-, C- och E-kriterier.

	Dessutom finns det två speciella betyg. Om man uppfyller alla E-kriterier och minst hälften av C-kriterierna får man ett D. Om man uppfyller alla E- och C-kriterier och minst hälften av A-kriterierna får man ett B.

	Pelle tycker det är väldigt jobbigt att sätta betyg, och behöver din hjälp.
	Skriv ett program som tar emot antalet A-, C- och E-kriterier en viss elev har uppfyllt och skriver ut vilket betyg eleven ska ha. Du kan anta att eleven alltid fick minst E i kursen.

	input
	10 10 10
	9 10 10

	output
	B

	Solution : 1. 가지치기를 계속 해야했던 문제.
*/

public class BaekJoon_20839 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double A = Double.parseDouble(st.nextToken());
		Double C = Double.parseDouble(st.nextToken());
		Double E = Double.parseDouble(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Double AScore = Double.parseDouble(st.nextToken());
		Double CScore = Double.parseDouble(st.nextToken());
		Double EScore = Double.parseDouble(st.nextToken());
		if (AScore >= A && CScore >= C && EScore >= E) {
			System.out.println("A");
		} else if (CScore >= C && EScore >=E) {
			if(AScore >= A*0.5) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} else if (EScore >= E) {
			if(CScore >= C*0.5) {
				System.out.println("D");
			} else {
				System.out.println("E");
			}
		} 
	}
}