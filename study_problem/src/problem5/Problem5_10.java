package problem5;

import java.util.Random;

public class Problem5_10 {

	public static void main(String[] args) {

		int[] data = new int[7];

		//1~10의 난수
		Random rd = new Random();
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(10)+1;
			for(int j=0; j<data[i]; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}

	}

}
