package problem5;

import java.util.Random;

public class Problem5_7 {

	public static void main(String[] args) {

		int[] data = new int[5];

		//1~10의 난수
		Random rd = new Random();
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(10)+1;
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}
		System.out.println();

		//합계, 평균
		int sum = data[0];
		for(int i=1; i<data.length; i++) {
			sum += data[i];
		}

		double avg = (double)sum/data.length;

		System.out.println("합계값:"+sum);
		System.out.println("평균값:"+avg);

		//평균보다 큰 수
		System.out.print("평균보다 큰 수:");
		for(int num:data) {
			if(num>avg) {
				System.out.print(num+" ");
			}
		}

		System.out.println();

		//평균보다 작은 수
		System.out.print("평균보다 작은 수:");
		for(int num:data) {
			if(num<avg) {
				System.out.print(num+" ");
			}
		}

	}

}
