package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 한글의 각 글자는 초성, 중성, 종성으로 이루어져 있고, 이 세 가지를 모아써서 한 글자를 나타낸다.

	초성은 ㄱ, ㄲ, ㄴ, ㄷ, ㄸ, ㄹ, ㅁ, ㅂ, ㅃ, ㅅ, ㅆ, ㅇ, ㅈ, ㅉ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ로 총 19개가 있고, 중성은 ㅏ, ㅐ, ㅑ, ㅒ, ㅓ, ㅔ, ㅕ ㅖ, ㅗ, ㅘ, ㅙ, ㅚ, ㅛ, ㅜ, ㅝ, ㅞ, ㅟ, ㅠ, ㅡ, ㅢ, ㅣ로 총 21개, 
	종성은 없음, ㄱ, ㄲ, ㄳ, ㄴ, ㄵ, ㄶ, ㄷ, ㄹ, ㄺ, ㄻ, ㄼ, ㄽ, ㄾ, ㄿ, ㅀ, ㅁ, ㅂ, ㅄ, ㅅ, ㅆ, ㅇ, ㅈ, ㅊ, ㅋ, ㅌ, ㅍ, ㅎ로 총 28개가 있다.

	첫 번째 글자는 초성에서 ㄱ, 중성에서 ㅏ, 종성에서 없음을 합친 "가"가 되고, 두 번째 글자는 초성에서 ㄱ, 중성에서 ㅏ, 종성에서 ㄱ을 합친 "각"이 된다. 마지막 글자는 초성에서 ㅎ, 중성에서 ㅣ, 종성에서 ㅎ를 합친 "힣"이 된다.

	초성과 중성, 그리고 종성을 합쳐서 만들 수 있는 글자의 개수는 총 19*21*28 = 11,172개가 된다.

	입력으로 N이 주어졌을 때, N번째 글자를 구하는 프로그램을 작성하시오.

	input
	1

	output
	가

	Solution : 1. 정수값을 이용하여 char로 변환하는 문제!
*/

public class BaekJoon_11282 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer num = Integer.parseInt(br.readLine());

		Integer cho = 19;
		Integer jung = 21;
		Integer jong = 28;

		int charIdx = num - 1;

		Integer Jong = charIdx % jong;
		charIdx /= jong;

		Integer Jung = charIdx % jung;
		charIdx /= jung;

		Integer Cho = charIdx;

		char c = (char)('가' + Cho * 21 * 28 + Jung * 28 + Jong);
		System.out.println(c);
	}
}