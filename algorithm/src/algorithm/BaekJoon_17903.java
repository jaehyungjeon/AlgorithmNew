package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : It’s time for the annual 3-SAT competition, where the contestants compete to answer as many instances of 3-SAT as possible within the time limit.
	3-SAT is a classic NP-complete problem, where you are given a boolean formula in conjunctive normal form, in which we have a set of clauses each consisting of exactly three literals.
	Each literal refer either positively or negatively to a variable, which can be assigned a value of either True or False.
	The question is whether there exists an assignment to the variables such that every clause evaluates to True.
	No clause will contain duplicates of a literal (however it is possible that a clause contain both ¬xi and xi).
	An example of a 3-SAT instance is shown below (from sample input 1):

	(¬x1 ∨ x2 ∨ x3) ∧ (¬x1 ∨ ¬x2 ∨ x3) ∧ (x1 ∨ ¬x2 ∨ x3) ∧ (x1 ∨ ¬x2 ∨ ¬x3) ∧ (x1 ∨ x2 ∨ ¬x3)

	Øyvind is a judge in the competition, responsible for verifying the quality of problem instances crafted by the other judges before the contest starts.
	Øyvind hates 3-SAT instances with less than eight clauses – as these are always satisfiable they provide no real challenge for the contestants.
	Therefore, he will deem such problem instances to be unsatisfactory.
	Whenever Øyvind encounters an instance with eight or more clauses he knows that it is a real challenge to figure out whether this instance is satisfiable or not –
	and therefore he will judge these problem instances to be satisfactory. Given an instance of 3-SAT, can you help find Øyvind’s judgement?

	input
	5 3
	-1 2 3
	-1 -2 3
	1 -2 3
	1 -2 -3
	1 2 -3

	output
	unsatisfactory

	Solution : 1. 규칙은 8이 넘어가면 satis, 미만일 경우 unsatis를 반환하는 규칙이다.
 */

public class BaekJoon_17903 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer count = Integer.parseInt(st.nextToken());
		System.out.println(count >= 8 ? "satisfactory" : "unsatisfactory");
	}
}