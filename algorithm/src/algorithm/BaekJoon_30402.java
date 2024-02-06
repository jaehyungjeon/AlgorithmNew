package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : 춘배와 나비, 영철은 어느 날 지구에 나타난 UFO에게 감마선을 맞을 뻔했다. 다행히도 감마선은 행복하게 뒹굴고 있던 고양이들 옆에 있던 컴퓨터에 맞았지만,
	이로 인해 컴퓨터에 저장된 춘배와 나비, 영철의 소중한 사진들의 픽셀이 모두 섞이는 사태가 발생했다!
	더 이상 형체를 알아볼 수 없게 된 사진들을 보며 슬퍼하던 고양이들은 사진 복구로 유명한 전문가에게 사진의 복구를 맡기기로 했다.
	자신의 사진을 다른 고양이가 보는 게 싫었던 춘배는 사진 복구를 맡기기 전에 당신에게 사진을 분류해 주는 프로그램을 만들어 달라고 부탁하였다.

	프로그램은 주어진 사진이 어떤 고양이의 사진인지 구분해야 한다. 하얀색(w)이 존재한다면 춘배, 검은색(b)이 존재한다면 나비, 회색(g)이 존재한다면 영철의 사진이다.
	사진은 고양이(w, b, g) 또는 배경(r, o, y, p)으로 이루어져 있으며 한 사진에 고양이는 무조건 1마리만 나온다.
	입력으로 주어진 사진이 어떤 고양이의 사진인지 구분해 주자.

	input
	p o o y r y p o y r p r r o p
	y w w y w r w y w p w w w r y
	r w y r w r w w w y r p w w o
	r p w w w w w y w w o w o r w
	y w w w r o p w o r r w p p w
	y y w w w o w p o w r p p o o
	p w p w p y o p w w w w p y w
	y w y o w o w o o o w o w w p
	y o w w y w w w r w o p w w p
	p w p y w w o w o r w w p r y
	p p w w w w y r w w w y y o w
	p w p w w w w o o p o w p w p
	y p o y w p w w w w w w r w p
	p y r w w w w w o w w p o y w
	o r w w y y y w w o o y y r w

	output
	chunbae

	Solution : 1. 엔터 때문에 안됐는지.. 몇번 실패함
			   2. 결국 StringBuilder를 활용하여 해결하였다.
*/

public class BaekJoon_30402 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean breakPoint = false;
		for(int i=0; i<15; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			for(int j=0; j<15; j++) {
				String code = st.nextToken();
				if(code.equals("w")) {
					sb.append("chunbae");
					breakPoint = true;
					break;
				} else if(code.equals("b")) {
					sb.append("nabi");
					breakPoint = true;
					break;
				} else if(code.equals("g")) {
					sb.append("yeongcheol");
					breakPoint = true;
					break;
				}
			}
			if(breakPoint) break;
		}

		System.out.print(sb.toString());
	}
}