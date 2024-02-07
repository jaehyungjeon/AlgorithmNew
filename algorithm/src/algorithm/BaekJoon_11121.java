package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Classical information theory is based on the concept of a communication channel.
	Information theory is generally considered to have been founded in 1948 by Claude Shannon in his seminal work, “A Mathematical Theory of Communication.”
	The central paradigm of classical information theory is the engineering problem of the transmission of information over a noisy channel.

	http://en.wikipedia.org/wiki/Information theory

	In this problem, we will specifically consider one of the simplest possible noisy channels, namely the binary symmetric channel (BSC). A BSC transmits a sequence of bits, 
	but each transmitted bit has a probability p of being flipped to the wrong bit.

	This is called the crossover probability, as can be understood from the figure. We assume independent behaviour on different bits,
	so a communication of l bits has probability (1 − p)l of being transmitted correctly. Note that one can always assume that p < 1/2, since a channel with p = 1/2 is totally useless,
	and a channel with p > 1/2 can easily be transformed to a new channel having crossover probability 1 − p by just flipping all bits of the output.

	Of course, it is still possible to communicate over a noisy channel. (In fact, you are doing it all the time!) To be able to do this,
	one has to add extra bits in order for the receiver to detect or even possibly correct errors. Example implementations of such a feature are parity bits,

	Cyclic Redundancy Checks (CRC) and Golay codes. These are not relevant to this problem, however, so they will not be discussed here.
	In this problem you must investigate the behaviour of a binary symmetric channel.

	input
	2
	10 10
	10 11

	output
	OK
	ERROR

	Solution : 1. String으로 비교해야 한다. Integer로 치환하면 01 과 1은 동일한 값으로 인식함.
 */

public class BaekJoon_11121 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer count = Integer.parseInt(br.readLine());

		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();

			if(str1.equals(str2)) System.out.println("OK");
			else System.out.println("ERROR");
		}
	}
}