package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : VE OCH FASA! PostNord har för det $1337$:e året i rad höjt portot, vilket riskerar att bräcka Programmeringsolympiadens budget.

	Varje år skickar PO ut affischer till ca $450$ gymnasieskolor. Ett utskick består av tre saker: 

	ett kuvert av C4-storlek ($229\text{ mm} \times 324\text{ mm}$)två affischer av A3-storlek ($297\text{ mm} \times 420\text{ mm}$)ett informationsblad av A4-storlek ($210\text{ mm} \times 297\text{ mm}$)
	Det är mycket viktigt att brevet väger högst $50$ gram, eftersom portot annars blir dubbelt så högt.
	För att klara denna magiska viktgräns kan PO styra över vilken sorts papper som används för de tre sakerna. Varje sort har en ytvikt (vikt per area) som typiskt anges i 

	$\frac{\text{gram}}{\text{m}^2}$. Notera att kuvertet består av två sammanklistrade ark av C4-storlek, medan ytvikter och ovanstående mått gäller för ett ark.
	Skriv ett program som räknar ut den totala vikten för ett brev.

	input
	120 90 70

	output
	44.626140

	Solution : 1. C4와 A3는 두장씩이므로 계산해주면 된다.
*/

public class BaekJoon_24183 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double C4 = Double.parseDouble(st.nextToken()) * 229 * 324 * 2;
		Double A3 = Double.parseDouble(st.nextToken()) * 297 * 420 * 2;
		Double A4 = Double.parseDouble(st.nextToken()) * 210 * 297;

		System.out.println(String.format("%.6f", (C4 + A3 + A4) * 0.000001));
	}
}
