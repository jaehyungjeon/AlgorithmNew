package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashSet;

/*
	Question : Jerry has earned acclaim as a renowned coach in the highly competitive realm of 
	the International Collegiate Programming Contest (ICPC). 
	His coaching prowess is exemplified by his unique approach 
	— meticulously training his students to excel in ICPC competitions by harnessing the power of Java,
	a programming language seldom utilized in this arena. Consequently, 
	Jerry's teams have become synonymous with excellence and are affectionately known as the "Java Warriors."

	Jerry coaches $n$ teams to compete in the 2023 ICPC Taoyuan Regional Contest. The registration fee is 
	$4000$ dollars per team, and Jerry does not have enough funds to pay for all Java Warriors. 
	Jerry, facing a financial challenge in coaching multiple teams for the 2023 ICPC Taoyuan Regional Contest, 
	prays to God with a heartfelt and sincere prayer.

	"Dear God,
	I come before you today with a humble heart and a deep desire to help my teams compete in the international collegiate programming contest.
	The registration fee is a significant hurdle, and I find myself lacking the funds needed to support them all.

	I pray for your guidance and assistance, not only for myself but for the talented students who have put their trust in me as their coach. 
	Please provide us with the resources necessary to cover the registration fees for these teams.

	I understand that this contest is not just about winning but about fostering learning, 
	teamwork, and growth in these young minds. Help us to overcome this financial obstacle 
	so that we can continue to nurture their skills and aspirations.

	I also pray for the wisdom to make the best decisions and the determination to explore all available options to secure the funds needed. 
	If it is your will, open doors for us, connect us with individuals or organizations willing to support our cause, 
	or inspire creative solutions to meet our financial needs.

	Thank you, God, for hearing my prayer and for being a source of strength and guidance. 
	I place my trust in you, knowing that with your help, we can overcome this challenge.

	In your holy and gracious name, I pray,

	Amen."

	Upon hearing his heartfelt prayer, deeply moved by his sincerity and dedication, 
	you are inspired to extend your support by covering the registration fees for the Java Warriors. 
	Now, the question arises: how much should you donate to enable Jerry's teams to compete in the 2023 ICPC Taoyuan Regional Contest?

	input
	1

	output
	4000

	Solution : 1. 큰 수가 나올 경우를 대비하여 BigInteger 사용.
*/

public class BaekJoon_30328 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger num = new BigInteger(br.readLine());

		System.out.println(num.multiply(new BigInteger("4000")));
	}
}
