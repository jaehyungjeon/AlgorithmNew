package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
	Question : 천하제일의 장수 관우도 결국 죽음을 맞이했다. 유비와 장비는 관우의 복수를 위해 
	$N$명의 용의자 중 관우를 죽인 범인을 찾으려 한다. 관우와 함께 있었던 장수의 말에 따르면 관우를 죽인 범인의 이름에는 S가 들어간다. 관우를 죽인 용의자 이름의 리스트에서 관우를 죽인 범인의 이름을 찾는 프로그램을 작성하시오.

	input
	3
	ZHOUYU
	SUNQUAN
	ZOZO

	output
	SUNQUAN

	Solution : 1. 'S'가 들어가는 char를 찾아서 리턴해준다. 
*/

public class BaekJoon_30501 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());
		for(int i=0; i<count; i++) {
			String str = br.readLine();
			for(char c : str.toCharArray()) {
				if(c == 'S') {
					sb.append(str);
					break;
				}
			}
		}

		System.out.println(sb.toString());
	}
}