package problem8;

import java.util.Random;

public class Problem8_4 {

	public static void main(String[] args) {

		//1~1000까지 난수
		Random rd = new Random();
		int num = rd.nextInt(1000)+1;
		int cnt = cntNumber(num);

		System.out.println("랜덤숫자:"+num);
		System.out.println("자리수:"+cnt);

	}

	private static int cntNumber(int num) {
		if(num == 0) {
			return 1;
		} else {
			int count = 0;
			while (num != 0) {
				num /= 10;
				count++;
			}
			return count;
		}
	}
}
