package problem5;

import java.util.Random;

public class Problem5_3 {

	public static void main(String[] args) {

		int[] data = new int[10];
		Random rd = new Random();

		//1~100의 난수
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(100)+1;
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}
		System.out.println();

		//
		System.out.print("홀수:");
		for(int num : data) {
			if(num % 2 != 0) {
				System.out.print(num+" ");
			}
		}
		System.out.println();

		//
		System.out.print("짝수:");
		for(int num : data) {
			if(num % 2 == 0) {
				System.out.print(num+" ");
			}
		}
		System.out.println();



	}

}
