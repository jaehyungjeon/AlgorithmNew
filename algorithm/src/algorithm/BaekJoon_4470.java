package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 원섭이는 잉글랜드 4부리그 풋볼 리그 2에서 활약하는 AFC 윔블던을 좋아한다. 
	이 팀은 2002년 윔블던 FC가 밀턴 킨스로 연고 이전을 감행하자 윔블던의 서포터들이 스스로 나서 창단한 팀이다. 
	윔블던 FC는 1988년에 당시 최고의 팀인 리버풀을 꺾고 FA컵을 우승하면서 엄청난 활약을 했었다. 
	하지만 1989년 4월 15일 축구역사상 최대 비극적인 사건 중 하나인 힐스보로 참사가 발생하였고, 1990년 1월 테일러 리포트가 발표되었다. 
	1991년, 상위권 리그 팀은 반드시 홈 경기장을 좌석제로 바꿔야 한다는 테일러 리포트의 내용에 따라 윔블던은 홈 구장이었던 플로 레인을 떠나게 되었다. 
	이때부터 10년동안 임시로 근처 클럽이었던 크리스털 팰리스와 경기장을 공유하기 시작했고 점점 재정적인 어려움을 겪었다. 
	결국 2002년 윔블던에서 약 90km정도 떨어진 밀턴 킨스로 연고지를 이전하는 초유의 사태가 벌어졌으며, 2004년 윔블던 FC는 파산하게 된다. 
	윙클만은 클럽을 산 뒤, 7월 클럽의 이름을 밀턴 킨스 돈스 FC(이하 MK 돈스)로 바꾼다.

	한국에서 이 소식을 들은 원섭이는 엄청난 분노했고, 어서 빨리 MK 돈스를 경기장에서 이기는 모습을 보고싶어했다.

	하지만, MK 돈스는 2004년 3부리그에 참가했지만, 그 때 AFC 윔블던은 8부리그에 참가하고 있었다. 두 팀이 공식 경기에서 만나려면 FA Cup밖에 기회가 없었다. 
	하지만, FA Cup은 하부 리그 팀은 낮은 라운드부터 대회에 참가하고, 대진은 추첨이므로 두 팀이 만나는 것은 불가능하다 생각했다.

	AFC 윔블던은 2002년 클럽의 역사를 9부리그에서 시작했지만, 2004년 8부리그, 2005년 7부리그, 2008년 6부리그, 2009년 5부리그로 점점 승격하였다. 
	그리고 2011년, 창단 9년만에 AFC 윔블던은 4부리그(리그2)에 승격하였다.

	MK 돈스는 2004년부터 2시즌(06-07, 07-08)을 제외하고는 항상 3부리그에서 활동했다. 이제 MK 돈스가 강등당하거나 AFC 윔블던이 승격을 하면 리그에서 두 팀간의 경기를 볼 수 있다.

	2012년 12월 2일. 불가능할 것 같았던 사건이 일어났다. 2012-13 FA Cup 2라운드 에서 두 팀이 맞붙게 된 것이었다. 
	어서 빨리 이 경기를 보고 싶었던 원섭이는 FA Cup을 중계해주는 SBS ESPN의 편성표를 검색해보았다. 
	하지만, 두 팀간의 경기는 한국인에게 별로 관심을 끌지 못하는 경기였기 때문에, 중계가 예정되어 있지 않았다.

	원섭이는 잉글랜드에 거주하는 지수에게 경기 결과를 물어봤다. 지수는 축구에는 큰 관심이 없지만 원섭이를 괴롭히는 것을 좋아하는 친구다. 
	지수는 두 팀의 최종 점수를 알려주는 대신, 두 팀이 득점한 점수의 합과 차를 알려주었다.

	MK 돈스와 AFC 윔블던의 점수의 합과 차가 주어졌을 때, 최종 점수를 구하는 프로그램을 작성하시오.

	참고로 우리나라도 비슷한 경우가 있다. 2007년 부천 SK의 제주 연고지 이전을 반대하던 서포터들은 부천FC 1995를 창단했다. 
	이 팀은 2013년부터 K리그에 참가한다. 또, AFC 윔블던과 자매 결연 관계를 맺고 있다.

	input
	3 1

	output
	2 1

	Solution : 1. 두 값의 합산 / 2 => MAX
	 		   2. TOTAL - MAX = MIN
	 		   3. MAX값이 없으면 -1 RETURN
*/

public class BaekJoon_4299 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer sum = Integer.parseInt(st.nextToken());
		Integer minus = Integer.parseInt(st.nextToken());

		Integer total = sum + minus;
		if(total % 2 != 0 || sum < minus) {
			System.out.println("-1");
		} else {
			Integer count = total / 2;
			Integer count1 = sum - count;

			System.out.println(Math.max(count, count1) + " " + Math.min(count, count1));
		}
	}
}
