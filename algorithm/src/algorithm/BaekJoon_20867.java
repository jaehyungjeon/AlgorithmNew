package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : Paulina Osqulda (Osqulda är en studentikos benämning på teknologer som studerar vid Kungliga Tekniska högskolan i Stockholm, se https://sv.wikipedia.org/wiki/Osquar_och_Osqulda.)
	pluggar på KTH i Stockholm, och åker varje morgon till skolan via tunnelbanan. När hon kommer fram till sin tunnelbanestation måste hon åka upp längs en rulltrappa för att komma ut.

	I rulltrappan bildas det ofta två olika köer. På den högra sidan av trappan ställer sig folk som vill stå still i rulltrappan,
	medan man ställer sig på den vänstra sidan om man föredrar att gå i rulltrappan (för att komma upp snabbare).

	Paulina har märkt att det oftast bildas en jättelång kö till den vänstra sidan av rulltrappan, eftersom alla är så stressade till jobbet och vill kunna gå snabbt upp för rulltrappan.
	På sista tiden har hon funderat på om det kanske rentav skulle gå snabbare att istället välja den högra kön, eftersom kön där ofta är kortare.

	Rulltrappan är totalt $M$ trappsteg lång. Om man står i rulltrappan färdas man $S$ trappsteg per sekund uppåt i rulltrappan. Om man istället går i rulltrappan färdas man $G$ trappsteg per sekund uppåt.

	Totalt kan $A$ personer per sekund börja gå i rulltrappan ur den vänstra kön, medan $B$ personer per sekund kan ställa sig på rulltrappan ur den högra kön.
	Detta betyder att i början av förloppet går en person på rulltrappan. Innan en ny person går på rulltrappan måste denna vänta 
 
	$\frac{1}{A}$ (resp $\frac{1}{B}$ sekunder) för att kunna gå på rulltrappan.

	Den vänstra kön är för närvarande $L$ personer lång, och den högra är $R$ personer lång.
	Hjälp Paulina avgöra vilken kö hon ska ställa sig i, för att så snabbt som möjligt nå rulltrappans topp.

	input
	50 1 2
	1 1
	0 0

	output
	friskus

	Solution : 1. 계단의 이동에 따른 규칙을 구하는 문제
*/

public class BaekJoon_20867 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Double M = Double.parseDouble(st.nextToken());
		Double S = Double.parseDouble(st.nextToken());
		Double G = Double.parseDouble(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Double A = Double.parseDouble(st.nextToken());
		Double B = Double.parseDouble(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Double L = Double.parseDouble(st.nextToken());
		Double R = Double.parseDouble(st.nextToken());

		Double left = L/A;
		Double right = R/B;

		Double lValue = 0.0;
		Double rValue = 0.0;
		if(M%G == 0) {
			lValue = M/G+1;
		} else {
			lValue = M/G;
		}

		if(M%S == 0) {
			rValue = M/S+1;
		} else {
			rValue = M/S;
		}

		if(lValue + left < rValue + right) {
			System.out.println("friskus");
		} else {
			System.out.println("latmask");
		}
	}
}