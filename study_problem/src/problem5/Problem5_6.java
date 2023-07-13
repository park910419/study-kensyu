package problem5;

import java.util.Random;

public class Problem5_6 {

	public static void main(String[] args) {

		int[] data = new int[10];
		Random rd = new Random();

		//1~10의 난수
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(10)+1;
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}
		System.out.println();

		//
		int max = data[0];
		int min = data[0];
		int sum = data[0];

		for(int i=1; i<data.length; i++) {
			if(data[i] > max) {
				max=data[i];
			}

			if(data[i] < min) {
				min=data[i];
			}

			sum += data[i];
		}

		double avg = (double)sum/data.length;

		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("평균값:"+avg);

	}

}
