package problem5;

import java.util.Random;

public class Problem5_12 {

	public static void main(String[] args) {

		int[][] data = new int[3][3];

		//3x3배열, 0~9까지 난수
		Random rd = new Random();
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j]=rd.nextInt(10);
			}
		}

		//2차원 배열의 내용 표시
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}

	}

}
