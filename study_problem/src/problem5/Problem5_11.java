package problem5;

import java.util.Random;

public class Problem5_11 {

	public static void main(String[] args) {

		int[] data = new int[5];

		//1~100의 난수
		Random rd = new Random();
		for(int i=0; i<data.length; i++) {
			data[i] = rd.nextInt(100)+1;
		}

		//모든 배열의 요소 출력
		for(int num : data) {
			System.out.print(num+" ");
		}
		System.out.println();


		//0이상~60미만
		System.out.print("0이상~60미만:");
		for(int num:data) {
			if(num>=0 && num<60) {
				System.out.print(num+" ");
			}
		}
		System.out.println();

		//60이상~80미만
		System.out.print("60이상~80미만:");
		for(int num:data) {
			if(num>=60 && num<80) {
				System.out.print(num+" ");
			}
		}
		System.out.println();

		//80이상
		System.out.print("80이상:");
		for(int num:data) {
			if(num>=80) {
				System.out.print(num+" ");
			}
		}

	}

}
