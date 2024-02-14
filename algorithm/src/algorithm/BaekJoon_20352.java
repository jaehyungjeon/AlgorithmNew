package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : In the modern world, the spotlight has shifted entirely from live shows to televised recordings.
	Well, not entirely... One small troupe of indomitable entertainers still holds out and puts on regular circus performances.

	The shows are extremely popular. Streaming media services nearby have caught on and, of course tried to cash in by opening their own circuses.
	However, they still need good acts to pull in crowds---and the natural solution has been to sneak into the big top to poach ideas and talent.

	This can not go on. The ringmaster, inspired by his distant cousins from a small village in Armorica, proposes to build a circular wall around the big top to prevent unauthorised entry.
	Figure C.1: Diagram of the indomitable circus, fencing, and the surrounding encampments of Flixium, Fundibulum, Maximillian, and Hulum.
	This image was adapted from an illustration of the Goseck circle by Kenny Arne Lang Antonsen.
	To build this wall, enough fencing will be needed to cover a length equal to the perimeter of the circular tent. How many metres will you need to obtain?

	input
	64

	output
	28.3592616145

	Solution : 1. 단순 둘레 계산
 */

public class BaekJoon_20352 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double num = Double.parseDouble(br.readLine());
		System.out.println(Math.pow(num*Math.PI, 0.5) * 2);
	}
}
