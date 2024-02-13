package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Mirko je nedavno otputovao u Ameriku i tamo je iznajmio moderan američki kabriolet narančaste boje s bijelim crtama, automatskim mjenjačem, navigacijom, i . . .
	prikaznikom na engleskom jeziku s imperijalnim sustavom mjera. Najviše ga muči to što je potrošnja goriva izražena u miljama po galonu, pa mu je teško procijeniti koliko mu mašina zapravo "guta" benzina.

	Napišite program koji će preračunati potrošnju goriva iz broja milja po galonu u broj litara po 100 kilometara.

	Napomena: 1 galon jednak je točno 3.785411784 litara, a 1 milja jednaka je točno 1609.344 metara.

	input
	10.00

	output
	23.521458

	Solution : 1. 계산 후 StringFormat으로 변경해준다.
 */

public class BaekJoon_14065 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double mile = Double.parseDouble(br.readLine());
		System.out.println(String.format("%.6f", ((100 / 1.609344) / mile) * 3.785411784));
	}
}