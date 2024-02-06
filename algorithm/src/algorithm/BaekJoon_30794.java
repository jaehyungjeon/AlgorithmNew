package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 게임 클럽 오디션의 scoring system과 문제에서의 scoring system이 다름에 주의하세요.

	가희는 클럽 오디션을 하고 있습니다. 이 게임에는 여러 모드가 있는데 가희는 8키 모드를 하고 있습니다. 8키 모드에서는 레벨이 6 이상인 키 노트가 등장합니다. 레벨이 $lv$인 키 노트 안에는 $lv$개의 키가 있습니다.
	키의 방향은 8 방향 중 (상, 하, 좌, 우, 좌상, 좌하, 우상, 우하) 하나입니다.

	[그림 1] 레벨 6의 키 노트
	[그림 1]은 4개의 그림으로 구성되어 있습니다. 노란색으로 칠해져 있는 것은 이미 친 키를, 파란색으로 칠해진 것은 쳐야 하는 키를 의미합니다. 예를 들어, 그림 1의 오른쪽 위의 경우 좌하, 우, 우상, 하 순서대로 쳐야 함을 의미합니다.
	1번째 줄의 왼쪽 위는 레벨 6의 키 노트가 나타난 직후입니다. 오른쪽 위 그림은 키 노트가 나오고 나서 1/4 타이밍만큼 지났을 때를 나타냅니다. 왼쪽 아래 그림은 레벨 6의 키 노트가 나오고 1/2 타이밍만큼 지났을 때를 나타냅니다. 이 때 6개의 키를 모두 친 상태입니다.
	오른쪽 아래 그림은 타이밍에 맞게 Space키를 눌러서 perfect 판정을 획득한 것을 나타냅니다.
	각 키 노트는 판정이 있습니다. 이 때 아래 2가지 경우는 miss 판정이 발생합니다.

	lv개의 방향을 올바르게 입력하지 않은 경우 Space를 누르지 않았거나 Space를 눌렀을 때 타이밍을 맞추지 못한 경우 그렇지 않으면 bad, cool, great, perfect 판정 중 하나가 발생합니다. 또한 perfect는 한 가지 상태가 더 있습니다.
	바로 $n$연팩. $n$번 연속 perfect 판정이 난 상태를 $n$연팩이라 합니다. 발생한 키 노트의 판정이 perfect일 때 이전 판정이 perfect가 아닌 경우 $1$연팩입니다.
	이전 판정이 perfect이고 $k$연팩 상태였다면 $k+1$연팩이 됩니다. 레벨이 $lv$인 키 노트의 판정에 따른 점수 획득은 아래와 같습니다.
	miss일 때 $0$점을 받습니다. bad일 때 $200$에 $lv$을 곱한 점수를 받습니다. cool일 때 $400$에 $lv$을 곱한 점수를 받습니다.
	great일 때 $600$에 $lv$을 곱한 점수를 받습니다.
	perfect $n$연팩일 때 $n \cdot lv$에 $1\,000$을 곱한 점수를 받습니다.
	가희가 친 키 노트의 레벨 $lv$과 판정이 주어집니다. 가희가 이전에 받은 판정과 다른 판정을 받았을 때 획득한 점수를 구해주세요.

	input
	6 miss
	------
	7 perfect

	output
	0
	------
	7000

	Solution : 1. 문제가 길기만 할 뿐.. 쉬운 문제
*/

public class BaekJoon_30794 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer lv = Integer.parseInt(st.nextToken());
		String judge = st.nextToken();

		if(judge.equals("miss")) {
			System.out.println(0);
		} else if(judge.equals("bad")) {
			System.out.println(200*lv);
		} else if(judge.equals("cool")) {
			System.out.println(400*lv);
		} else if(judge.equals("great")) {
			System.out.println(600*lv);
		} else if(judge.equals("perfect")) {
			System.out.println(1000*lv);
		}
	}
}