package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : It’s hard to construct a problem that’s so easy that everyone will get it, 
	yet still difficult enough to be worthy of some respect. Usually, we err on one side or the other. 
	How simple can a problem really be?

	Here, as in Celebrity Jepoardy, questions and answers are a bit confused, and, 
	because the participants are celebrities, there’s a real need to make the challenges simple. 
	Your program needs to prepare a question to be solved --- an equation to be solved --- given the answer. 
	Specifically, you have to write a program which finds the simplest possible equation to be solved given the answer, 
	considering all possible equations using the standard mathematical symbols in the usual manner. In this context, 
	simplest can be defined unambiguously several different ways leading to the same path of resolution. 
	For now, find the equation whose transformation into the desired answer requires the least effort.

	For example, given the answer X = 2, you might create the equation 9 – X = 7.
	Alternately, you could build the system X > 0; X^2 = 4. These may not be the simplest possible equations. 
	Solving these mind-scratchers might be hard for a celebrity.

	input
	Y = 3
	X=9	

	output
	Y = 3
	X=9

	Solution : 1. EOF를 이용해야 할듯!
			   2. String값이 비어있으면 바로 break처리
*/

public class BaekJoon_3765 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while((str = br.readLine()) != null) {
			if(str == "") break;
			else System.out.println(str);
		}
	}
}
