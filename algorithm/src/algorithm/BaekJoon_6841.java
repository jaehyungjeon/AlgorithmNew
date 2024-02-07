package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : Text messaging using a cell phone is popular among teenagers. The messages can appear peculiar because short forms and symbols are used to abbreviate messages and hence reduce typing.
	For example, “LOL” means “laughing out loud” and “:-)” is called an emoticon which looks like a happy face (on its side) and it indicates chuckling. This is all quite a mystery to some adults.
	Write a program that will continually input a short form and output the translation for an adult using the following translation table:
	Short Form	Translation
	CU	see you
	:-)	I’m happy
	:-(	I’m unhappy
	;-)	wink
	:-P	stick out my tongue
	(~.~)	sleepy
	TA	totally awesome
	CCC	Canadian Computing Competition
	CUZ	because
	TY	thank-you
	YW	you’re welcome
	TTYL	talk to you later

	input
	CCC
	:-)
	SQL
	TTYL

	output
	Canadian Computing Competition
	I’m happy
	SQL
	talk to you later

	Solution : 1. 케이스만 잘 쪼개면 되는 귀찮은 문제
*/

public class BaekJoon_6841 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String str = br.readLine();
			if(str.equals("TTYL")) {
				System.out.println("talk to you later");
				break;
			} else {
				switch(str) {
					case "CU" :
						System.out.println("see you");
						break;
					case ":-)" :
						System.out.println("I’m happy");
						break;
					case ":-(" :
						System.out.println("I’m unhappy");
						break;
					case ";-)" :
						System.out.println("wink");
						break;
					case ":-P" :
						System.out.println("stick out my tongue");
						break;
					case "(~.~)" :
						System.out.println("sleepy");
						break;
					case "TA" :
						System.out.println("totally awesome");
						break;
					case "CCC" :
						System.out.println("Canadian Computing Competition");
						break;
					case "CUZ" :
						System.out.println("because");
						break;
					case "TY" :
						System.out.println("thank-you");
						break;
					case "YW" :
						System.out.println("you’re welcome");
						break;
					default :
						System.out.println(str);
						break;
				}
			}
		}
	}
}