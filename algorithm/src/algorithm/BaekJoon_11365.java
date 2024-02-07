package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 당신은 길을 가다가 이상한 쪽지를 발견했다. 그 쪽지에는 암호가 적혀 있었는데, 똑똑한 당신은 암호가 뒤집으면 해독된다는 것을 발견했다.

	이 암호를 해독하는 프로그램을 작성하시오.

	input
	!edoc doog a tahW
	noitacitsufbo
	erafraw enirambus detcirtsernu yraurbeF fo tsrif eht no nigeb ot dnetni eW
	lla sees rodroM fo drol eht ,ssertrof sih nihtiw delaecnoC
	END

	output
	What a good code!
	obfustication
	We intend to begin on the first of February unrestricted submarine warfare
	Concealed within his fortress, the lord of Mordor sees all

	Solution : 1. charArr을 뒤집어주면 된다.
 */

public class BaekJoon_11365 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			char[] charArr = str.toCharArray();
			if(str.equals("END")) break;
			else {
				for(int i=charArr.length-1; i>=0; i--) {
					sb.append(charArr[i]);
				}
				sb.append("\n");
			}
		}

		System.out.println(sb.toString());
	}
}