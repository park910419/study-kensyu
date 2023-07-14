package problem5;

import java.util.Random;

public class Problem5_8 {

	public static void main(String[] args) {

		int[] data = new int[5];

		//-10~10의 난수
		Random rd = new Random();
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(21)-10;
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}
		System.out.println();


		//0보다 큰 수
		int cntBig = 0;
		for(int num:data) {
			if(num>0) {
				cntBig++;
			}
		}
		System.out.println("0보다 큰 수의 개수:"+cntBig);


		//0보다 작은 수
		int cntSmall = 0;
		for(int num:data) {
			if(num<0) {
				cntSmall++;
			}
		}
		System.out.println("0보다 작은 수의 개수:"+cntSmall);

		//0일 경우
		int cntZero = 0;
		for(int num:data) {
			if(num==0) {
				cntZero++;
			}
		}
		System.out.println("0의 개수:"+cntZero);

	}

}
