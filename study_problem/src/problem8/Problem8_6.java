package problem8;

import java.util.Random;

public class Problem8_6 {

	public static void main(String[] args) {

		Random rd = new Random();

		//분자,분모의 랜덤 값을 생성
		int num1 = rd.nextInt(10)+1;
		int num2 = rd.nextInt(9)+2;

		int num3 = rd.nextInt(10)+1;
		int num4 = rd.nextInt(9)+2;

		//분수1
		System.out.println("분수1:"+num2+"/"+num1);

		//분수2
		System.out.println("분수2:"+num4+"/"+num3);

		//분수 덧셈
		//분자
		int result2 = (num2 * num3) + (num1 * num4);
		//분모
		int result1 = (num1 * num3);

		//결과 약분
		int result3 = result3(result1, result2);
		result1 /= result3;
		result2 /= result3;

		//결과
		 if (result2 % result1 == 0) {
	            System.out.println("결과: " + result2 / result1);
	        } else if (result2 > result1) {
	            int integerPart = result2 / result1;
	            int remainder = result2 % result1;
	            System.out.println("결과: " + integerPart + " " + remainder + "/" + result1);
	        } else {
	            System.out.println("결과: " + result2 + "/" + result1);
	        }

	}

	//최대공약수
	private static int result3(int a, int b) {
		if(b==0) {
			return a;
		}
		return result3(b, a%b);

	}

}
