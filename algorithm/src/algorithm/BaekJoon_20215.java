package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : A large coffee spill in the warehouse of the Busy Association of Papercutters on Caffeine has stained the corners of all paper in storage.
	In order to not waste money, it was decided that these dirty corners should be cut off of all pieces of paper.

	A few members loudly proclaim that cuts should be made diagonally, while other members say that cutting the corner out as a rectangle is the better option. Both parties claim their method is better.

	You decide to end this discussion once and for all, telling the rectangle-cutters that their method is slower. You set out to show them the following: given a piece of paper which has a $w$ by 
	$h$ corner that is stained with coffee that needs to be to cut off, how much more effort is it to cut out the whole rectangle compared to cutting along the diagonal?

	input
	12 7

	output
	5.107556011

	Solution : 1. 피타고라스의 정리를 이용하여 구한 대각선의 길이를 활용하여 밑변+높이의 합에서 차감해준다.
*/

public class BaekJoon_20215 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer w = Integer.parseInt(st.nextToken());
		Integer h = Integer.parseInt(st.nextToken());
		System.out.println(w+h - Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2)));
	}
}
