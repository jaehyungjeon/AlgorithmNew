package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
	Question : การสอบวัดความรู้ระดับพื นฐานด้าน IT หรือ IP (IT Passport Examination) มีข้อสอบ 100 ข้อ ข้อละ 1 คะแนน คิดเป็น 100% ขอบเขตเนื อหามี 3 หมวดได้แก่

	Strategy (กลยุทธ์) 35%
	Management (การจัดการ IT) 25%
	Technology (เทคโนโลยี) 40%
	เกณฑ์การสอบผ่าน ผู้เข้าสอบต้องได้คะแนนรวมไม่ตํากว่า 55% และ ต้องได้คะแนนในแต่ละหมวดไม่ตํLากว่า 30% ของคะแนนในหมวดนั น

	จงเขียนโปรแกรมประเมินผลการสอบนี  

	input
	5
	12345601 10 20 30
	12345610 15 15 25
	12345615 15 15 30
	12345620 15 7 33
	12345432 11 12 35

	output
	12345601 60 FAIL
	12345610 55 PASS
	12345615 60 PASS
	12345620 55 FAIL
	12345432 58 PASS

	Solution : 1. 케이스 비교하기가 좀 귀찮았다...
 */

public class BaekJoon_11257 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Integer count = Integer.parseInt(br.readLine());

		Double basicStrategy = 35 * 0.3;
		Double basicManagement = 25 * 0.3;
		Double basicTechnology = 40 * 0.3;
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			String strategy = st.nextToken();
			String management = st.nextToken();
			String technology = st.nextToken();

			Double doubStar = Double.parseDouble(strategy);
			Double doubMana = Double.parseDouble(management);
			Double doubTech = Double.parseDouble(technology);
			Integer total = Integer.parseInt(strategy) + Integer.parseInt(management) + Integer.parseInt(technology);

			sb.append(num).append(" ");
			sb.append(total).append(" ");
			if(!(doubStar >= basicStrategy && doubMana >= basicManagement && doubTech >= basicTechnology) || total < 55) {
				sb.append("FAIL");
			} else {
				sb.append("PASS");
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}
}